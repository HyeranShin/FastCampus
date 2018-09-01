package com.hyeran.android.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    TextView textView1, textView2;
    EditText editText;
    Button btnUp, btnRight, btnDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        // 화면과 소스코드 연결
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);

        btnUp = findViewById(R.id.btnUp);
        btnRight = findViewById(R.id.btnRight);
        btnDown = findViewById(R.id.btnDown);

        // 리스너 작성
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = "";
                switch(v.getId()) {

                    case R.id.btnUp:
                        // 1. EditText에 입력된 글자를 가져온다.
                        text = editText.getText().toString();
                        // 2. textView1에 해당 글자를 입력하고
                        textView1.setText(text);
                        // 3. EditText에 입력된 글자는 지운다.
                        editText.setText("");
                        break;
                    case R.id.btnRight:
                        // 1. textView1의 글자를 가져와서 textView2에 입력하고 textView1의 글자는 지운다.
                        text = textView1.getText().toString();
                        textView2.setText(text);
                        textView1.setText("");
                        break;
                    case R.id.btnDown:
                        // 1. textView2의 글자를 가져와서 editText에 입력하고 textView2의 글자는 지운다.
                        text = textView2.getText().toString();
                        editText.setText(text);
                        textView2.setText("");
                        break;
                }
            }
        };

        // 버튼에 리스너 연결
        btnUp.setOnClickListener(listener);
        btnRight.setOnClickListener(listener);
        btnDown.setOnClickListener(listener);
    }
}
