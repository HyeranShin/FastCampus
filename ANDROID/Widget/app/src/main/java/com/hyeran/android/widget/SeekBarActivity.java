package com.hyeran.android.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarActivity extends AppCompatActivity {

    TextView textView;
    SeekBar seekBar;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        textView = findViewById(R.id.textView);
        seekBar = findViewById(R.id.seekBar);
        view = findViewById(R.id.view);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int position, boolean b) {
                                                        // position: SeekBar의 위치
                textView.setText(position+"");
                // setText에 숫자 넣으면 X. +""로 문자열 변환

                // T(투명) R G B
                // 00000000 ~ ffffffff

                view.setBackgroundColor(
                    0xff000000
                    + position * 0x10000
                    // + green * 0x100
                    // + blue
                );
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
