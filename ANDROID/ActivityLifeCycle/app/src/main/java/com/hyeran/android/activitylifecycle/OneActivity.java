package com.hyeran.android.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

// - 액티비티 라이프 사이클
// 최소 두 개의 액티비티가 서로 호출되거나 소멸될 때 작동
// A -> B
public class OneActivity extends AppCompatActivity {
    private static final String TAG = "OneActivity";
    Button btnTwo, btnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 로그를 출력하는 함수
        // System.out.println() - 모두 출력
        // Log.d() - 시스템이 과부하일 경우 로그의 일부를 생략 -> 시스템 성능에 영향을 덜 미침
        Log.d(TAG, "======== onCreate 호출");
        // tag: 로그 창에서 내가 출력할 로그를 검색하는 용도. 보통 액티비티 이름 사용
        // msg: 로그를 담는 용도

        // 플레이어 연결
        // 플레이어 재생

        setContentView(R.layout.activity_one);

        btnTwo = findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), TwoActivity.class);
                startActivity(intent);
            }
        });

        btnThree = findViewById(R.id.btnThree);
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ThreeActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "======== onStart 호출");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "======== onResume 호출");
        // 플레이어 다시 시작
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "======== onPause 호출");
        // 플레이어 스탑
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "======== onStop 호출");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "======== onDestroy 호출");
    }
}
