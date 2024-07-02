package com.jk.tourguide.mvvm

import android.content.Context
import android.content.IntentFilter
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.jk.tourguide.component.NetworkChangeReceiver
import com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository
import com.jk.tourguide.extention.LanguageType
import org.koin.android.ext.android.inject
import java.lang.reflect.Method
import java.lang.reflect.ParameterizedType
import java.util.Locale

abstract class BaseActivity<V : ViewBinding> : AppCompatActivity() {

    private val sharedPreferences: CacheSharedPreferencesRepository by inject()
    private lateinit var networkChangeReceiver: NetworkChangeReceiver
    private var isNetworkConnected = true

    private var _binding: V? = null
    protected val binding get() = _binding!!

    override fun onDestroy() {
        super.onDestroy()
        cleanGarbage()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = inflateBinding()
        setContentView(binding.root)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        networkChangeReceiver = NetworkChangeReceiver {
            isNetworkConnected = it
            onNetworkChange(it)
        }
        renderLanguage()
        initView()
        initFragment()
    }

    override fun onResume() {
        super.onResume()
        registerNetworkChangeReceiver()
    }

    private fun registerNetworkChangeReceiver() {
        val intentFilter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        registerReceiver(networkChangeReceiver, intentFilter)
    }

    private fun unregisterNetworkChangeReceiver() {
        unregisterReceiver(networkChangeReceiver)
    }

    @Suppress("UNCHECKED_CAST")
    private fun inflateBinding(): V {
        val clazz =
            (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<V>
        val method: Method = clazz.getMethod("inflate", LayoutInflater::class.java)
        return method.invoke(null, layoutInflater) as V
    }

    fun isNetworkConnection(): Boolean {
        return isNetworkConnected
    }

    fun renderLanguage(language: String? = null) {
        val languageCache = sharedPreferences.getLang()
        if (language != null) {
            sharedPreferences.setLang(language)
            updateLocale(this, language)
        } else if (!languageCache.isNullOrEmpty()) {
            updateLocale(this, languageCache)
        } else {
            val selectedLanguage = when (val currentLanguage = Locale.getDefault().language) {
                LanguageType.ENGLISH.value,
                LanguageType.JAPAN.value,
                LanguageType.VIETNAM.value,
                LanguageType.TAIWAN.value,
                LanguageType.CHINA.value,
                LanguageType.SPANISH.value -> currentLanguage

                else -> LanguageType.ENGLISH.value
            }
            sharedPreferences.setLang(selectedLanguage)
            renderLanguage(selectedLanguage)
        }
    }

    private fun updateLocale(context: Context, language: String) {
        var countryValue = ""
        var languageValue = language
        when(language) {
            LanguageType.TAIWAN.value -> {
                countryValue = LanguageType.TAIWAN.valueEtx!!
                languageValue = languageValue.split(Regex("-"))[0]
            }
            LanguageType.CHINA.value -> {
                countryValue = LanguageType.CHINA.valueEtx!!
                languageValue = languageValue.split(Regex("-"))[0]
            }
        }
        val locale = Locale(languageValue,countryValue)
        Locale.setDefault(locale)
        val resources = context.resources
        val configuration = Configuration(resources.configuration)
        configuration.setLocale(locale)
        resources.updateConfiguration(configuration, resources.displayMetrics)
        recreate()
    }

    abstract fun onNetworkChange(isConnected: Boolean)
    open fun cleanGarbage() {
        unregisterNetworkChangeReceiver()
    }

    open fun initFragment() {}
    open fun initView() {}
}