package com.example.park_gunwoo.sunjungnam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EtcJapaneseFoodActivity extends AppCompatActivity {

    Class[] EtcJapaneseFoodOArray = {Udong.class, Ramen.class, Chobap.class, Sushi.class};
    Class[] NoodleOArray = {Udong.class, Ramen.class};
    Class[] NoodleXArray = {Chobap.class, Sushi.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etc_japanese_food);
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
        Intent intent = new Intent(getApplicationContext(), EtcSelectActivity.class);
        startActivity(intent);
    }

    public void onClickRandom(View v)
    {
        int ranNum = (int)(Math.random()*4);
        Intent intent = new Intent(getApplicationContext(), EtcJapaneseFoodOArray[ranNum]);
        startActivity(intent);
    }
}
