package com.hyeran.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult = findViewById(R.id.textResult);
        // 버튼에 리스너를 달아준다.
        findViewById(R.id.btn0).setOnClickListener(this);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn7).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);
        findViewById(R.id.btnPlus).setOnClickListener(this);
        findViewById(R.id.btnMinus).setOnClickListener(this);
        findViewById(R.id.btnMultiply).setOnClickListener(this);
        findViewById(R.id.btnDivide).setOnClickListener(this);
        findViewById(R.id.btnBack).setOnClickListener(this);
        findViewById(R.id.btnCalc).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String result = textResult.getText().toString();
        if (result.equals("0"))
            result = "";
        String temp = "";
        switch (view.getId()) {
            case R.id.btn0:
                temp = "0";
                break;
            case R.id.btn1:
                temp = "1";
                break;
            case R.id.btn2:
                temp = "2";
                break;
            case R.id.btn3:
                temp = "3";
                break;
            case R.id.btn4:
                temp = "4";
                break;
            case R.id.btn5:
                temp = "5";
                break;
            case R.id.btn6:
                temp = "6";
                break;
            case R.id.btn7:
                temp = "7";
                break;
            case R.id.btn8:
                temp = "8";
                break;
            case R.id.btn9:
                temp = "9";
                break;
            case R.id.btnPlus:
                temp = "+";
                break;
            case R.id.btnMinus:
                temp = "-";
                break;
            case R.id.btnMultiply:
                temp = "*";
                break;
            case R.id.btnDivide:
                temp = "/";
                break;
            case R.id.btnBack:
                result = back();
                break;
            case R.id.btnCalc:
                result = calc();
                break;
        }

        textResult.setText(result + temp);
    }

    private String back() {
        String result = textResult.getText().toString();
        return result.substring(0,result.length()-1);
    }

    private String calc() {
        String result = textResult.getText().toString();
        // 계산
        // 46 + 95 - 32 * 5
        // 1. 연산자와 숫자 분리
        String arrTemp[] = result.split("");  // 다 쪼개준다.
        // 2. 연산자와 숫자를 분리해서 담는다.
        List<String> arr2 = new ArrayList<>();
        String number = "";
        for(String item : arrTemp) {
            if(item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")) {
                arr2.add(number);
                number = "";
                arr2.add(item);
            }
            else
                number += item;
        }
        arr2.add(number);

        // 반복문을 돌면서 *와 /를 먼저 처리한다.
        for(int i=0; i<arr2.size(); i++) {
            String item = arr2.get(i);
            if(item.equals("*") || item.equals("/")) {
                int prev = Integer.parseInt(arr2.get(i-1));
                int next = Integer.parseInt(arr2.get(i+1));
                int calculated = 0;
                if(item.equals("*"))
                    calculated = prev * next;
                else
                    calculated = prev / next;
                arr2.set(i, calculated+"");
                arr2.remove(i+1);
                arr2.remove(i-1);
            }
        }

        // 반복문을 돌면서 +와 -를 처리한다.
        for(int i=0; i<arr2.size(); i++) {
            String item = arr2.get(i);
            if(item.equals("+") || item.equals("-")) {
                int prev = Integer.parseInt(arr2.get(i-1));
                int next = Integer.parseInt(arr2.get(i+1));
                int calculated = 0;
                if(item.equals("+"))
                    calculated = prev + next;
                else
                    calculated = prev - next;
                arr2.set(i, calculated+"");
                arr2.remove(i+1);
                arr2.remove(i-1);
            }
        }
        // 결과 값을 저장
        return arr2.get(0);
    }
}
