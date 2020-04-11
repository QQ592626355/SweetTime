//package com.market.sweettime.activity.Test;
//
//import retrofit2.Call;
//import retrofit2.http.Field;
//import retrofit2.http.FormUrlEncoded;
//import retrofit2.http.GET;
//import retrofit2.http.POST;
//
//public interface GetRequestInterface {
//
//    @GET("toutiao/index?type=top&key=29e6b7c4d8953edbdbbb2b1e45b55ba2")
//    Call<TopNewsBean> getCall();
//
//
//    @POST("toutiao/index?")
//    @FormUrlEncoded
//    Call<TopNewsBean> getCall(@Field("type")String mTop,@Field("key") String mKey);
//    /**
//     *  @GET("toutiao/index?type=top&key=29e6b7c4d8953edbdbbb2b1e45b55ba2")
//     *     fun getCall(): Call<TopNewsBean>
//     *     // @GET注解的作用:采用Get方法发送网络请求
//     *     // getCall() = 接收网络请求数据的方法
//     *     // 其中返回类型为Call<*>，*是接收数据的类（即上面定义的TopNewsBean类）
//     *
//     *     @POST("toutiao/index?")
//     *     @FormUrlEncoded
//     *     fun postCall(@Field("type")mTop:String,@Field("key")mKey:String): Call<TopNewsBean>
//     *     // 需要配合@Field 向服务器提交需要的字段
//     *     //@FormUrlEncoded 表示请求体是一个表单数据
//     */
//
//
//}
