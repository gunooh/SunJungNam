package com.example.park_gunwoo.sunjungnam;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Map;

public class Jjambbong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        setContentView(R.layout.activity_jjambbong);
    }

    public void onClickHome(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void onClickSearch(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ChineseGoogleMapsActivity.class);
        startActivity(intent);
    }
}
