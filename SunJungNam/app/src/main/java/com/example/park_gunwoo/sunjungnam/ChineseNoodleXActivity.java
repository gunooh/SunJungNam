package com.example.park_gunwoo.sunjungnam;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChineseNoodleXActivity extends AppCompatActivity {

    Class[] ChineseNoodleXArray = {Bokumbap.class, Japchaebap.class, Tangsuyuk.class, Palbochae.class};
    Class[] RiceOArray = {Bokumbap.class, Japchaebap.class};
    Class[] RiceXArray = {Tangsuyuk.class, Palbochae.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        setContentView(R.layout.activity_chinese_noodle_x);
    }

    public void onClickRiceO(View v)
    {
        int ranNum = (int)(Math.random()*2);
        Intent intent = new Intent(getApplicationContext(), RiceOArray[ranNum]);
        startActivity(intent);
    }

    public void onClickRiceX(View v)
    {
        int ranNum = (int)(Math.random()*2);
        Intent intent = new Intent(getApplicationContext(), RiceXArray[ranNum]);
        startActivity(intent);
    }

    public void onClickBack(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ChineseFoodSelectActivity.class);
        startActivity(intent);
    }

    public void onClickRandom(View v)
    {
        int ranNum = (int)(Math.random()*4);
        Intent intent = new Intent(getApplicationContext(), ChineseNoodleXArray[ranNum]);
        startActivity(intent);
    }
}
