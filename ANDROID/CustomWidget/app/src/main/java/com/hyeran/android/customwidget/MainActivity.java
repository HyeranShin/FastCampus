package com.hyeran.android.customwidget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 위젯 재정의 하기 - custom
 * 1. 위젯에서 사용할 속성을 정의 -> xml 파일에 정의
 * 2. 커스텀할 실제 위젯을 상속받아서 재정의 -> class 생성
 * 3. 레이아웃에서 커스텀한 위젯을 사용
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
