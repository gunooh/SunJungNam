package com.example.park_gunwoo.sunjungnam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EtcSelectActivity extends AppCompatActivity {

    Class[] EtcArray = {Udong.class, Ramen.class, Chobap.class, Sushi.class,
                        Gimbap.class, Ramyun.class, Jjolmyun.class,
                        Ddukbboki.class, Sundae.class, Tuigim.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc_select);
    }

    public void onClickJapaneseFood(View v)
    {
        Intent intent = new Intent(getApplicationContext(), EtcJapaneseFoodActivity.class);
        startActivity(intent);
    }

    public void onClickSnackFood(View v)
    {
        Intent intent = new Intent(getApplicationContext(), EtcSnackFoodActivity.class);
        startActivity(intent);
    }

    public void onClickBack(View v)
    {
        Intent intent = new Intent(getApplicationContext(), FoodKindActivity.class);
        startActivity(intent);
    }

    public void onClickRandom(View v)
    {
        int ranNum = (int)(Math.random()*10);
        Intent intent = new Intent(getApplicationContext(), EtcArray[ranNum]);
        startActivity(intent);
    }
}
