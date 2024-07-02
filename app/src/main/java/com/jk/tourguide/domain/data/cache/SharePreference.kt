package com.jk.tourguide.domain.data.cache

import android.content.SharedPreferences
import android.text.TextUtils
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.jk.tourguide.extention.helper.GsonProvider

const val PREFS_NAME = "share_prefs"

class SharedPrefsApi(private val mSharedPreferences: SharedPreferences): SharedPrefs {
    override fun getInt(name: String): Int {
        return getInt(name, 0)
    }

    override fun getInt(name: String, defaultInt: Int): Int {
        return mSharedPreferences.getInt(name, defaultInt)
    }

    override fun getBoolean(name: String): Boolean {
        return getBoolean(name, false)
    }

    override fun getBoolean(name: String, defaultBoolean: Boolean): Boolean {
        return mSharedPreferences.getBoolean(name, defaultBoolean)
    }

    override fun getString(name: String, defaultString: String?): String? {
        return mSharedPreferences.getString(name, defaultString)
    }

    override fun getFloat(name: String, defaultFloat: Float): Float {
        return mSharedPreferences.getFloat(name, defaultFloat)
    }

    override fun getLong(name: String, defaultValue: Long): Long {
        return mSharedPreferences.getLong(name, defaultValue)
    }

    override fun <T> put(key: String?, data: T) {
        val editor = mSharedPreferences.edit()
        when (data) {
            is String -> {
                editor.putString(key, data)
            }

            is Boolean -> {
                editor.putBoolean(key, data)
            }

            is Float -> {
                editor.putFloat(key, data)
            }

            is Int -> {
                editor.putInt(key, data)
            }

            is Long -> {
                editor.putLong(key, data)
            }

            else -> {
                val jsonData = Gson().toJson(data)
                editor.putString(key, jsonData)
            }
        }
        editor.apply()
    }

    override fun remove(key: String?) {
        if (!TextUtils.isEmpty(key)) {
            mSharedPreferences.edit().remove(key).apply()
        }
    }

    override fun removeAll(keys: List<String?>) {
        val editor = mSharedPreferences.edit()
        for (key in keys) {
            editor.remove(key)
        }
        editor.apply()
    }

    override fun clear() {
        mSharedPreferences.edit().clear().apply()
    }

    override fun isHaveKey(key: String?): Boolean {
        return mSharedPreferences.contains(key)
    }

    // Only use to read from Object data(Json, enum...)
    override operator fun <T> get(key: String?, anonymousClass: Class<T>, defValue: T?): T? {
        val jsonData = mSharedPreferences.getString(key, null)
        return if (jsonData != null) {
            GsonProvider.get().fromJson(jsonData, anonymousClass)
        } else defValue
    }

    override fun getArrayList(key: String?): MutableList<Long?>? {
        val jsonData = mSharedPreferences.getString(key, null)
        return if (jsonData != null) {
            GsonProvider.get().fromJson(jsonData, object: TypeToken<List<Long?>?>() {}.type)
        } else null
    }

    override fun getArrayList(key: String?, defaultValue: MutableList<Long?>): MutableList<Long?> {
        val value = getArrayList(key)
        return value ?: defaultValue
    }

    override fun putArrayList(key: String?, data: List<Long?>?) {
        val editor = mSharedPreferences.edit()
        val jsonData = Gson().toJson(data)
        editor.putString(key, jsonData)
        editor.apply()
    }
}