package com.example.park_gunwoo.sunjungnam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoodKindActivity extends AppCompatActivity {

    Class[] FoodArray = {Sullungtang.class, Gukbap.class, Bibimbap.class, Dupbap.class,
                        Naengmyun.class, Kalguksu.class, Bulgogi.class, Galbijjim.class,
                        Jjambbong.class, Jajangmyun.class, Ulmyun.class,
                        Bokumbap.class, Japchaebap.class, Tangsuyuk.class, Palbochae.class,
                        Steak.class, Dongas.class, Pasta.class, Spagetti.class,
                        Udong.class, Ramen.class, Chobap.class, Sushi.class,
                        Gimbap.class, Ramyun.class, Jjolmyun.class,
                        Ddukbboki.class, Sundae.class, Tuigim.class};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_kind);
    }


    public void onClickKoreaFood(View v)
    {
        Intent intent = new Intent(getApplicationContext(), KoreaFoodSelectActivity.class);
        startActivity(intent);
    }

    public void onClickWesternFood(View v)
    {
        Intent intent = new Intent(getApplicationContext(), WesternFoodSelectActivity.class);
        startActivity(intent);
    }

    public void onClickChineseFood(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ChineseFoodSelectActivity.class);
        startActivity(intent);
    }

    public void onClickEtc(View v)
    {
        Intent intent = new Intent(getApplicationContext(), EtcSelectActivity.class);
        startActivity(intent);
    }

    public void onClickBack(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void onClickRandom(View v)
    {
        int ranNum = (int)(Math.random()*29);
        Intent intent = new Intent(getApplicationContext(), FoodArray[ranNum]);
        startActivity(intent);
    }
}
