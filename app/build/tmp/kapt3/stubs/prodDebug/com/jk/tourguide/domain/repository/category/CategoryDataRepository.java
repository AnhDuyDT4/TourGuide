package com.jk.tourguide.domain.repository.category;

import com.jk.tourguide.domain.data.datastore.category.CategoryRemote;
import com.jk.tourguide.domain.data.model.entity.category.CategoryEntity;
import com.jk.tourguide.domain.data.model.entity.mapper.categry.CategoryMapper;
import com.jk.tourguide.extention.CategoryType;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/jk/tourguide/domain/repository/category/CategoryDataRepository;", "Lcom/jk/tourguide/domain/repository/category/CategoryRepository;", "categoryRemote", "Lcom/jk/tourguide/domain/data/datastore/category/CategoryRemote;", "categoryMapper", "Lcom/jk/tourguide/domain/data/model/entity/mapper/categry/CategoryMapper;", "(Lcom/jk/tourguide/domain/data/datastore/category/CategoryRemote;Lcom/jk/tourguide/domain/data/model/entity/mapper/categry/CategoryMapper;)V", "getCategories", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/jk/tourguide/domain/data/model/entity/category/CategoryEntity;", "type", "Lcom/jk/tourguide/extention/CategoryType;", "app_prodDebug"})
public final class CategoryDataRepository implements com.jk.tourguide.domain.repository.category.CategoryRepository {
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.data.datastore.category.CategoryRemote categoryRemote = null;
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.data.model.entity.mapper.categry.CategoryMapper categoryMapper = null;
    
    public CategoryDataRepository(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.datastore.category.CategoryRemote categoryRemote, @org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.model.entity.mapper.categry.CategoryMapper categoryMapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.jk.tourguide.domain.data.model.entity.category.CategoryEntity>> getCategories(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.extention.CategoryType type) {
        return null;
    }
}