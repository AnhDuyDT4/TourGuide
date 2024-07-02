package com.jk.tourguide.domain.data.model.entity.mapper.attraction;

import com.jk.sl.domain.data.model.entity.mapper.IEntityMapper;
import com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity;
import com.jk.tourguide.domain.data.model.entity.attraction.ImageEntity;
import com.jk.tourguide.domain.data.model.entity.attraction.ServiceEntity;
import com.jk.tourguide.domain.data.remote.model.reponse.attraction.AttractionResponse;
import com.jk.tourguide.domain.data.remote.model.reponse.attraction.ImageResponse;
import com.jk.tourguide.domain.data.remote.model.reponse.attraction.ServiceResponse;
import com.jk.tourguide.extention.OpenStatus;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/jk/tourguide/domain/data/model/entity/mapper/attraction/AttractionMapper;", "Lcom/jk/sl/domain/data/model/entity/mapper/IEntityMapper;", "Lcom/jk/tourguide/domain/data/model/entity/attraction/AttractionEntity;", "Lcom/jk/tourguide/domain/data/remote/model/reponse/attraction/AttractionResponse;", "imageMapper", "Lcom/jk/tourguide/domain/data/model/entity/mapper/attraction/ImageMapper;", "serviceMapper", "Lcom/jk/tourguide/domain/data/model/entity/mapper/attraction/ServiceMapper;", "(Lcom/jk/tourguide/domain/data/model/entity/mapper/attraction/ImageMapper;Lcom/jk/tourguide/domain/data/model/entity/mapper/attraction/ServiceMapper;)V", "mapToEntity", "type", "app_prodDebug"})
public final class AttractionMapper implements com.jk.sl.domain.data.model.entity.mapper.IEntityMapper<com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity, com.jk.tourguide.domain.data.remote.model.reponse.attraction.AttractionResponse> {
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.data.model.entity.mapper.attraction.ImageMapper imageMapper = null;
    @org.jetbrains.annotations.NotNull
    private final com.jk.tourguide.domain.data.model.entity.mapper.attraction.ServiceMapper serviceMapper = null;
    
    public AttractionMapper(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.model.entity.mapper.attraction.ImageMapper imageMapper, @org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.model.entity.mapper.attraction.ServiceMapper serviceMapper) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.jk.tourguide.domain.data.model.entity.attraction.AttractionEntity mapToEntity(@org.jetbrains.annotations.NotNull
    com.jk.tourguide.domain.data.remote.model.reponse.attraction.AttractionResponse type) {
        return null;
    }
}