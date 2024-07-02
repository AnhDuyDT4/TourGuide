package com.jk.tourguide.domain.data.cache


class CacheSharedPreferencesRepository(private val sharedPrefs: SharedPrefs) {

    companion object {
        private const val LANG_KEY = "lang"
    }

    fun setLang(lang: String) {
        sharedPrefs.put(LANG_KEY, lang)
    }

    fun getLang(): String? {
        return sharedPrefs.getString(LANG_KEY,"")
    }

}