package com.example.praticefile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private CheckBox chk_red, chk_green, chk_blue;
    private TextView tv_result;
    private Button btn_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk_red = findViewById(R.id.chk_red);
        chk_green = findViewById(R.id.chk_green);
        chk_blue = findViewById(R.id.chk_blue);
        btn_result = findViewById(R.id.btn_result);
        tv_result = findViewById(R.id.tv_result);

        btn_result.setOnClickListener(new View.OnClickListener() { //결과 버튼을 클릭했을 때 액션
            @Override
            public void onClick(View v) {
                String str_result = ""; // 클릭될 때 마다 초기화가 되도록
                if(chk_red.isChecked()){  //빨간 체크 박스에 체크가 되어있다면
                    str_result += chk_red.getText().toString();
                }
                if(chk_green.isChecked()){ //초록 체크 박스에 체크가 되어있다면
                    str_result += chk_green.getText().toString();
                }
                if(chk_blue.isChecked()){ //파란 체크 박스에 체크가 되어있다면
                    str_result += chk_blue.getText().toString();
                }
                tv_result.setText(str_result);
            }



        });

    }
}