package com.example.park_gunwoo.sunjungnam;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KoreaFoodSelectActivity extends AppCompatActivity {

    final Class[] KoreaFoodArray = {Sullungtang.class, Gukbap.class, Bibimbap.class, Dupbap.class,
                                    Naengmyun.class, Kalguksu.class, Bulgogi.class, Galbijjim.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        setContentView(R.layout.activity_korea_food_select);
    }

    public void onClickRiceO(View v)
    {
        Intent intent = new Intent(getApplicationContext(), KoreaRiceOActivity.class);
        startActivity(intent);
    }

    public void onClickRiceX(View v)
    {
        Intent intent = new Intent(getApplicationContext(), KoreaRiceXActivity.class);
        startActivity(intent);
    }

    public void onClickBack(View v)
    {
        Intent intent = new Intent(getApplicationContext(), FoodKindActivity.class);
        startActivity(intent);
    }

    public void onClickRandom(View v)
    {
        int ranNum = (int)(Math.random()*8);
        Intent intent = new Intent(getApplicationContext(), KoreaFoodArray[ranNum]);
        startActivity(intent);
    }
}
