package com.hyeran.android.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        // 1, 2, 3번은 모양만 달라보일 뿐 실제로는 완전히 똑같음.

        // 1. 리스너를 익명 클래스로 만들어서 등록

        /* 버튼(뷰)을 사용하는 방법 */
        // 가. 화면과 소스 코드를 연결
        Button click1 = findViewById(R.id.click1);

        // 나. 버튼 리스너를 작성
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "클릭되었습니다 1", Toast.LENGTH_SHORT).show();
            }
        };
        // 다. 리스너를 버튼에 등록
        click1.setOnClickListener(listener);

        // 2. 리스너 익명 클래스를 직접 등록
        Button click2 = findViewById(R.id.click2);

        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "클릭되었습니다 2", Toast.LENGTH_SHORT).show();
            }
        });

        // 3. 리스너 인터페이스를 클래스에 구현
        Button click3 = findViewById(R.id.click3);
        click3.setOnClickListener(this);    // 클래스를 통째로 넘겨준다.


        // 4. 함수를 화면 xml에서 직접 호출

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "클릭되었습니다 3", Toast.LENGTH_SHORT).show();
    }

    public void click4(View v) {
        Toast.makeText(getApplicationContext(), "클릭되었습니다 4", Toast.LENGTH_SHORT).show();
    }
}
