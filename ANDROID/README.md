# ANDROID

### 21. 안드로이드 설치 및 둘러보기
- 안드로이드 스튜디오 다운로드 및 설치
- 안드로이드 스튜디오 다운로드 및 설치 - 추가설명
- 스튜디오 둘러보기
- 에뮬레이터

<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/HelloAndroid/app/src/main/java/com/hyeran/android/helloandroid/MainActivity.java">HelloAndroid</a>
```Java
화면과 소스코드 연결하기 - fineViewById()

첫번째 방법: onCreate 바깥에 변수 선언
Button bt;
protected void onCreated(Bundle savedInstanceState) {
    tv = findViewById(R.id.아이디명);
}

두번째 방법: final 예약어 사용
final Button bt = findViewById(R.id.아이디명);
```
```Java
버튼 클릭 처리 - 리스너 등록 

bt.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) { }
});

↑ 풀어서 쓰면 
// 앞으로 실행할 리스너 생성
View.onClickListener listener = new View.OnClickListener() {
    public void onClick(View v) { }
};
// 위에서 작성한 리스너 등록
bt.setOnClickListener(listener);
```
- 안드로이드에서 github에 업로드하기
```
VCS > Enable Version Control Integration > Git ☞ 하단에 Version Control이라는 도구 탭이 생김

Unversioned Files 우클릭 > Add to VCS ☞ 준비단계로 바뀜
Default 우클릭 > Commit
```

### 22. 레이아웃
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Layout/app/src/main/res/layout/activity_constraint.xml">ConstraintLayout</a>
```
레이아웃과 요소 간에 constraint를 조절해서 위치 결정
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Layout/app/src/main/res/layout/activity_relative.xml">RelativeLayout</a>
```
요소 간에 관계를 가지고 배치
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Layout/app/src/main/res/layout/activity_frame.xml">FrameLayout</a>
```
모든 요소들이 겹쳐서 배치
모든 레이아웃의 기본이 되는 레이아웃 → 처리 속도가 가장 빠름
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Layout/app/src/main/res/layout/activity_linear.xml">LinearLayout</a>
```
요소들을 선형으로 배치
orientation 요소 필수적으로 추가 (가로 축/세로 축 정렬 방향을 결정)

LinearLayout을 자주 쓰는 가장 큰 이유?
layout_weight 속성을 사용해서 화면에 꽉 채우기가 편함

weight: 전체 비율 대비 내가 차지하는 비중
  → weight를 쓸 때는 width/height를 0dp로 바꿔야함
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Layout/app/src/main/res/layout/activity_grid.xml">GridLayout</a>
```
GirdLayout: 특정 영역을 지정해놓고 그 안에 들어갈 요소들의 위치를 결정
GridView: 목록처럼 스크롤로 화면의 요소들을 볼 수 있도록 함 (컨테이너 역할)

GridLayout
  * column과 row 값으로 요소의 좌표(위치) 결정
  * columnCount, rowCount 요소를 이용해서 좌표를 입력하지 않은 요소가 count를 넘어가게 되면 자동으로 다음 줄에 배치
  * span 속성을 이용해서 셀과 셀을 합칠 수 있음
  * 좌표를 지우고 사용하는게 컨트롤 하기 편함
  * addView 사용해서 소스코드에서 요소 삽입 가능
  * 많이 사용하지는 않음
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Layout/app/src/main/res/layout/activity_table.xml">TableLayout</a>
```
TableLayout만으로는 요소를 배치할 수 없음. TableRow 필요
마치 수직 측 LinearLayout을 하나 놓고, 수평 측 LinearLayout을 층층히 쌓아놓은 형태
  -> 이때 수직 측 전체 레이아웃에 해당하는 것이 TableLayout, LinearLayout처럼 오른 쪽으로 정렬해주는 역할이 TableRow
많이 쓰이지는 않음
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Layout/app/src/main/res/layout/activity_margin_padding.xml">Margin and Padding</a>
```
Margin: 나의 바깥 쪽으로 간격을 조절 → 나의 위치를 변화

Padding: 나의 안 쪽으로 간격을 조절 → 내 안의 요소의 위치를 변화
```

### 23. 텍스트
- TextView (1)
- TextView (2)
- EditText (1)
- EditText (2)
- String 리소스 사용하기
- 다국어처리

### 24. 버튼
- 버튼 (1)
- 버튼 (2)
- 이미지 버튼 (1)
- 이미지 버튼 (2)
- 체크박스
- 라디오버튼
- 토글버튼 (1)
- 토글버튼 (2)
- 스위치

### 25. 위젯
- ImageView
- 이미지리소스 사용하기
- SeekBar
- RatingBar

### 26. 컨테이너
- ScrollView
- CardView

### [안드로이드 첫번째 프로젝트]
- 계산기 만들기

### 27. 애니메이션
- View 애니메이션
- Property 애니메이션

### 28. Activity
- 액티비티 설정
- 다른 액티비티 호출하기
- 액티비티 사이에 값 주고 받기
- Intent
- Activity Stack
- Activity LifeCycle

### 29. Fragment
- 프래그먼트 기본
- Fragment 화면이동 - transaction
- Fragment LifeCycle

### 30. List
- Spinner
- ListView
- ListView 재사용하기
- ListView에 Holder 패턴 적용하기
- RecyclerView
- RecyclerView 화면이동
- RecyclerView Animation

### 31. Permission
- Manifest
- Gradle
- 설치 시 권한
- WebView
- 실행 시 권한
- 비전호환처리

### 32. Content Provider
- ContentProvider
- 전화번호부 가져오기 (1)
- 전화번호부 가져오기 (2)
- 전화번호부 가져오기 (3)
- 전화번호부 가져오기 (4)

### 33. Broadcast Receiver
- Broadcast Receiver
- 문자메세지 가로채기

### [안드로이드 두번째 프로젝트]
- 갤러리 만들기 (1)
- 갤러리 만들기 (2)

### 34. CustomView
- View Pager
- Tab Layout
- Fragment in ViewPager
- Custom View (1)
- Custom View (2)

### [안드로이드 세번째 프로젝트]
- push push 게임 만들기 (1)
- push push 게임 만들기 (2)
- push push 게임 만들기 (3)
- push push 게임 만들기 (4)
