package com.jk.tourguide.domain.data.cache

interface SharedPrefs {
    fun getInt(name: String): Int

    fun getInt(name: String, defaultInt: Int): Int

    fun getBoolean(name: String): Boolean

    fun getBoolean(name: String, defaultBoolean: Boolean): Boolean

    fun getString(name: String, defaultString: String?): String?

    fun getFloat(name: String, defaultFloat: Float): Float

    fun getLong(name: String, defaultValue: Long): Long

    fun <T> put(key: String?, data: T)

    fun remove(key: String?)

    fun removeAll(keys: List<String?>)

    fun clear()

    fun isHaveKey(key: String?): Boolean

    // Only use to read from Object data(Json, enum...)
    operator fun <T> get(key: String?, anonymousClass: Class<T>, defValue: T?): T?

    fun getArrayList(key: String?): MutableList<Long?>?

    fun getArrayList(key: String?, defaultValue: MutableList<Long?>): MutableList<Long?>

    fun putArrayList(key: String?, data: List<Long?>?)
}