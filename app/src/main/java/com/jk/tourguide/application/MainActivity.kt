package com.jk.tourguide.application

import com.jk.tourguide.component.DialogNetwork
import com.jk.tourguide.databinding.ActivityMainBinding
import com.jk.tourguide.mvvm.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private lateinit var networkDialog: DialogNetwork

    override fun initView() {
        networkDialog = DialogNetwork(this)
    }

    override fun onNetworkChange(isConnected: Boolean) {
        if (!isConnected) {
            networkDialog.show()
        } else {
            networkDialog.dismiss()
        }
    }

}