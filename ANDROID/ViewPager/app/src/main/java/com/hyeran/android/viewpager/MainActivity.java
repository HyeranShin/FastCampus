package com.hyeran.android.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    List<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 다형성 사용
        // 상속 시 부모 객체를 타입으로 사용 가능
        fragments.add(new OneFragment());
        fragments.add(new TwoFragment());
        fragments.add(new ThreeFragment());
        fragments.add(new FourFragment());

        viewPager = findViewById(R.id.viewPager);
        // 어댑터를 생성
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), fragments);
        // viewPager에 어댑터를 연결
        viewPager.setAdapter(adapter);
    }
}

// 프래그먼트를 뷰페이저에서 사용할 수 있게 해주는 어댑터
class PagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment> fragments;

    public PagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
