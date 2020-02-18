package com.market.sweettime.net.MyInterface;

import com.market.sweettime.bean.PublishNewsBean;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface Post_PublishNew {
    @POST("/api/publishNew ")
    @Multipart
    Call<PublishNewsBean> getCall(//@Part("file")RequestBody file,
                                  @Part MultipartBody.Part file,
                                  @Part("content") RequestBody content,
                                  @Part("address")RequestBody address,
                                  @Part("directoryId")RequestBody directory,
                                  @Part("userId") RequestBody userId);
}

