package com.market.sweettime.net.MyInterface;

import com.market.sweettime.bean.NewsBean;

import retrofit2.Call;
import retrofit2.http.GET;

//获取相册中的动态列表
public interface Get_News {
    @GET("/api/news?userId=111&session=rere&directoryId=10")
    Call<NewsBean> getCall();
}
