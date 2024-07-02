package com.jk.sl.domain.data.model.entity.mapper;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00002\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/jk/sl/domain/data/model/entity/mapper/IEntityMapper;", "E", "R", "", "mapToEntity", "type", "(Ljava/lang/Object;)Ljava/lang/Object;", "app_prodDebug"})
public abstract interface IEntityMapper<E extends java.lang.Object, R extends java.lang.Object> {
    
    public abstract E mapToEntity(R type);
}