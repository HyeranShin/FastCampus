package com.hyeran.android.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingBarActivity extends AppCompatActivity {

    TextView textView;
    RatingBar ratingBar;
    Button buttonMinus, buttonPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        textView = findViewById(R.id.textView);
        ratingBar = findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float ratingNumber, boolean b) {
                textView.setText(ratingNumber+"");
            }
        });

        /* 버튼으로 레이팅바 조절하기 */
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonPlus = findViewById(R.id.buttonPlus);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 현재 rating 값 가져오기
                float current = ratingBar.getRating();

                switch(view.getId()) {
                    case R.id.buttonMinus:
                        ratingBar.setRating(current-0.5f);  // 마이너스 버튼 클릭 시 0.5씩 감소
                        break;
                    case R.id.buttonPlus:
                        ratingBar.setRating(current+0.5f);  // 플러스 버튼 클릭 시 0.5씩 증가
                        break;
                }
            }
        };

        buttonMinus.setOnClickListener(listener);
        buttonPlus.setOnClickListener(listener);
    }
}
