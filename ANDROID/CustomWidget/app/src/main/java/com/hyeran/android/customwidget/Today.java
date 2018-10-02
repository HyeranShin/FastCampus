package com.hyeran.android.customwidget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Today extends android.support.v7.widget.AppCompatTextView {
    public Today(Context context, @Nullable AttributeSet attrs) {
        // xml 파일에서 태그 안에 사용한 속성들이 다 AttributeSet으로 넘어온다.
        super(context, attrs);
        // 1. attrs.xml에 정의된 속성을 가져온다.
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Today);   // 내가 정의한 속성만 꺼냄
        // 2. 해당 이름으로 정의된 속성의 개수를 가져오고
        int size = typedArray.getIndexCount();
        // 3. 해당 속성에 대한 처리
        for(int i=0; i<size; i++) {
            // 가. 현재 속성의 아이디를 가져오기
            int current_attr = typedArray.getIndex(i);
            switch (current_attr) {
                case R.styleable.Today_delimeter:
                    String delimeter = typedArray.getString(current_attr);
                    setToday(delimeter);
                    break;
            }
        }
    }
    // 오늘 날짜를 현재 위젯에 입력하는 함수
    private void setToday(String delimeter) {
        // 1. 오늘 날짜 가져오고
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();
        // 2. delimeter로 포메팅
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy"+delimeter+"MM"+delimeter+"dd");
        String text = sdf.format(today);
        // 3. 최종 텍스트를 현재 위젯에 입력
        setText(text);
    }
}
