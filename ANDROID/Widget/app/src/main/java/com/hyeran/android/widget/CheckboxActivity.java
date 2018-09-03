package com.hyeran.android.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckboxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        // 가. 체크 박스가 하나일 때
        // 1. 화면과 소스코드 연결
        CheckBox checkBox = findViewById(R.id.checkBox);

        // 2. 리스너 작성
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    Toast.makeText(getApplicationContext(), "체크되었습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "체크가 해제되었습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 나. 체크 박스가 하나 이상일 때
        CheckBox orange = findViewById(R.id.orange);
        CheckBox banana = findViewById(R.id.banana);
        CheckBox apple = findViewById(R.id.apple);

        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // orange 클릭 -> buttonView 파라미터로 orange가 넘어감 -> orange의 id를 꺼낼 수 있음

                String name = "";

                switch(buttonView.getId()) {
                    case R.id.orange:
                        name = "오렌지";
                        break;
                    case R.id.banana:
                        name = "바나나";
                        break;
                    case R.id.apple:
                        name = "사과";
                        break;
                }
                if(isChecked) {
                    Toast.makeText(getApplicationContext(), name+"가 선택되었습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), name+"가 선택 해제되었습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        };

        orange.setOnCheckedChangeListener(listener);
        banana.setOnCheckedChangeListener(listener);
        apple.setOnCheckedChangeListener(listener);
    }
}
