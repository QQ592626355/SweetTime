package com.market.sweettime.net.MyInterface;

import com.market.sweettime.bean.UpdateDirectoryNameBean;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Post_UpdateDirectoryName {
    @POST("/api/updateDirectoryName")
    Call<UpdateDirectoryNameBean> postCall(@Body RequestBody requestBody, @Query("session") String session);
}
