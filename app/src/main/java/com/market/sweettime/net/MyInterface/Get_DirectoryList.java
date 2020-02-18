package com.market.sweettime.net.MyInterface;


import com.market.sweettime.bean.DirectoryListBean;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Get_DirectoryList {
    @GET("/api/directoryList?userId=111&&session=1")
    Call<DirectoryListBean> getCall();
}
