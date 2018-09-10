package com.hyeran.android.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. View Animation
        // 예를 들어 버튼을 화면에 배치하고, 특정 위치로 이동(애니메이션으로)시키면
        // 버튼 클릭은 이동한 곳에서 되지 않고
        // 원래 위치에서 됩니다.

        // 2. Property Animation
        // 실제 화면 요소가 해당 위치로 이동합니다.
    }
}
