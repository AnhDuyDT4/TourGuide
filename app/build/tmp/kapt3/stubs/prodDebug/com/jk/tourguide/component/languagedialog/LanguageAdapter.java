package com.jk.tourguide.component.languagedialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.jk.tourguide.databinding.ItemListBinding;
import com.jk.tourguide.extention.LanguageType;
import com.jk.tourguide.extention.Resource;
import com.jk.tourguide.mvvm.BaseRVAdapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/jk/tourguide/component/languagedialog/LanguageAdapter;", "Lcom/jk/tourguide/mvvm/BaseRVAdapter;", "Lcom/jk/tourguide/extention/LanguageType;", "context", "Landroid/content/Context;", "resource", "Lcom/jk/tourguide/extention/Resource;", "", "onItemClick", "Lkotlin/Function1;", "", "", "(Landroid/content/Context;Lcom/jk/tourguide/extention/Resource;Lkotlin/jvm/functions/Function1;)V", "createDataViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "onBindViewHolder", "holder", "position", "", "LanguageViewHolder", "app_prodDebug"})
public final class LanguageAdapter extends com.jk.tourguide.mvvm.BaseRVAdapter<com.jk.tourguide.extention.LanguageType> {
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.extention.Resource<java.util.List<com.jk.tourguide.extention.LanguageType>> resource = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onItemClick = null;
    
    public LanguageAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.jk.tourguide.extention.Resource<? extends java.util.List<? extends com.jk.tourguide.extention.LanguageType>> resource, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClick) {
        super(null, null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected androidx.recyclerview.widget.RecyclerView.ViewHolder createDataViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/jk/tourguide/component/languagedialog/LanguageAdapter$LanguageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/jk/tourguide/databinding/ItemListBinding;", "(Lcom/jk/tourguide/component/languagedialog/LanguageAdapter;Lcom/jk/tourguide/databinding/ItemListBinding;)V", "bind", "", "language", "Lcom/jk/tourguide/extention/LanguageType;", "app_prodDebug"})
    public final class LanguageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.jk.tourguide.databinding.ItemListBinding binding = null;
        
        public LanguageViewHolder(@org.jetbrains.annotations.NotNull
        com.jk.tourguide.databinding.ItemListBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.jk.tourguide.extention.LanguageType language) {
        }
    }
}