package com.jk.tourguide.extention

import com.jk.tourguide.R
import com.jk.tourguide.application.AppConstants

enum class CategoryType(val type: String) {
    ACTIVITY(AppConstants.ACTIVITY_TYPE),
    CALENDAR(AppConstants.CALENDAR_TYPE),
    PICTORIAL(AppConstants.PICTORIAL_TYPE),
    ATTRACTIONS(AppConstants.ATTRACTIONS_TYPE),
    GOURMET(AppConstants.GOURMET_TYPE),
    CONSUME(AppConstants.CONSUME_TYPE),
    ACCOMMODATION(AppConstants.ACCOMMODATION_TYPE),
    TOURS(AppConstants.TOURS_TYPE)
}

enum class OpenStatus(val status: Int) {
    OPEN(1),
    CLOSED(0);

    companion object {
        fun fromValue(value: Int): Int {
            return when(value) {
                1 -> R.string.open
                else -> R.string.closed
            }
        }
    }
}


enum class LanguageType ( val value: String, val valueEtx: String? = null, val displayName: Int ) {
    VIETNAM(AppConstants.VIETNAMESE, displayName = R.string.vietnamese),
    SPANISH(AppConstants.SPANISH, displayName = R.string.spanish),
    CHINA(AppConstants.CHINESE, AppConstants.CHINESE_EXT, R.string.chinese),
    TAIWAN(AppConstants.TAIWANESE, AppConstants.TAIWANESE_EXT , R.string.taiwanese),
    ENGLISH(AppConstants.ENGLISH, displayName = R.string.english),
    JAPAN(AppConstants.JAPANESE, displayName = R.string.japanese);

    companion object {
        fun getLanguageType(value: String): LanguageType {
            return when(value) {
                AppConstants.VIETNAMESE -> VIETNAM
                AppConstants.SPANISH -> SPANISH
                AppConstants.CHINESE -> CHINA
                AppConstants.TAIWANESE -> TAIWAN
                AppConstants.ENGLISH -> ENGLISH
                AppConstants.JAPANESE -> JAPAN
                else -> ENGLISH
            }
        }
    }
}