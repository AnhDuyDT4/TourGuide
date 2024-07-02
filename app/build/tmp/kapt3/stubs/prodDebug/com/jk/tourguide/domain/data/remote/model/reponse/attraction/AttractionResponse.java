package com.jk.tourguide.domain.data.remote.model.reponse.attraction;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00dd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b\u00a2\u0006\u0002\u0010\u001fJ\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0012H\u00c6\u0003J\t\u0010A\u001a\u00020\u0012H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u00c6\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bH\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\u008f\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bH\u00c6\u0001J\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010V\u001a\u00020\u0003H\u00d6\u0001J\t\u0010W\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\'R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010!R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010!\u00a8\u0006X"}, d2 = {"Lcom/jk/tourguide/domain/data/remote/model/reponse/attraction/AttractionResponse;", "", "id", "", "name", "", "nameZh", "open_status", "introduction", "open_time", "zipcode", "district", "address", "tel", "fax", "email", "months", "lat", "", "long", "official_site", "facebook", "ticket", "remind", "stayTime", "url", "service", "", "Lcom/jk/tourguide/domain/data/remote/model/reponse/attraction/ServiceResponse;", "images", "Lcom/jk/tourguide/domain/data/remote/model/reponse/attraction/ImageResponse;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "getDistrict", "getEmail", "getFacebook", "getFax", "getId", "()I", "getImages", "()Ljava/util/List;", "getIntroduction", "getLat", "()D", "getLong", "getMonths", "getName", "getNameZh", "getOfficial_site", "getOpen_status", "getOpen_time", "getRemind", "getService", "getStayTime", "getTel", "getTicket", "getUrl", "getZipcode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_prodDebug"})
public final class AttractionResponse {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @com.google.gson.annotations.SerializedName(value = "name")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @com.google.gson.annotations.SerializedName(value = "name_zh")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String nameZh = null;
    @com.google.gson.annotations.SerializedName(value = "open_status")
    private final int open_status = 0;
    @com.google.gson.annotations.SerializedName(value = "introduction")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String introduction = null;
    @com.google.gson.annotations.SerializedName(value = "open_time")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String open_time = null;
    @com.google.gson.annotations.SerializedName(value = "zipcode")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String zipcode = null;
    @com.google.gson.annotations.SerializedName(value = "district")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String district = null;
    @com.google.gson.annotations.SerializedName(value = "address")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String address = null;
    @com.google.gson.annotations.SerializedName(value = "tel")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String tel = null;
    @com.google.gson.annotations.SerializedName(value = "fax")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String fax = null;
    @com.google.gson.annotations.SerializedName(value = "email")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String email = null;
    @com.google.gson.annotations.SerializedName(value = "months")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String months = null;
    @com.google.gson.annotations.SerializedName(value = "nlat")
    private final double lat = 0.0;
    @com.google.gson.annotations.SerializedName(value = "official_site")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String official_site = null;
    @com.google.gson.annotations.SerializedName(value = "facebook")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String facebook = null;
    @com.google.gson.annotations.SerializedName(value = "ticket")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ticket = null;
    @com.google.gson.annotations.SerializedName(value = "remind")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String remind = null;
    @com.google.gson.annotations.SerializedName(value = "staytime")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String stayTime = null;
    @com.google.gson.annotations.SerializedName(value = "url")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String url = null;
    @com.google.gson.annotations.SerializedName(value = "service")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.attraction.ServiceResponse> service = null;
    @com.google.gson.annotations.SerializedName(value = "images")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.attraction.ImageResponse> images = null;
    
    public AttractionResponse(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String nameZh, int open_status, @org.jetbrains.annotations.NotNull
    java.lang.String introduction, @org.jetbrains.annotations.Nullable
    java.lang.String open_time, @org.jetbrains.annotations.NotNull
    java.lang.String zipcode, @org.jetbrains.annotations.NotNull
    java.lang.String district, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.NotNull
    java.lang.String tel, @org.jetbrains.annotations.Nullable
    java.lang.String fax, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String months, double lat, double p14_1663806, @org.jetbrains.annotations.Nullable
    java.lang.String official_site, @org.jetbrains.annotations.Nullable
    java.lang.String facebook, @org.jetbrains.annotations.Nullable
    java.lang.String ticket, @org.jetbrains.annotations.Nullable
    java.lang.String remind, @org.jetbrains.annotations.Nullable
    java.lang.String stayTime, @org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.attraction.ServiceResponse> service, @org.jetbrains.annotations.NotNull
    java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.attraction.ImageResponse> images) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNameZh() {
        return null;
    }
    
    public final int getOpen_status() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIntroduction() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOpen_time() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getZipcode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDistrict() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFax() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMonths() {
        return null;
    }
    
    public final double getLat() {
        return 0.0;
    }
    
    public final double getLong() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOfficial_site() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFacebook() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTicket() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRemind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStayTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.attraction.ServiceResponse> getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.attraction.ImageResponse> getImages() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.attraction.ServiceResponse> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.attraction.ImageResponse> component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.jk.tourguide.domain.data.remote.model.reponse.attraction.AttractionResponse copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String nameZh, int open_status, @org.jetbrains.annotations.NotNull
    java.lang.String introduction, @org.jetbrains.annotations.Nullable
    java.lang.String open_time, @org.jetbrains.annotations.NotNull
    java.lang.String zipcode, @org.jetbrains.annotations.NotNull
    java.lang.String district, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.NotNull
    java.lang.String tel, @org.jetbrains.annotations.Nullable
    java.lang.String fax, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String months, double lat, double p14_1663806, @org.jetbrains.annotations.Nullable
    java.lang.String official_site, @org.jetbrains.annotations.Nullable
    java.lang.String facebook, @org.jetbrains.annotations.Nullable
    java.lang.String ticket, @org.jetbrains.annotations.Nullable
    java.lang.String remind, @org.jetbrains.annotations.Nullable
    java.lang.String stayTime, @org.jetbrains.annotations.Nullable
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.attraction.ServiceResponse> service, @org.jetbrains.annotations.NotNull
    java.util.List<com.jk.tourguide.domain.data.remote.model.reponse.attraction.ImageResponse> images) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}