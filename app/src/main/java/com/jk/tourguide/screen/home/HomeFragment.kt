package com.jk.tourguide.screen.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import com.jk.tourguide.R
import com.jk.tourguide.application.MainActivity
import com.jk.tourguide.component.languagedialog.LanguageSelectionDialog
import com.jk.tourguide.databinding.FragmentHomeBinding
import com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository
import com.jk.tourguide.extention.LanguageType
import com.jk.tourguide.mvvm.BaseFragmentBinding
import com.jk.tourguide.screen.category.CategoriesFragment
import com.jk.tourguide.screen.event.ActivityEventFragment
import org.koin.android.ext.android.inject


class HomeFragment : BaseFragmentBinding<FragmentHomeBinding>(R.layout.fragment_home) {


    private val sharedPreferences: CacheSharedPreferencesRepository by inject()

    override fun initView() {
        super.initView()
        binding.viewPager.adapter = MyPagerAdapter(activity as FragmentActivity)

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> getString(R.string.attraction)
                else -> getString(R.string.activity_event)
            }
        }.attach()

        binding.tvLanguage.setOnClickListener {
            val languageSelectionDialog = LanguageSelectionDialog(
                context = requireContext(),
                onItemClick = { language ->
                    (requireActivity() as MainActivity).renderLanguage(language)
                })
            languageSelectionDialog.show()
        }

        binding.tvLanguage.text =
            getString(
                R.string.language,
                getString(
                    LanguageType.getLanguageType(
                        sharedPreferences.getLang() ?: ""
                    ).displayName
                )
            )
    }
}

class MyPagerAdapter(fragmentManager: FragmentActivity) :
    FragmentStateAdapter(fragmentManager) {
        private val fragmentList = listOf(
        CategoriesFragment(),
        ActivityEventFragment()
    )
    private val fragmentCache = mutableMapOf<Int, Fragment>()

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentCache.getOrPut(position) {
            fragmentList[position]
        }
    }
}