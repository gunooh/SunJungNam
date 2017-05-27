package com.example.park_gunwoo.sunjungnam;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClickFood(View v)
    {
        Intent intent = new Intent(getApplicationContext(), FoodKindActivity.class);
        startActivity(intent);
    }
    public void onClickTravel(View v)
    {

    }
    public void onClickMovie(View v)
    {

    }
    public void onClickInput(View v)
    {
        Intent intent = new Intent(getApplicationContext(), InputActivity.class);
        startActivity(intent);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        String text = null;

        switch (item.getItemId()) {
            case android.R.id.home:
                text = "Application icon";
                break;

            case R.id.item1:
                text = "Action item, with text, displayed if room exists";
                break;

            case R.id.item2:
                text = "Action item, icon only, always displayed";
                break;

            case R.id.item3:
                text = "Normal menu item";
                break;

            default:
                return false;
        }
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int curId = item.getItemId();
//
//        switch (curId) {
//            case R.id.menu_settings:
//                Toast.makeText(this, "설정 메뉴가 선택되었습니다", Toast.LENGTH_SHORT).show();
//                break;
//            default:
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }


}
