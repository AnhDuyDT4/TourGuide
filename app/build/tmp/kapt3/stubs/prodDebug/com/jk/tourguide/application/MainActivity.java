package com.jk.tourguide.application;

import com.jk.tourguide.component.DialogNetwork;
import com.jk.tourguide.databinding.ActivityMainBinding;
import com.jk.tourguide.mvvm.BaseActivity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/jk/tourguide/application/MainActivity;", "Lcom/jk/tourguide/mvvm/BaseActivity;", "Lcom/jk/tourguide/databinding/ActivityMainBinding;", "()V", "networkDialog", "Lcom/jk/tourguide/component/DialogNetwork;", "initView", "", "onNetworkChange", "isConnected", "", "app_prodDebug"})
public final class MainActivity extends com.jk.tourguide.mvvm.BaseActivity<com.jk.tourguide.databinding.ActivityMainBinding> {
    private com.jk.tourguide.component.DialogNetwork networkDialog;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    @java.lang.Override
    public void onNetworkChange(boolean isConnected) {
    }
}