package com.example.park_gunwoo.sunjungnam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChineseFoodSelectActivity extends AppCompatActivity {

    Class[] ChineseFoodArray = {Jjambbong.class, Jajangmyun.class, Ulmyun.class, Bokumbap.class,
                                Japchaebap.class, Tangsuyuk.class, Palbochae.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_food_select);
    }

    public void onClickNoodleO(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ChineseNoodleOActivity.class);
        startActivity(intent);
    }

    public void onClickNoodleX(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ChineseNoodleXActivity.class);
        startActivity(intent);
    }

    public void onClickBack(View v)
    {
        Intent intent = new Intent(getApplicationContext(), FoodKindActivity.class);
        startActivity(intent);
    }

    public void onClickRandom(View v)
    {
        int ranNum = (int)(Math.random()*7);
        Intent intent = new Intent(getApplicationContext(), ChineseFoodArray[ranNum]);
        startActivity(intent);
    }
}
