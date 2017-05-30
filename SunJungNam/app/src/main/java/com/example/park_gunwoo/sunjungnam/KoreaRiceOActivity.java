package com.example.park_gunwoo.sunjungnam;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class KoreaRiceOActivity extends AppCompatActivity {

    final Class[] KoreaRiceOArray = {Sullungtang.class, Gukbap.class, Bibimbap.class, Dupbap.class};
    final Class[] SoupOArray = {Sullungtang.class, Gukbap.class};
    final Class[] SoupXArray = {Bibimbap.class, Dupbap.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        setContentView(R.layout.activity_korea_rice_o);
    }

    public void onClickSoupO(View v)
    {
        int ranNum = (int)(Math.random()*2);
        Intent intent = new Intent(getApplicationContext(), SoupOArray[ranNum]);
        startActivity(intent);
    }

    public void onClickSoupX(View v)
    {
        int ranNum = (int)(Math.random()*2);
        Intent intent = new Intent(getApplicationContext(), SoupXArray[ranNum]);
        startActivity(intent);
    }


    public void onClickHome(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void onClickRandom(View v)
    {
        int ranNum = (int)(Math.random()*4);
        Intent intent = new Intent(getApplicationContext(), KoreaRiceOArray[ranNum]);
        startActivity(intent);
    }
}
