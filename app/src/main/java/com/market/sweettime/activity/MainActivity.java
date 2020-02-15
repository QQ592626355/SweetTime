package com.market.sweettime.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.market.sweettime.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView(){
       bottomNavigation = findViewById(R.id.nav_view);
       bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
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
