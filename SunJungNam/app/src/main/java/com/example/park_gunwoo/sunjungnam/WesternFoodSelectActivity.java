package com.example.park_gunwoo.sunjungnam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WesternFoodSelectActivity extends AppCompatActivity {

    Class[] WesternMeatArray = {Steak.class, Dongas.class, Pasta.class, Spagetti.class};
    Class[] WesternMeatOArray = {Steak.class, Dongas.class};
    Class[] WesternMeatXArray = {Pasta.class, Spagetti.class};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_western_food_select);
    }

    public void onClickMeatO(View v)
    {
        int ranNum = (int)(Math.random()*2);
        Intent intent = new Intent(getApplicationContext(), WesternMeatOArray[ranNum]);
        startActivity(intent);
    }

    public void onClickMeatX(View v)
    {
        int ranNum = (int)(Math.random()*2);
        Intent intent = new Intent(getApplicationContext(), WesternMeatXArray[ranNum]);
        startActivity(intent);
    }

    public void onClickBack(View v)
    {
        Intent intent = new Intent(getApplicationContext(), FoodKindActivity.class);
        startActivity(intent);
    }

    public void onClickRandom(View v)
    {
        int ranNum = (int)(Math.random()*4);
        Intent intent = new Intent(getApplicationContext(), WesternMeatArray[ranNum]);
        startActivity(intent);
    }
}
