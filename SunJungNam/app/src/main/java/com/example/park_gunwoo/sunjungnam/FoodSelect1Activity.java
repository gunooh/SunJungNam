package com.example.park_gunwoo.sunjungnam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoodSelect1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_select1);
    }


    public void onClickSpicy(View v)
    {
        Intent intent = new Intent(getApplicationContext(), KimchijjigaeActivity.class);
        startActivity(intent);
    }
}
