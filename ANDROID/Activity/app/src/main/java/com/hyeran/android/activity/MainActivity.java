package com.hyeran.android.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다른 액티비티 호출하기 - 시스템에 다른 액티비티를 호출하라고 메시지를 전달
                // 1. Intent 생성
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                // 2. 안드로이드에 액티비티를 실행해달라고 intent를 전달
                startActivity(intent);
            }
        });
    }
}
