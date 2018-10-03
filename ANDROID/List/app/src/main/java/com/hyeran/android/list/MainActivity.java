package com.hyeran.android.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        spinner = findViewById(R.id.spinner);

        // Spinner - 리스트의 기본이 되는 형태
        // Spinner와 같은 리스트 형태의 뷰를 사용하는 루틴
        // 데이터 <> 아답터 <> 리스트 뷰
        // 1. 화면과 연결
        // 2. 리스트에 입력될 데이터를 정의
        final String data[] = {"월", "화", "수", "목", "금", "토", "일"};

        // 3. 어댑터를 정의 < 데이터
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, data);

        // 4. 스피너(리스트 뷰)에 어댑터를 연결
        spinner.setAdapter(adapter);

        // 5. 스피너 선택 처리하기
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = data[position];
                textView.setText(selected+"요일");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
