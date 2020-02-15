package com.market.sweettime.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.market.sweettime.R;

public class AlbumActivity extends AppCompatActivity implements View.OnClickListener{

    CardView photo,talk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        initView();
    }

    public void initView(){
        photo=findViewById(R.id.photo);
        talk=findViewById(R.id.talk);
        photo.setOnClickListener(this);
        talk.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.photo:
                Toast.makeText(this,"你点击了相册",Toast.LENGTH_SHORT).show();
                break;
            case R.id.talk:
                Toast.makeText(this,"你点击聊天记录",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
