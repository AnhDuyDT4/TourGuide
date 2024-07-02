package com.jk.tourguide.screen.home;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.tabs.TabLayoutMediator;
import com.jk.tourguide.R;
import com.jk.tourguide.application.MainActivity;
import com.jk.tourguide.component.languagedialog.LanguageSelectionDialog;
import com.jk.tourguide.databinding.FragmentHomeBinding;
import com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository;
import com.jk.tourguide.extention.LanguageType;
import com.jk.tourguide.mvvm.BaseFragmentBinding;
import com.jk.tourguide.screen.category.CategoriesFragment;
import com.jk.tourguide.screen.event.ActivityEventFragment;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/jk/tourguide/screen/home/HomeFragment;", "Lcom/jk/tourguide/mvvm/BaseFragmentBinding;", "Lcom/jk/tourguide/databinding/FragmentHomeBinding;", "()V", "sharedPreferences", "Lcom/jk/tourguide/domain/data/cache/CacheSharedPreferencesRepository;", "getSharedPreferences", "()Lcom/jk/tourguide/domain/data/cache/CacheSharedPreferencesRepository;", "sharedPreferences$delegate", "Lkotlin/Lazy;", "initView", "", "app_prodDebug"})
public final class HomeFragment extends com.jk.tourguide.mvvm.BaseFragmentBinding<com.jk.tourguide.databinding.FragmentHomeBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sharedPreferences$delegate = null;
    
    public HomeFragment() {
        super(0);
    }
    
    private final com.jk.tourguide.domain.data.cache.CacheSharedPreferencesRepository getSharedPreferences() {
        return null;
    }
    
    @java.lang.Override
    public void initView() {
    }
}