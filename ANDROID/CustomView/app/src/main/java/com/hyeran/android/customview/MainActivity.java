package com.hyeran.android.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    CustomView stage;   // 게임이 보여지는 영역

    // 게임 치수 값
    float deviceWidth = 0;
    float unit = 0;

    // 플레이어
    float player_size = 0;
    float player_x = 0;
    float player_y = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        frameLayout = findViewById(R.id.frameLayout);
        stage = new CustomView(this);
        frameLayout.addView(stage);
    }

    public void init() {
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        deviceWidth = metrics.widthPixels;
        unit = deviceWidth / 10;
        player_size = unit;
        player_x = deviceWidth / 2;
        player_y = deviceWidth / 2;
    }

    // 좌표 체계: 왼쪽 맨 위가 0, 0
    // 아래, 오른족으로 갈수록 Plus
    public void up(View view) {
        player_y = player_y - unit;
        stage.invalidate(); // onDraw 호출 X
    }

    public void down(View view) {
        player_y = player_y + unit;
        stage.invalidate();
    }

    public void left(View view) {
        player_x = player_x - unit;
        stage.invalidate();
    }

    public void right(View view) {
        player_x = player_x + unit;
        stage.invalidate();
    }

    class CustomView extends View {

        public CustomView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Paint paint = new Paint();
            paint.setColor(Color.RED);
            canvas.drawCircle(player_x, player_y, player_size / 2, paint);
        }
    }
}