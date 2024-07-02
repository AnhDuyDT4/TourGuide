package com.jk.tourguide.component

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import com.jk.tourguide.R
import com.jk.tourguide.databinding.DialogNetworkBinding

class DialogNetwork (
    context: Context
) : Dialog(context, R.style.TransparentDialog) {

    private lateinit var binding: DialogNetworkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogNetworkBinding.inflate(LayoutInflater.from(context))
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
       setCanceledOnTouchOutside(false)
    }
}