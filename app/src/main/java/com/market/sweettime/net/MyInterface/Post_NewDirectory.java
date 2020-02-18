package com.market.sweettime.net.MyInterface;

import com.market.sweettime.bean.NewDirectoryBean;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Post_NewDirectory {
    @POST("/api/newDirectory ")
    Call<NewDirectoryBean> postCall(@Body RequestBody requestBody, @Query("session")String session);
}
