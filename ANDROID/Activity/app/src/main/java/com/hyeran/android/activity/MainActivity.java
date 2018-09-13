package com.hyeran.android.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText toSecond, fromSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toSecond = findViewById(R.id.toSecond);
        fromSecond = findViewById(R.id.fromSecond);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다른 액티비티 호출하기 - 시스템에 다른 액티비티를 호출하라고 메시지를 전달
                // 1. Intent 생성
                Intent intent = new Intent(getBaseContext(), SecondActivity.class);

                // 1.1 Intent에 값 담아서 전달하기
                String value = toSecond.getText().toString();
                intent.putExtra("key01", value);

                // 2. 안드로이드에 액티비티를 실행해달라고 Intent를 전달
                startActivityForResult(intent, 999);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // super.onActivityResult(requestCode, resultCode, data);
        // 1. request 코드 체크: 실제 내가 호출한 결과 처리인지 확인
        if(requestCode == 999) {
            // 2. 정상적으로 결과 값이 넘어왔는지 검사
            if(resultCode == RESULT_OK) {
                // 3. 넘어온 결과값 Intent에서 값을 꺼내서 처리
                String temp = data.getStringExtra("key02");
                fromSecond.setText(temp);
            }
        }
    }
}
