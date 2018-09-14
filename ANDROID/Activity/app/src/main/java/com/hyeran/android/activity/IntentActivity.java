package com.hyeran.android.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentActivity extends AppCompatActivity {

    Button btnCall, btnSms, btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        btnCall = findViewById(R.id.btnCall);
        btnSms = findViewById(R.id.btnSms);
        btnSend = findViewById(R.id.btnSend);

        /*Android Intent*/
        // 1. 명시적 Explicit
        // new Intent(context, 호출할 대상 명시 activity.class)

        // 2. 암묵적 Implicit
        // 호출할 대상이 값으로 이미 정의가 되어 있다.
        // 가. 전화거는 화면 호출
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-1234-5678"));
                startActivity(intent);
            }
        });

        // 나. 문자보내는 화면 호출
        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:010-1234-5678"));
                startActivity(intent);
            }
        });
        // 다. 웹 사이트 화면 호출
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com")); // 네트워크 권한이 필요!
                startActivity(intent);
            }
        });
    }
}
