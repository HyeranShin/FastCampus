package com.hyeran.android.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    OneFragment one;
    TwoFragment two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 트랜잭션을 이용한 프래그먼트 화면 전환
        one = new OneFragment();
        two = new TwoFragment();

        // 1. 프래그먼트 매니저 가져오기
        FragmentManager manager = getSupportFragmentManager();
        // 2. 트랜잭션 시작하기
        FragmentTransaction transaction = manager.beginTransaction();
        // 3. 프래그먼트 삽입 처리
        transaction.add(R.id.frameLayout, one);
        // 4. 트랜잭션 완료 처리 -> 프래그먼트가 액티비티 화면에 주입된다.
        transaction.commit();

    }

    // 프래그먼트 투를 화면에 표시하는 함수
    /*
        addToBackStack 함수는 단순하게 layout.xml을 stack에 담는 것이 아니라
        beginTransaction부터 commit까지를 담는다.
        그래서 backstack에서 뒤로가기를 하게 되면
        트랜잭션 전체를 rollback하는 형태로 동작
     */
    public void next() {
        // 1. 프래그먼트 매니저 가져오기
        FragmentManager manager = getSupportFragmentManager();
        // 2. 트랜잭션 시작하기
        FragmentTransaction transaction = manager.beginTransaction();
        // 3. 프래그먼트 삽입 처리
        transaction.add(R.id.frameLayout, two);
        // 4. 프래그먼트를 backstack에 담아서 뒤로가기를 할 수 있게 만든다.
        transaction.addToBackStack(null);
        // 5. 트랜잭션 완료 처리 -> 프래그먼트가 액티비티 화면에 주입된다.
        transaction.commit();
    }

    public void back() {
        super.onBackPressed();;
    }
}
