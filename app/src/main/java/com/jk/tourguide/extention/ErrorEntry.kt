package com.jk.tourguide.extention

data class ErrorEntry(
    val code: ErrorType,
    override val message: String? = null
) : Exception()

enum class ErrorType {
    INVALID_INPUT,
    SERVER_ERROR,
    UNKNOWN
}
