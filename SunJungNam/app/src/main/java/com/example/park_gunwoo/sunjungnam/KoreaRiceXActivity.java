package com.example.park_gunwoo.sunjungnam;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KoreaRiceXActivity extends AppCompatActivity {

    final Class[] KoreaRiceXArray = {Naengmyun.class, Kalguksu.class, Bulgogi.class, Galbijjim.class};
    final Class[] NoodleOArray = {Naengmyun.class, Kalguksu.class};
    final Class[] NoodleXArray = {Bulgogi.class, Galbijjim.class};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        setContentView(R.layout.activity_korea_rice_x);
    }

    public void onClickNoodleO(View v)
    {
        int ranNum = (int)(Math.random()*2);
        Intent intent = new Intent(getApplicationContext(), NoodleOArray[ranNum]);
        startActivity(intent);
    }

    public void onClickNoodleX(View v)
    {
        int ranNum = (int)(Math.random()*2);
        Intent intent = new Intent(getApplicationContext(), NoodleXArray[ranNum]);
        startActivity(intent);
    }

    public void onClickBack(View v)
    {
        Intent intent = new Intent(getApplicationContext(), KoreaFoodSelectActivity.class);
        startActivity(intent);
    }

    public void onClickRandom(View v)
    {
        int ranNum = (int)(Math.random()*4);
        Intent intent = new Intent(getApplicationContext(), KoreaRiceXArray[ranNum]);
        startActivity(intent);
    }
}
