package com.jk.tourguide.mvvm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.jk.tourguide.databinding.ItemEmptyBinding;
import com.jk.tourguide.databinding.ItemErrorBinding;
import com.jk.tourguide.databinding.ItemLoadingBinding;
import com.jk.tourguide.extention.Resource;
import com.jk.tourguide.extention.Status;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0004\u001f !\"B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H$J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u001e\u0010\u001c\u001a\u00020\u001d2\u0014\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0018\u00010\u0007H\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/jk/tourguide/mvvm/BaseRVAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ctx", "Landroid/content/Context;", "resource", "Lcom/jk/tourguide/extention/Resource;", "", "(Landroid/content/Context;Lcom/jk/tourguide/extention/Resource;)V", "errorMessage", "", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "createDataViewHolder", "parent", "Landroid/view/ViewGroup;", "createEmptyViewHolder", "createErrorViewHolder", "createLoadingViewHolder", "getItemCount", "", "getItemViewType", "position", "onCreateViewHolder", "viewType", "submitData", "", "data", "Companion", "EmptyItem", "ErrorItem", "LoadingItem", "app_prodDebug"})
public abstract class BaseRVAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.Nullable
    private final android.content.Context ctx = null;
    @org.jetbrains.annotations.NotNull
    private com.jk.tourguide.extention.Resource<? extends java.util.List<? extends T>> resource;
    @org.jetbrains.annotations.NotNull
    private java.lang.String errorMessage = "Failed to load data";
    public static final int TYPE_DATA = 0;
    public static final int TYPE_ERROR = 1;
    public static final int TYPE_LOADING = 2;
    public static final int TYPE_EMPTY = 3;
    @org.jetbrains.annotations.NotNull
    public static final com.jk.tourguide.mvvm.BaseRVAdapter.Companion Companion = null;
    
    public BaseRVAdapter(@org.jetbrains.annotations.Nullable
    android.content.Context ctx, @org.jetbrains.annotations.NotNull
    com.jk.tourguide.extention.Resource<? extends java.util.List<? extends T>> resource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected abstract androidx.recyclerview.widget.RecyclerView.ViewHolder createDataViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent);
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getErrorMessage() {
        return null;
    }
    
    public void setErrorMessage(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder createLoadingViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder createErrorViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder createEmptyViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void submitData(@org.jetbrains.annotations.Nullable
    com.jk.tourguide.extention.Resource<? extends java.util.List<? extends T>> data) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/jk/tourguide/mvvm/BaseRVAdapter$Companion;", "", "()V", "TYPE_DATA", "", "TYPE_EMPTY", "TYPE_ERROR", "TYPE_LOADING", "app_prodDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jk/tourguide/mvvm/BaseRVAdapter$EmptyItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/jk/tourguide/mvvm/BaseRVAdapter;Landroid/view/View;)V", "app_prodDebug"})
    public final class EmptyItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public EmptyItem(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jk/tourguide/mvvm/BaseRVAdapter$ErrorItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/jk/tourguide/mvvm/BaseRVAdapter;Landroid/view/View;)V", "app_prodDebug"})
    public final class ErrorItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ErrorItem(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/jk/tourguide/mvvm/BaseRVAdapter$LoadingItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/jk/tourguide/mvvm/BaseRVAdapter;Landroid/view/View;)V", "app_prodDebug"})
    public final class LoadingItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public LoadingItem(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
    }
}