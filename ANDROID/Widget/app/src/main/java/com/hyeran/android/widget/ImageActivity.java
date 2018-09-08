package com.hyeran.android.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        // 이미지 리소스 디렉토리 구성
        // 해상도가 높고 낮음을 나타냄
        // ldpi - low dpi
        // mdpi - mid dpi - 기준 해상도 (320 X 480) - 실제 이미지의 1px이 화면의 1px과 같다.
        // hdpi - high dpi - 실제 이미지의 1.5px이 화면의 1px과 같다.
        // 고해상도
        // xhdpi - 실제 이미지의 2px이 화면의 1px과 같다.
        // xxhdpi - 갤럭시 7,8 - 실제 이미지의 3px이 화면의 1px과 같다.
        // xxxhdpi - 노트 - 실제 이미지의 4px이 화면의 1px과 같다.
    }
}
