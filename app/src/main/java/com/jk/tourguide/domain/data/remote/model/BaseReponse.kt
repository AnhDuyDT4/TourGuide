package com.jk.tourguide.domain.data.remote.model

class BaseResponse<T>(var data: T? = null, var total: Int = 0, var errorMessage: String? = null, var message: String?)