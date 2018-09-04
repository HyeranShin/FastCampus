package com.hyeran.android.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // 선택된 라디오 버튼의 아이디가 두번째 인자로 넘어옴
                switch (checkedId) {
                    case R.id.orange:
                        Toast.makeText(getApplicationContext(), "오렌지가 선택되었습니다.", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.banana:
                        Toast.makeText(getApplicationContext(), "바나나가 선택되었습니다.", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.apple:
                        Toast.makeText(getApplicationContext(), "사과가 선택되었습니다.", Toast.LENGTH_SHORT).show();
                         break;
                }
            }
        });
    }
}
