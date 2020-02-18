package com.market.sweettime.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.market.sweettime.R;
import com.market.sweettime.base.BaseActivity;
import com.market.sweettime.bean.DeleteNewBean;
import com.market.sweettime.bean.DirectoryListBean;
import com.market.sweettime.bean.NewDirectoryBean;
import com.market.sweettime.bean.NewsBean;
import com.market.sweettime.bean.UpdateDirectoryNameBean;
import com.market.sweettime.net.MyInterface.Get_DirectoryList;
import com.market.sweettime.net.MyInterface.Get_News;
import com.market.sweettime.net.MyInterface.Post_DeleteNew;
import com.market.sweettime.net.MyInterface.Post_NewDirectory;
import com.market.sweettime.net.MyInterface.Post_UpdateDirectoryName;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    private ImageView imageView;
    TextView tv;
    private BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //RequestDirectoryList();
        //RequestNews();
        //RequestNewDirectory();
       // RequestDeleteNews();
        RequestUpdateDirectoryName();
    }

//    public void sendRequest(){
//        //创建retrofit对象
//        Retrofit mRetrofit = new Retrofit.Builder()
//                .baseUrl("http://v.juhe.cn/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        //实例化网络接口
//        GetRequestInterface getRequestInterface = mRetrofit.create(GetRequestInterface.class);
//        //发送get请求
////        getRequestInterface.getCall().enqueue(new Callback<TopNewsBean>() {
////            @Override
////            public void onResponse(Call<TopNewsBean> call, Response<TopNewsBean> response) {
////                if (response.isSuccessful()){
////                    final TopNewsBean.ResultBean.DataBean dataBean = response.body().getResult().getData().get(0);
////                    Log.d("xulimin",dataBean.getTitle()+"");
////                }
////            }
////
////            @Override
////            public void onFailure(Call<TopNewsBean> call, Throwable t) {
////                Log.d("xulimin","get请求失败");
////            }
////        });
//        //发送post请求
//        getRequestInterface.getCall("top","29e6b7c4d8953edbdbbb2b1e45b55ba2")
//                .enqueue(new Callback<TopNewsBean>() {
//                    @Override
//                    public void onResponse(Call<TopNewsBean> call, Response<TopNewsBean> response) {
//                        if (response.isSuccessful()){
//                            final TopNewsBean.ResultBean.DataBean dataBean = response.body().getResult().getData().get(0);
//                            Log.d("xulimin",dataBean.getAuthor_name()+"");
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<TopNewsBean> call, Throwable t) {
//
//                    }
//                });
//
//
//    }
    private void RequestDirectoryList(){
        //创建retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://47.116.0.11")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //实例化接口对象
        Get_DirectoryList get_directoryList = retrofit.create(Get_DirectoryList.class);
        get_directoryList.getCall().enqueue(new Callback<DirectoryListBean>() {
            @Override
            public void onResponse(Call<DirectoryListBean> call, Response<DirectoryListBean> response) {
              if (response.isSuccessful()){
                   DirectoryListBean body = response.body();
                   List<DirectoryListBean.DataBean> data = body.getData();
                   for (DirectoryListBean.DataBean bean:data){
                       Log.d("xulimin",bean.getDirectionName());
                   }
              }

            }
            @Override
            public void onFailure(Call<DirectoryListBean> call, Throwable t) {
                Log.d("xulimin","请求失败");
                Log.d("xulimin",t+"");
            }
        });
    }

    private void RequestNews(){
        //创建retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://47.116.0.11")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //实例化接口对象
        final Get_News get_news = retrofit.create(Get_News.class);

        get_news.getCall().enqueue(new Callback<NewsBean>() {
            @Override
            public void onResponse(Call<NewsBean> call, Response<NewsBean> response) {
                if (response.isSuccessful()){

                     NewsBean body = response.body();
                     NewsBean.DataBean data = body.getData();
                     List<NewsBean.DataBean.ListBean> list = data.getList();
                     Log.d("xulimin",data+"");

                }
            }

            @Override
            public void onFailure(Call<NewsBean> call, Throwable t) {
                Log.d("xulimin",t+"");
            }
        });
    }

    private void RequestDeleteNews(){
        //创建retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://47.116.0.11")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Post_DeleteNew post_deleteNew = retrofit.create(Post_DeleteNew.class);

        // 设置请求类型
        MediaType mediaType = MediaType.parse("application/json;charset=UTF-8");
        // 设置请求内容
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("newId", 20);
            jsonObject.put("userId", 111);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String str = jsonObject.toString();
        RequestBody requestBody = RequestBody.create(mediaType, str);
        post_deleteNew.postCall(requestBody,"1231").enqueue(new Callback<DeleteNewBean>() {
            @Override
            public void onResponse(Call<DeleteNewBean> call, Response<DeleteNewBean> response) {
                Log.d("xulimin",response.code()+"");
                if (response.isSuccessful()){
                    Log.d("xulimin","删除成功");
                }
             }
            @Override
            public void onFailure(Call<DeleteNewBean> call, Throwable t) {
                    Log.d("xulimin",t+"");
            }
        });


    }

    private void RequestNewDirectory(){
        //创建retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://47.116.0.11")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Post_NewDirectory post_newDirectory = retrofit.create(Post_NewDirectory.class);

        // 设置请求类型
        MediaType mediaType = MediaType.parse("application/json;charset=UTF-8");
        // 设置请求内容
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("dirName", "江湖旧梦");
            jsonObject.put("userId", 111);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String str = jsonObject.toString();
        RequestBody requestBody = RequestBody.create(mediaType, str);
        post_newDirectory.postCall(requestBody,"12345").enqueue(new Callback<NewDirectoryBean>() {
            @Override
            public void onResponse(Call<NewDirectoryBean> call, Response<NewDirectoryBean> response) {
                if (response.isSuccessful()){
                    Log.d("xulimin","添加相册成功");
                }
            }

            @Override
            public void onFailure(Call<NewDirectoryBean> call, Throwable t) {

            }
        });
    }

    private void RequestUpdateDirectoryName(){
        //创建retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://47.116.0.11")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Post_UpdateDirectoryName post_updateDirectoryName = retrofit.create(Post_UpdateDirectoryName.class);
        // 设置请求类型
        MediaType mediaType = MediaType.parse("application/json;charset=UTF-8");
        // 设置请求内容
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("dirId", 2);
            jsonObject.put("newTitle", "碧海潮生");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String str = jsonObject.toString();
        RequestBody requestBody = RequestBody.create(mediaType, str);
        post_updateDirectoryName.postCall(requestBody,"123").enqueue(new Callback<UpdateDirectoryNameBean>() {
            @Override
            public void onResponse(Call<UpdateDirectoryNameBean> call, Response<UpdateDirectoryNameBean> response) {
                Log.d("xulimin",response.code()+"");
                if (response.isSuccessful()){
                    Log.d("xulimin","更新相册名成功");
                }
            }
            @Override
            public void onFailure(Call<UpdateDirectoryNameBean> call, Throwable t) {

            }
        });



    }

    private void RequestPublishNewsBean(){

    }



    public void initView(){
       bottomNavigation = findViewById(R.id.nav_view);
       bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
       imageView =findViewById(R.id.image);
       tv = findViewById(R.id.tv);
//    Glide.with(this)
//            .load("http://i.ooniu.com/20190522.png")
//            .apply(RequestOptions.bitmapTransform(new CircleCrop()))
//            .error(R.drawable.ic_launcher_background)
//            .placeholder(R.drawable.ic_launcher_background)
//            .into(imageView);
    }

    @Override
    public void onClick(View v) {

    }

    //底部导航栏
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
           switch (menuItem.getItemId()){
               case R.id.navigation_home:
                   break;
               case R.id.navigation_album:
                   Intent intent = new Intent(MainActivity.this,AlbumActivity.class);
                   startActivity(intent);
                   break;
               case R.id.navigation_mine:
                   Intent intent2 = new Intent(MainActivity.this,MineActivity.class);
                   startActivity(intent2);
                   break;
           }
            return false;
        }
    };

}
