package com.hyeran.android.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView valueText;
    Button btnFinish;
    EditText toMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        valueText = findViewById(R.id.valueText);
        btnFinish = findViewById(R.id.btnFinish);
        toMain = findViewById(R.id.toMain);

        // 1. MainActivity에서 전달된 Intent 꺼내기
        Intent intent = getIntent();

        // 2. Intent에 담긴 값 중에 key01을 가진 값 꺼내기
        String value = intent.getStringExtra("key01");

        // 3. 꺼낸 값 화면에 표시하기
        valueText.setText(value);

        // 4. SecondActivity 종료하기
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // SecondActivity의 editText에 있는 값을 나를 호출한 액티비티로 돌려주기
                try {
                    // 4.1 값 가져오기
                    String temp = toMain.getText().toString();
                    // 4.2 인텐트를 생성하고
                    Intent intent = new Intent();   // 메세지 객체 생성
                    // 4.3 인텐트에 값을 담고
                    intent.putExtra("key02", temp);
                    // 4.4 결과 메세지를 전달
                    setResult(RESULT_OK, intent);
                } catch(Exception e) {
                    setResult(RESULT_CANCELED);
                }

                finish();
                //SecondActivity.this.finish();
            }
        });
    }
}
