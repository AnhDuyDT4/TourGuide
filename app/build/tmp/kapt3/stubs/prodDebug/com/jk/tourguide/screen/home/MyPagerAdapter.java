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

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/jk/tourguide/screen/home/MyPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "fragmentCache", "", "", "Landroidx/fragment/app/Fragment;", "fragmentList", "", "Lcom/jk/tourguide/mvvm/BaseFragment;", "createFragment", "position", "getItemCount", "app_prodDebug"})
public final class MyPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.jk.tourguide.mvvm.BaseFragment> fragmentList = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Integer, androidx.fragment.app.Fragment> fragmentCache = null;
    
    public MyPagerAdapter(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentActivity fragmentManager) {
        super(null);
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.fragment.app.Fragment createFragment(int position) {
        return null;
    }
}