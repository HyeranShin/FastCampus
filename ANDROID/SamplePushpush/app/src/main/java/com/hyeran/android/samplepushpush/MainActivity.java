package com.hyeran.android.samplepushpush;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //TODO 맵 밖으로 나갈때 처리
    //TODO 골인 지점에 다다를 때 처리

    FrameLayout frameLayout;
    float widthPixel;
    Stage stage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = findViewById(R.id.frameLayout);
        findViewById(R.id.btnUp).setOnClickListener(this);
        findViewById(R.id.btnDown).setOnClickListener(this);
        findViewById(R.id.btnLeft).setOnClickListener(this);
        findViewById(R.id.btnRight).setOnClickListener(this);

        DisplayMetrics metrics = getResources().getDisplayMetrics();
        widthPixel = metrics.widthPixels;

        // 스테이지 생성하기
        stage = new Stage(this, widthPixel);  // 게임 스테이지를 생성하고
        frameLayout.addView(stage);

        // 맵 생성해서 스테이지에 넘겨주기
        Map map = new Map();
        stage.addMap(map);

        // 플레이어 생성해서 스테이지에 넘겨주기
        Player player = new Player();
        stage.addPlayer(player);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnUp:
                stage.up();
                break;
            case R.id.btnDown:
                stage.down();
                break;
            case R.id.btnLeft:
                stage.left();
                break;
            case R.id.btnRight:
                stage.right();
                break;
        }
    }
}