package com.hyeran.android.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {

    MainActivity activity;
    Button btnNext;
    View view;

    public OneFragment() {
        // 프래그먼트는 빈 생성자가 꼭 있어야 된다.
        // 여기에 코드 입력하면 에러
    }

    // LC 1
    @Override
    public void onAttach(Context context) { // <- 파리미터의 타입이 context이지만 실제로는 상위의 액티비티 클래스가 담겨서 넘어온다.
        super.onAttach(context);
        // 타입을 체크하는 예약어 사용
        if(context instanceof MainActivity) {
            activity = (MainActivity) context;
        }
    }

    // LC 2
    // - Activity의 onCrate와 비슷한데, 화면 작업은 할 수 없다. 여기서 레이아웃 처리 같은 것이 불가능하다.
    // - 프래그먼트가 화면에서 가려지면, 메모리의 용량에 따라서 아예 삭제되는 경우도 있는데 이럴 때 화면 상태를 저장해놨다가 복원하는 용도
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // LC 3 - 여기가 실제 화면 작업
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_one, container, false);   // 액티비티의 setContentView

        // 여기서 findViewById와 같은 화면 처리를 해준다.
        btnNext = view.findViewById(R.id.btnNext);

        return view;
    }

    // LC 4 - onActivityCreated - 액티비티에서 프래그먼트를 모두 생성하고 난 다음 호출
    //                            액티비티에서 setContentView 함수가 호출 된 다음
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    // LC 5 - 액티비티의 onStart 함수와 동일
    @Override
    public void onStart() {
        super.onStart();
    }

    // LC 6 - onResume
    @Override
    public void onResume() {
        super.onResume();
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.next();
            }
        });
        view.setBackgroundColor(0xff0000ff);
    }

    /*
        Fragment Running - 화면에 보이는 중
     */

    // LC 7
    @Override
    public void onPause() {
        super.onPause();
    }

    // LC 8
    @Override
    public void onStop() {
        super.onStop();
    }

    // LC 9 - 뷰와 관련된 자원을 반납할 때 사용
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        view = null;
        // 예를 들어 비트맵 같은 경우에는 release를 해주지 않으면 사용이 끝나도 안드로이드 시스템이 메모리 수거를 자동으로 할 수 없다.
        // 그럴 경우 이 생명주기 함수에서 release 처리할 수 있다.
    }

    // LC 10
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    // LC 11 - 액티비티에서 제거 될 때
    @Override
    public void onDetach() {
        super.onDetach();
    }
}
