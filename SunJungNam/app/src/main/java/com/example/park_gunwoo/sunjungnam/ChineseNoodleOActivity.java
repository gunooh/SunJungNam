package com.example.park_gunwoo.sunjungnam;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChineseNoodleOActivity extends AppCompatActivity {

    Class[] ChineseNoodleOArray = {Jjambbong.class, Jajangmyun.class, Ulmyun.class};
    Class[] NoSpicyArray = {Jajangmyun.class, Ulmyun.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        setContentView(R.layout.activity_chinese_noodle_o);
    }

    public void onClickSpicy(View v)
    {
        Intent intent = new Intent(getApplicationContext(), Jjambbong.class);
        startActivity(intent);
    }

    public void onClickNoSpicy(View v)
    {
        int ranNum = (int)(Math.random()*2);
        Intent intent = new Intent(getApplicationContext(), NoSpicyArray[ranNum]);
        startActivity(intent);
    }

    public void onClickBack(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ChineseFoodSelectActivity.class);
        startActivity(intent);
    }

    public void onClickRandom(View v)
    {
        int ranNum = (int)(Math.random()*3);
        Intent intent = new Intent(getApplicationContext(), ChineseNoodleOArray[ranNum]);
        startActivity(intent);
    }

}
