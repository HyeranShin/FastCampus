package com.hyeran.android.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button, btnTrans, btnRotate;
    Animation animation, aniTranslate, aniRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. View Animation
        // 예를 들어 버튼을 화면에 배치하고, 특정 위치로 이동(애니메이션으로)시키면
        // 버튼 클릭은 이동한 곳에서 되지 않고
        // 원래 위치에서 됩니다.
        button = findViewById(R.id.button);
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.startAnimation(animation);
            }
        });

        btnTrans = findViewById(R.id.btnTrans);
        aniTranslate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
        btnTrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnTrans.startAnimation(aniTranslate);
            }
        });

        btnRotate = findViewById(R.id.btnRotate);
        aniRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.complex);
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRotate.startAnimation(aniRotate);
            }
        });



        // 2. Property Animation
        // 실제 화면 요소가 해당 위치로 이동합니다.

    }
}
