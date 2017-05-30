package com.example.park_gunwoo.sunjungnam;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EtcSnackFoodActivity extends AppCompatActivity {

    Class[] EtcSnackFoodOArray = {Gimbap.class, Ramyun.class, Jjolmyun.class,
                                    Ddukbboki.class, Sundae.class, Tuigim.class};
    Class[] MealArray = {Gimbap.class, Ramyun.class, Jjolmyun.class};
    Class[] SnackArray = {Ddukbboki.class, Sundae.class, Tuigim.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        setContentView(R.layout.activity_etc_snack_food);
    }

    public void onClickMeal(View v)
    {
        int ranNum = (int)(Math.random()*2);
        Intent intent = new Intent(getApplicationContext(), MealArray[ranNum]);
        startActivity(intent);
    }

    public void onClickSnack(View v)
    {
        int ranNum = (int)(Math.random()*2);
        Intent intent = new Intent(getApplicationContext(), SnackArray[ranNum]);
        startActivity(intent);
    }

    public void onClickBack(View v)
    {
        Intent intent = new Intent(getApplicationContext(), EtcSelectActivity.class);
        startActivity(intent);
    }

    public void onClickRandom(View v)
    {
        int ranNum = (int)(Math.random()*4);
        Intent intent = new Intent(getApplicationContext(), EtcSnackFoodOArray[ranNum]);
        startActivity(intent);
    }
}
