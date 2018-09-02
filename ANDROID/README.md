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
protected void onCreate(Bundle savedInstanceState) {
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

☞ 하나의 리스너를 여러 위젯에 등록 가능
```
- 안드로이드에서 github에 업로드하기
```
VCS > Enable Version Control Integration > Git ☞ 하단에 Version Control이라는 도구 탭이 생김

Unversioned Files 우클릭 > Add to VCS ☞ 준비단계로 바뀜
Default 우클릭 > Commit
```

### 22. 레이아웃(<a href="https://github.com/HyeranShin/FastCampus/tree/master/ANDROID/Layout/app/src/main/res/layout">Layout</a>)
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
* 모든 요소들이 겹쳐서 배치
* 모든 레이아웃의 기본이 되는 레이아웃 → 처리 속도가 가장 빠름
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Layout/app/src/main/res/layout/activity_linear.xml">LinearLayout</a>
```
* 요소들을 선형으로 배치
* orientation 요소 필수적으로 추가
    → 가로 축/세로 축 정렬 방향을 결정

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
  * 좌표를 지우고 사용하는 게 컨트롤 하기 편함
  * addView를 사용해서 소스코드에서 요소 삽입 가능
  * 많이 쓰이지는 않음
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Layout/app/src/main/res/layout/activity_table.xml">TableLayout</a>
```
* TableLayout만으로는 요소를 배치할 수 없음. TableRow 필요
* 마치 수직 측 LinearLayout을 하나 놓고, 수평 측 LinearLayout을 층층히 쌓아놓은 형태
    → 이때 수직 측 전체 레이아웃에 해당하는 것이 TableLayout
    → LinearLayout처럼 오른 쪽으로 정렬해주는 역할이 TableRow
* 많이 쓰이지는 않음
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Layout/app/src/main/res/layout/activity_margin_padding.xml">Margin and Padding</a>
```
Margin: 나의 바깥 쪽으로 간격을 조절 → 나의 위치를 변화

Padding: 나의 안 쪽으로 간격을 조절 → 내 안의 요소의 위치를 변화
```
### 23. 텍스트(<a href="https://github.com/HyeranShin/FastCampus/tree/master/ANDROID/Widget/app/src/main/java/com/hyeran/android/widget">Widget</a>)
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/java/com/hyeran/android/widget/TextActivity.java">Text</a>
- TextView (1)
- TextView (2)
```
1줄만 입력할 수 있도록 강제하고 싶을 때 
singleLine 체크, maxLine = 1
  → singleLine은 높은 버전의 OS에서 동작하지 않으므로 singleLine과 maxLine을 같이 줘야 함

안드로이드의 기본 사이즈 단위는 dp이지만,
text에 한해서는 sp라는 단위 사용 → 줌인/줌아웃을 가능하게 하는 크기 단위

activity가 여러 개 일때 원하는 activity 띄우는 법
: manifest.xml 파일에서 <intent-filter/> 옮기기
```
- EditText (1)
- EditText (2)
```
EditText를 클릭하면 소프트 키보드가 나타나는데
Plain Text를 제외한 나머지들은 EditText를 클릭했을 때 나타나는 키보드 모양(inputType)을 바꿔주는 옵션

hint 속성: placeholder라고도 하는데 예를 들어 로그인할 때 password라고 적혀있는 부분을 클릭하면 
           password라는 글자는 사라지고 입력할 수 있도록 바꿔줌
```
```Java
소스코드에서

입력된 글자 가져오기
getText().toString()

글자 입력하기
setText(입력할 텍스트)

글자 지우기
setText("")
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/res/layout/activity_res_string.xml">ResString</a>
- String 리소스 사용하기
```Java
리소스: 소스 코드를 제외한 이미지, mp3, 텍스트 파일 전부

<string name="아이디명">텍스트</string>

사용하는 이유?
액티비티를 여러개 쓸 경우 글자나 메뉴 명이 바뀌면 모든 액티비티의 글자를 하나하나 바꿔줘야한다.
그럴 때 strings.xml에 먼저 정의를 해놓으면 id값을 찾아서 사용하므로 strings.xml만 바꾸면 모든 화면에 반영된다.

☞ 이미지가 아닌 텍스트를 입력할 땐 꼭 strings.xml에 정의하고 사용하기 습관화!
```
- 다국어처리
```
기기에 언어 추가하기
Settings > System > Language preferences > Add a language > 한국어(대한민국)

기기의 Main Language 바꾸기
오른 쪽에 줄 네개짜리 아이콘 드래그해서 첫번째로 옮기기

다국어 처리: 여러 개의 strings.xml을 국가별 버전에 맞춰서 만들어 놓고 각 id에 맞는 글자 입력

strings.xml 오른 쪽에 Opne editor > 지구본 아이콘 
☞ 언어 목록 뜸. 내가 추가하고자 하는 언어 검색해서 선택
☞ strings.xml이 디렉토리로 바뀌면서 언어별로 파일이 생김
☞ defualt language 내용 복사해서 텍스트만 추가한 언어로 수정
☞ 기기의 언어 설정에 따라 파일 참조
```

### 24. 버튼(<a href="https://github.com/HyeranShin/FastCampus/tree/master/ANDROID/Widget/app/src/main/java/com/hyeran/android/widget">Widget</a>)
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/java/com/hyeran/android/widget/ButtonActivity.java">Button</a>
- 버튼 (1)
- 버튼 (2)
```Java
버튼 text에 소문자 입력해도 대문자로 나올 때 해결하는 법
textAllCaps = false

리스너: 자바에 미리 구현되어 있는 인터페이스

onClickListener 등록할 때 new O치면 자동완성

Toast 띄우는 법
Toast.makeText(getBaseContext()/getApplicationText(), "(텍스트내용)", 몇 초).show();
+) 몇 초에 해당하는 변수는 Toast 클래스 안에 정의되어있음
LENGTH_SHORT: 4초, LENGTH_LONG: 8초
```
```Java
버튼을 동작시키는 방법

// 1, 2, 3은 동일한데 형태만 다름

1. 리스너를 익명 클래스로 만들어서 등록
/* 버튼을 사용하는 방법*/
// 가. 화면과 소스 코드 연결
Button click1 = findViewById(R.id.click1); // 아이디명과 변수명은 맞춰주는게 사용하기 편함

// 나. 버튼 리스너 작성
View.OnClickListener listener = new View.OnClickListener() {
  @Override
  public void onClick(View v) { }
};

// 다. 리스너를 버튼에 등록
click1.setOnClickListener(listener);

2. 리스너 익명 클래스를 직접 등록
Button click2 = findViewById(R.id.click2);

click2.setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) { }
});

3. 리스너 인터페이스를 클래스에 구현
Button click3 = findViewById(R.id.click3);
click3.setOnClickListener(this);    // 클래스를 통째로 념겨준다.

클래스에 implements View.OnClickListener ☞ Alt+Enter > Implements method 
☞ 클래스의 멤버 함수로 onClick 생성. 코드 작성

4. 함수를 화면 xml에서 직접 호출
클래스의 멤버 함수로 코드 작성 ☞ xml 파일에서 onClick 속성 값으로 함수 이름
```
- 이미지 버튼 (1)
- 이미지 버튼 (2)
```
mipmap: 아이콘 이미지를 사용하는 디렉토리
drawable: 일반적인 이미지를 사용하는 디렉토리
  -> 사용하는 이미지 해상도에 맞게끔 디렉토리(Android Resource Directory) 생성해야함
  -> drawable-xhdpi, drawable-xxhdpi(Full HD)
```
```
기본적으로 이미지 버튼에 깔려있는 배경 없애는 법
: background 속성 오른쪽 ... 표시 > Resource 창의 Color 탭 > android > trasparent

이미지 버튼에 클릭 효과(눌린 표시) 주기: selector 사용

1. xml 파일에 down 이미지와 up 이미지 링크 걸기
  1.1 drawable 디렉토리 우클릭 > Drawable resource file 생성
  1.2 selector에서 버튼의 상태에 따라 사용되는 이미지 적용
      Pressed 두개를 selector 밑에 갖다 놓는다 
      > 하나는 state_pressed=true ☞ down 이미지
      > 하나는 state_pressed=false(체크 해제) ☞ up 이미지

2. 이미지 버튼에 이미지 링크가 아니라 만들어놓은 xml 파일 링크 걸기
레이아웃의 버튼에 srcCompat 속성 오른쪽 ... 표시 > 만들어놓은 selector 선택
```
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
