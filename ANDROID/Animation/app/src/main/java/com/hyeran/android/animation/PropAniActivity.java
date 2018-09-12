package com.hyeran.android.animation;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PropAniActivity extends AppCompatActivity {

    Button btnMove;
    ObjectAnimator moveX, moveY;
    AnimatorSet aniSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prop_ani);

        // 1. 움직일 대상을 연결
        btnMove = findViewById(R.id.btnMove);

        // 2. 프로퍼티 애니메이션 생성
        moveX = ObjectAnimator.ofFloat(
                btnMove, // 움직일 대상
                "translationX", // 애니메이션을 적용할 속성
                100 // 속성의 값
        );

        moveY = ObjectAnimator.ofFloat(
                btnMove, // 움직일 대상
                "translationY", // 애니메이션을 적용할 속성
                100 // 속성의 값
        );

        // 3. 여러 개의 프로퍼티 애니메이션을 합친다
        aniSet = new AnimatorSet();
        aniSet.playTogether(moveX, moveY);
        aniSet.setDuration(5000);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aniSet.start();
            }
        });
    }
}
