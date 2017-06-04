package com.example.park_gunwoo.sunjungnam;

import android.app.ActionBar;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.navdrawer.SimpleSideDrawer;

import java.util.List;


public class MainActivity extends AppCompatActivity  {

    DrawerLayout drawerLayout;
    LinearLayout listView;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        listView = (LinearLayout) findViewById(R.id.list_view);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menuopen);

        setContentView(R.layout.activity_main);


    }


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        switch (item.getItemId()) {
//            case android.R.id.home:
//                drawerLayout.openDrawer(GravityCompat.START);
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int item_id = item.getItemId();
//
//        if(item_id == android.R.id.home)
//        {
//            if(drawerLayout.isDrawerOpen(listView))
//            {
//
//            }
//            else
//            {
//                drawerLayout.openDrawer(listView);
//            }
//
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

//    protected void onPause()
//    {
//        super.onPause();
//
//        drawerLayout.closeDrawer(GravityCompat.START);
//    }


    public void onClickNotice(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ComingSoonActivity.class);
        startActivity(intent);
    }
    public void onClickFood(View v)
    {
        Intent intent = new Intent(getApplicationContext(), FoodKindActivity.class);
        startActivity(intent);
    }
    public void onClickTravel(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ComingSoonActivity.class);
        startActivity(intent);
    }
    public void onClickMovie(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ComingSoonActivity.class);
        startActivity(intent);
    }
    public void onClickInput(View v)
    {
        Intent intent = new Intent(getApplicationContext(), InputActivity.class);
        startActivity(intent);
    }
    public void onClickBoard(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ComingSoonActivity.class);
        startActivity(intent);
    }
    public void onClickSetting(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ComingSoonActivity.class);
        startActivity(intent);
    }

//    public void onClickDeveloperInformation(View v)
//    {
//        final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
//
//        // 제목셋팅
//        alertDialogBuilder.setTitle("개발자 정보");
//
//        // AlertDialog 셋팅
//        alertDialogBuilder
//                .setMessage("TEAM 선정남")
//                .setCancelable(false)
//                .setNeutralButton("확인",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(
//                                    DialogInterface dialog, int id) {
//                                // 프로그램을 종료한다
//                                alertDialogBuilder.finish();
//                            }
//                        });
//
//        // 다이얼로그 생성
//        AlertDialog alertDialog = alertDialogBuilder.create();
//
//        // 다이얼로그 보여주기
//        alertDialog.show();
//    }

//    public void onClickHelp(View v)
//    {
//        Intent intent = new Intent(getApplicationContext(), ComingSoonActivity.class);
//        startActivity(intent);
//    }

//    public void onClickVersionInformation(View v)
//    {
//        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
//
//        // 제목셋팅
//        alertDialogBuilder.setTitle("버전 정보");
//
//        // AlertDialog 셋팅
//        alertDialogBuilder
//                .setMessage("Your Choice, Ver 1.0")
//                .setCancelable(false)
//                .setNeutralButton("확인",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(
//                                    DialogInterface dialog, int id) {
//                                // 프로그램을 종료한다
//                                MainActivity.this.finish();
//                            }
//                        });
//
//        // 다이얼로그 생성
//        AlertDialog alertDialog = alertDialogBuilder.create();
//
//        // 다이얼로그 보여주기
//        alertDialog.show();
//    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        String text = null;
        final AlertDialog.Builder alertDialogBuilder;
        final AlertDialog alertDialog;

        switch (item.getItemId()) {

            case R.id.item1:
                alertDialogBuilder = new AlertDialog.Builder(this);
                // 제목셋팅
                alertDialogBuilder.setTitle("개발자 정보");

                // AlertDialog 셋팅
                alertDialogBuilder
                        .setMessage(" ")
                        .setMessage("TEAM 선.정.남(선택을 대신 정해주는 남자들)")
                        .setCancelable(false)
                       .setPositiveButton("닫기",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(
                                            DialogInterface dialog, int id) {
                                        // 프로그램을 종료한다
                                        dialog.dismiss();
                                    }
                                });

                // 다이얼로그 생성
                alertDialog = alertDialogBuilder.create();

                // 다이얼로그 보여주기
                alertDialog.show();

                break;

            case R.id.item2:

                Intent intent = new Intent(getApplicationContext(), ComingSoonActivity.class);
                startActivity(intent);

                break;

            case R.id.item3:
                alertDialogBuilder = new AlertDialog.Builder(this);

                // 제목셋팅
                alertDialogBuilder.setTitle("버전 정보");

                // AlertDialog 셋팅
                alertDialogBuilder
                        .setMessage(" ")
                        .setMessage("너의 선택은(Your Choice), Ver 1.0")
                        .setCancelable(false)
                        .setPositiveButton("닫기",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(
                                            DialogInterface dialog, int id) {
                                        // 프로그램을 종료한다
                                        dialog.dismiss();
                                    }
                                });

                // 다이얼로그 생성
                alertDialog = alertDialogBuilder.create();

                // 다이얼로그 보여주기
                alertDialog.show();

                break;

            default:
                return false;
        }
        return true;
    }



    protected int getLayoutId(){ return R.layout.activity_main; }

}
