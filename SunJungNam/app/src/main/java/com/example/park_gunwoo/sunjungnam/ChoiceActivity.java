package com.example.park_gunwoo.sunjungnam;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChoiceActivity extends AppCompatActivity {

    String choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        setContentView(R.layout.activity_choice);

        Intent intent = getIntent();
        choice = (String) intent.getSerializableExtra("Object");


        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        // 제목셋팅
        alertDialogBuilder.setTitle("선택 결과");

        // AlertDialog 셋팅
        alertDialogBuilder
                .setMessage(choice)
                .setCancelable(false)
                .setPositiveButton("닫기",
                        new DialogInterface.OnClickListener() {
                            public void onClick(
                                    DialogInterface dialog, int id) {
                                // 프로그램을 종료한다
                                ChoiceActivity.this.finish();
                            }
                        })
                .setNegativeButton("관련 장소 찾기",
                        new DialogInterface.OnClickListener() {
                            public void onClick(
                                    DialogInterface dialog, int id) {

                                Intent intent = new Intent(getApplicationContext(), MapActivity.class);
                                startActivity(intent);

                            }
                        });

        // 다이얼로그 생성
        AlertDialog alertDialog = alertDialogBuilder.create();

        // 다이얼로그 보여주기
        alertDialog.show();

    }

}


