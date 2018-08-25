package com.hyeran.android.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {    // 자바의 메인함수 역할
        super.onCreate(savedInstanceState);

        // 현재 액티비티에서 activity_main 파일을 화면으로 사용하겠다.
        setContentView(R.layout.activity_main);

        // 화면과 소스코드 연결하기 - findViewById()
        tv = findViewById(R.id.textView);
        //final TextView tv = findViewById(R.id.textView);
        bt = findViewById(R.id.button);

        // 버튼 클릭 처리 - 리스너 등록
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Hello Android!");
            }
        });

        // 풀어서 쓰면
        // 버튼 클릭 처리 - 앞으로 실행할 리스너 생성
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Hello Android");
            }
        };

        // 위에서 작성한 리스너 등록
        bt.setOnClickListener(listener);
    }
}
