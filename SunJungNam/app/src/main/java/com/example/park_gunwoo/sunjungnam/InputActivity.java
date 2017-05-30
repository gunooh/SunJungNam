package com.example.park_gunwoo.sunjungnam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static com.example.park_gunwoo.sunjungnam.R.id.LinearLayout1;
import static com.example.park_gunwoo.sunjungnam.R.id.add;
import static com.example.park_gunwoo.sunjungnam.R.id.text2;

public class InputActivity extends AppCompatActivity {

    private LinearLayout LL;
    private Button plusbt;
    private Button okbt;
    private EditText editText;
    private int countView;
    private int ranNum;
    private String Array[];
    private String choice;
//    float paddingTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(android.app.ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_bar);

        setContentView(R.layout.activity_input);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        plusbt = (Button) findViewById(R.id.plusbt);
        plusbt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                LL = (LinearLayout) findViewById(R.id.LinearLayout1);

                LinearLayout.LayoutParams mLayoutParams = (LinearLayout.LayoutParams) plusbt.getLayoutParams();

                if(mLayoutParams.topMargin <= 1100)
                mLayoutParams.topMargin = mLayoutParams.topMargin + 130;

                plusbt.setLayoutParams(mLayoutParams);

                editText = new EditText(InputActivity.this);

                editText.setLayoutParams(new LinearLayout.LayoutParams
                        (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                editText.setHint("선택지를 입력해주세요.");

//                editText.setId(R.id.text+(countView+1));

                LL.addView(editText);
            }
        });
    }

    public void onClickOK(View v)
    {

        List<String> list = new ArrayList<String>();

        LL = (LinearLayout) findViewById(R.id.LinearLayout1);

        for(int i=0; i<LL.getChildCount(); i++)
        {
            LL.getChildAt(i).setId(i+1);
            EditText editText = (EditText) findViewById(i+1);
            list.add(editText.getText().toString());
        }


//        for(int i = 1; i<=LL.getChildCount(); i++)
//        {
//            EditText editText = (EditText)findViewById(R.id.text+i);
//            list.add(editText.getText().toString());
//        }


        ranNum = (int) (Math.random() * LL.getChildCount()  +  0);
        choice = list.get(ranNum);

        Intent intent = new Intent(getApplicationContext(), ChoiceActivity.class);
        intent.putExtra("Object", choice);
        startActivity(intent);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
