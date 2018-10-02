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
- 모든 요소들이 겹쳐서 배치
- 모든 레이아웃의 기본이 되는 레이아웃 → 처리 속도가 가장 빠름
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Layout/app/src/main/res/layout/activity_linear.xml">LinearLayout</a>
```
- 요소들을 선형으로 배치
- orientation 요소 필수적으로 추가
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
- TableLayout만으로는 요소를 배치할 수 없음. TableRow 필요
- 마치 수직 측 LinearLayout을 하나 놓고, 수평 측 LinearLayout을 층층히 쌓아놓은 형태
    → 이때 수직 측 전체 레이아웃에 해당하는 것이 TableLayout
    → LinearLayout처럼 오른 쪽으로 정렬해주는 역할이 TableRow
- 많이 쓰이지는 않음
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
```
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
```
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
```
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
    public void onClick(View v) { }
};

// 다. 리스너를 버튼에 등록
click1.setOnClickListener(listener);

2. 리스너 익명 클래스를 직접 등록
Button click2 = findViewById(R.id.click2);

click2.setOnClickListener(new View.OnClickListener() {
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
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/res/layout/activity_image_button.xml">ImageButton</a>
- 이미지 버튼 (1)
- 이미지 버튼 (2)
```
mipmap: 아이콘 이미지를 사용하는 디렉토리
drawable: 일반적인 이미지를 사용하는 디렉토리
  → 사용하는 이미지 해상도에 맞게끔 디렉토리(Android Resource Directory) 생성해야함
  → drawable-xhdpi, drawable-xxhdpi(Full HD)
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
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/java/com/hyeran/android/widget/CheckboxActivity.java">CheckBox</a>
- 체크박스
```Java
가. 체크 박스가 하나일 때

1. 화면과 소스 코드 연결
CheckBox checkBox = findViewById(R.id.checkBox);

2. 리스너 작성
checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                    // new O까지 치면 자동 완성
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) { }
});

나. 체크 박스가 여러개일 때: 체크 박스를 모두 소스 코드와 연결하고 하나의 리스너를 모든 체크 박스에 등록

1. 화면과 소스 코드 연결
CheckBox a = findViewById(R.id.a);
CheckBox b = findViewById(R.id.b);
CheckBox c = findViewById(R.id.c);

2. 리스너 작성
CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
    // checkBox 클릭 -> buttonView 파라미터로 checkBox가 넘어감 -> getId()로 id를 꺼낼 수 있음
        switch(buttonView.getId()) {
            case R.id.a;
                break;
            case R.id.b;
                break;
            case R.id.c;
                break;
        }
    }
};

a.setOnCheckedChangeListener(listener);
b.setOnCheckedChangeListener(listener);
c.setOnCheckedChangeListener(listener);
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/java/com/hyeran/android/widget/RadioActivity.java">RadioButton</a>
- 라디오버튼
```Java
라디오버튼
- 체크 박스와 유사하나 단독으로 쓰일 수 없음
- 라디오 버튼을 쓰기 위해서는 라디오 버튼을 감싸는 일종의 레이아웃 역할을 하는 라디오 그룹을 먼저 배치
- 라디오 버튼, 라디 오그룹 모두에게 아이디 부여해야 함
- 소스 코드에서는 라디오 그룹만 연결
- default로 선택되는 거 설정: RadioGroup의 checkedButton 속성에서 선택

RadioGroup radioGroup = findViewById(R.id.radioGroup);

radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    public void onCheckedChanged(RadioGroup group, int checkedId) {
    // 선택된 라디오 버튼의 아이디가 두번째 인자로 넘어 옴
        switch (checkedId) {
            case R.id.a:
                break;
            case R.id.b:
                break;
            case R.id.c:
                break;
        }
    }
);
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/res/layout/activity_toggle.xml">ToggleButton</a>
- 토글버튼 (1)
- 토글버튼 (2)
```
ToggleButton 
- 클릭하면 ON <-> OFF 바뀜
- CheckBox랑 모양만 다르다고 생각하면 됨
- CheckBox처럼 OnCheckedListener 사용
- ImageButton처럼 selector를 통해 상태에 따른 이미지 적용 가능
    → 단, Pressed가 아니라 Checked 사용
    → background 속성에 링크 걸어주기

default 값인 ON/OFF 글자 지우기
: 디자인 모드에서 변경 불가. 텍스트 모드에서 textOff, textOn 속성 값으로 "" 추가
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/res/layout/activity_switch.xml">Switch</a>
- 스위치
```
Switch
- CheckBox, ToggleButton과 동일한 동작 원리
- CheckBox, ToggleButton처럼 OnCheckedListener 사용
- 스위치 앞 텍스트의 위치를 바꾸기 어려움 ☞ text 속성을 지우고 옆에 TextView를 가져다 놓는 방법 사용
```

### 25. 위젯(<a href="https://github.com/HyeranShin/FastCampus/tree/master/ANDROID/Widget/app/src/main/java/com/hyeran/android/widget">Widget</a>)
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/res/layout/activity_image.xml">ImageView</a>
- ImageView
```
ImageView
- 기본적인 구조는 ImageButton과 동일

ImageView나 ImageButton을 사용할 때 가장 많이 쓰이는 속성: scaleType
- matrix
    * 이미지의 실제 사이즈대로 보여줌
    * 줄이면 특정 영역만 보여짐
- fitXY
    * XY 좌표를 ImageView안에 구겨 넣어줌
    * 가로, 세로가 늘리는대로 늘어남
- fitStart
    * ImageView의 앞에 채워줌
- fitCenter
    * ImageView의 중간에 채워줌
- fitEnd
    * ImageView의 끝에 채워줌
- center
    * 화면의 실제 사이즈대로 ImageView의 중앙에 맞춰줌
- centerCrop
    * 가장 많이 쓰임 ex) 앨범
    * 원래 이미지의 비율을 깨지않게 잘라서 ImageView에 꽉 채워줌
- centerInside
    * 원래 이미지의 비율을 깨지않는 한에서 ImageView의 중앙에 꽉 채워줌
```
- 이미지리소스 사용하기
```
***리소스 이름 규칙: 소문자, 숫자, '_' 문자만 사용

image resource directory 구성
☞ 해상도에 따라 총 6개의 drawable directory 만들어서 사용

- ldpi(low dpi)
- mdpi(mid dpi): 실제 이미지의 1px이 화면의 1px과 같다.
    → 기준(default) 해상도(320X480)
    → drawable directory와 같은 사이즈
- hdpi(high dpi): 실제 이미지의 1.5px이 화면의 1px과 같다.

고해상도
- xhdpi: 실제 이미지의 2px이 화면의 1px과 같다.
- xxhdpi: 실제 이미지의 3px이 화면의 1px과 같다.
    → 갤럭시 7,8
- xxxhdpi: 실제 이미지의 4px이 화면의 1px과 같다.
    → 갤럭시 노트

안드로이드는 이런 구조를 가지고 있어서 화면 해상도가 다름에도 불구하고 각각의 해상도에 맞게끔 이미지를 표현해줄 수 있다.
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/java/com/hyeran/android/widget/SeekBarActivity.java">SeekBar</a>
- SeekBar
```
SeekBar
- 볼륨 조절, 시간 조절 용도로 많이 사용
- max 속성 값으로 범위 지정
- OnSeekBarChangeListener 사용
    → 3개의 함수 중 onProgressChanged 하나로 처리 가능
    → SeekBar를 드래그 할 때마다 지속적으로 호출
    → SeekBar의 위치가 두 번째 파라미터로 전달
    
SeekBar를 이용해 View의 background 속성 바꾸기

View: 크기와 위치 값만 갖는 위젯

max 속성 값으로 255 설정
    → 왼쪽으로 갈수록 검정, 오른쪽으로 갈수록 색상
setBackgroundColor 함수 사용
    → 컬러는 기본적으로 16진수가 입력돼야 하므로 SeekBar의 위치를 그대로 넣어줄 수 없음
    
0~255를 00~ff로 변환하기
  T R G B
0x00000000 (16진수라는 걸 컴파일러에게 알려주기 위해 앞에 0x를 붙임)

T는 투명 값으로 00을 주면 색이 나타나지 않음, ff로 하면 색이 정상적으로 나타남
R 값 바꾸기: 0xff000000 + seekbar_position * 0x10000
G 값 바꾸기: 0xff000000 + seekbar_position * 0x100
B 값 바꾸기: 0xff000000 + seekbar_position * 0x1 
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/java/com/hyeran/android/widget/RatingBarActivity.java">RatingBar</a>
- RatingBar
```
RatingBar
- 주요 속성
    → numStars: 별 개수 지정
    → rating: 최초 시작하는 별의 개수
    → stepSize: 별을 조절할 수 있는 최소 단위
- OnRatingBarChangeListener 사용
    → ratingNumber가 두번째 파라미터로 전달
- 클릭, 드래그는 별을 조절하는 기본 방법
- 마이너스와 플러스 버튼을 이용해서 조절하기도 함 (setRating 사용)
```

### 26. 컨테이너(<a href="https://github.com/HyeranShin/FastCampus/tree/master/ANDROID/Widget/app/src/main/java/com/hyeran/android/widget">Widget</a>)
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/res/layout/activity_scroll.xml">ScrollView</a>
- ScrollView
```
일반적인 레이아웃은 스크롤 기능이 없으므로
화면 사이즈보다 더 많은 요소가 들어간다고 판단되면 <ScrollView>를 레이아웃의 외곽에 씌워주어야함

ScrollView: 레이아웃 X 컨테이너 O
    → 레이아웃: 내부 요소의 위치를 결정
    → 컨테이너: 내부 요소를 담기만 함 
- ScrollView 안에 레이아웃을 넣고 그 안에 요소를 넣어서 위치 결정
- width와 height를 가져야 함

*) xmlns:, tools:는 namespace로 걸려있는 주소에 가면 아래에서 사용할 속성의 이름들이 정의되어 있음
    ☞ 최상위 레이아웃의 속성이어야 함
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Widget/app/src/main/res/layout/activity_cardview.xml">CardView</a>
- CardView
```
CardView
- 사각형의 모서리를 round 처리 하는게 가장 큰 역할 (cardCornerRadius 속성 사용)
- 애니메이션 처리할 때 CardView가 더 효율적이라고 알려져 있음
- 나머지는 레이아웃과 별 차이 X
- 항상 레이아웃과 같이 써야 함
- padding 적용 불가
```

### [안드로이드 첫번째 프로젝트]
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Calculator/app/src/main/java/com/hyeran/android/calculator/MainActivity.java">Calculator</a>
- 계산기 만들기
```
화면 상에 버튼이 많으므로 View.OnClickListener를 Activity 단위에서 구현하는 게 좋다.
    ☞ 버튼에 OnClickListener를 this로 달아주기

계산
1. 글자 하나하나 
2. 연산자와 숫자를 분리해서 담기
3. 반복문을 돌면서 *와 /를 먼저 처리하기
4. 반복문을 돌면서 +와 -를 처리하기
5. 결과 값을 저장
```

### 27. 애니메이션(<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Animation/app/src/main/java/com/hyeran/android/animation">Animation</a>)
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Animation/app/src/main/java/com/hyeran/android/animation/MainActivity.java">View Animation</a>
- View 애니메이션
```Java
View Animation
- 예를 들어 버튼을 화면에 배치하고, 특정 위치로 이동시키면(애니메이션으로)
  이동한 위치에서는 클릭되지 않고, 원래 위치에서만 클릭된다.
- Animation 클래스 사용

애니메이션 적용하기
1. xml로 애니메이션 동작 정의
    → app > res 우클릭 > Android Resource Directory 
      > Resource type [anim] 생성 후 우클릭 > Animation resource file
2. 코드에 정의한 xml 적용
    → Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.(xml파일이름));
      button.startAnimation(animation);

애니메이션 태그에는 대표적으로 alpah, scale, translate, rotate 네가지가 있고, set을 이용해서 동시에 적용 가능하다.

- alpha: 투명도
- translate: 이동
    → 속성 값은 상대 값으로 0은 현재 위치
- scale: 크기
- rotate: 회전
    → scale과 rotate의 속성 중 pivot은 기준이 되는 중심점
    → default는 왼쪽위이고, 가운데를 중심으로 돌려면 X, Y에 각각 50%

* android: 치면 필요한 속성들 나옴
* 애니메이션이 동작하는 시간: android:duration ☞ 밀리세컨 기준. 1000=1초
* 애니메이션이 끝났을 때 원래 상태로 돌아가지 않으려면 android:fillAfter="true" 추가
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Animation/app/src/main/java/com/hyeran/android/animation/PropAniActivity.java">Property Animation</a>
- Property 애니메이션
```Java
Property Animation
- 실제 화면 요소가 해당 위치로 이동한다.
- ObjectAnimator 클래스 사용

애니메이션 실행하기 <X, Y 좌표 이동>
1. 움직일 대상 연결
btnMove = findViewById(R.id.btnMove);

2. 프로퍼티 애니메이션 생성
// ObjectAnimator는 한번에 하나의 속성만 제어 가능
ObejctAnimator moveX = ObjectAnimator.ofFloat(
    btnMove, // 움직일 대상
    "translationX", // 애니메이션을 적용할 속성. 속성은 구글 공식 사이트에 가면 나와있음
    100 // 속성의 값 
);
ObjectAnimator moveY = ObjectAnimator.ofFloat(
    btnMove,
    "translationY",
    100
);

3. 여러 개의 프로퍼티 애니메이션 합치기
aniSet = new AnimatorSet();
aniSet.playTogether(moveX, moveY);
aniSet.setDuration(5000);

aniSet.start();
```

### 28. Activity
- 액티비티 설정
```
앱의 시작점 설정
AndroidManifest.xml 파일의 <intent-filter> 안의 <action android:name="android.intent.action.MAIN"/>
☞ 자신이 entry point라는 걸 시스템에게 알려준다.

수동으로 Activity 만들기
1. Java Class 생성 > extends AppCompatActivity 추가 > 클래스 정의 줄 우클릭 
   > Generate > Override Methods > onCreate
2. manifest에 추가
<activity android:name=".(액티비티 이름)"></activity>

앱 이름 바꾸기
manifest의 <application> 태그(앱 하나를 가리킴) 속 label 속성 값 수정해야 함
> @string/app_name을 Ctrl + 좌클릭 하면 이동
> app_name 수정 ☞ manifest에 반영
* 바로 수정해도 되지만 다국어 처리 등을 위해서 꼭 string resource에 적어놓고 사용하기
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Activity/app/src/main/java/com/hyeran/android/activity/MainActivity.java">Activity</a>
- 다른 액티비티 호출하기
```Java
시스템에 다른 액티비티를 호출하라고 메세지 전달

1. Intent 생성
Intent intent = new Intent(getBaseConText(), SecondActivity.class); // 내가 호출할 클래스의 full name

2. 안드로이드에 액티비티를 실행해달라고 intent 전달
startActivity(intent);

+) getBaseContext(), getApplicationContext() 차이점

getBaseContext()
- Activity의 Context
- 생성자나 Context에서 기본 설정된 Context

getApplicationContext()
- Service의 Context
- 어플리케이션의 종료 이후에도 활동 가능한 글로벌한 Application의 Context
- 앱 종료 후 메모리 유지를 피하기 위해서 getBaseContext 사용
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Activity/app/src/main/java/com/hyeran/android/activity/MainActivity.java">MainActivity</a>, <a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Activity/app/src/main/java/com/hyeran/android/activity/SecondActivity.java">SecondActivity</a>
- 액티비티 사이에 값 주고 받기
```Java
<값을 전달만 하는 경우>
- MainActivity
Intent에 값 담아서 전달
intent.putExtra(name, value);   // Map 클래스와 동일하게 동작

- SecondActivity
1. MainActivity에서 전달된 Intent 꺼내기
Intent intent = getIntent();

2. Intent에 담긴 값 중에 원하는 값 꺼내기
String value = intent.getStringExtra(name); 
// 숫자로 보내면 숫자를 꺼내는 함수 사용, 문자를 보내면 문자를 꺼내는 함수 사용 

<값을 주고 받는 경우>
- MainActivity 
1. 액티비티 전환할 때 
startActivity(intent) 대신 startActivityForResult(intent, requestCode) 사용

requestCode를 사용하는 이유
예를 들어 값을 전달할 때 동일한 액티비티를 호출하는 버튼이 두개라면 어떤 버튼으로 호출된건지 확인하기 위한 구분 값

2. onActivityResult 함수 구현
클래스 영역 우클릭 > Generate > Override Methods > onActivityResult

2.1 requestCode 체크: 실제 내가 호출한 결과 처리인지 확인
if(requestCode == 999) {
    2.2 정상적으로 결과 값이 넘어왔는 지 검사
    if(resultCode == RESULT_OK) {
        2.3 넘어온 결과 값 Intent에서 값을 꺼내서 처리
        String temp = data.getStringExtra(name);
    }
}

- SecondActivity
1. Intent 생성
Intent intent = new Intent();   // 메세지 객체 생성

2. Intent에 값 담기
intent.putExtra(name, value);

3. 결과 메세지를 전달
setResult(RESULT_OK, intent);
// 모든 처리가 정상적으로 완료됐다는 것을 알려주기 위해서 앞에는 RESULT_OK 메세지, 뒤에는 내가 전달할 메세지 객체 담기

보통 액티비티에서 액티비티로 값을 전달할 때는 시스템을 통해서 인텐트 메세지 전달 ☞ 시스템 리소스 사용
대부분의 경우 인자로 getBaseContext()를 담지만, 메세지를 전달할 때 context를 사용하지 않는 유일한 함수가 setResult

4. 액티비티 종료
finish();
//SecondActivity.this.finish();

* MainActivity에서 startActivityForResult()로 SecondActivity를 호출했을 때만 
  SecondActivity가 finish() 되는 순간 MainActivity의 onActivityResult() 호출
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Activity/app/src/main/java/com/hyeran/android/activity/IntentActivity.java">Intent</a>
- Intent
```Java
Android Intent

1. 명시적 Explicit
new Intent(context, 호출할 대상 명시-activity.class)

2. 암묵적 Implicit
기존에 안드로이드에 이미 정의되어있는 ACTION 사용
Intent를 사용해서 기존에 만들어진 액티비티 자원들을 사용할 수 있다.
각 ACTION에 맞는 Uri로 parse해줘야 하고, 각 ACTION에 맞는 프로토콜도 정의되었다.

가. 전화거는 화면 호출
Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:XXX-XXXX-XXXX"));

나. 문자 보내는 화면 호출
Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:XXX-XXXX-XXXX"));

다. 웹 사이트 화면 호출
Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));

+) 검색 등
```
- Activity Stack
```
Activity Stack: 액티비티가 생성될 때 마다 저장되는 메모리 구조
- 가장 마지막에 들어온 게 가장 먼저 나간다.
- 눈에 보이는 화면은 가장 위에 쌓인 화면
- finish()를 하면 하나씩 없어지면서 바로 아래 화면이 보인다.
```
<a href="https://github.com/HyeranShin/FastCampus/tree/master/ANDROID/ActivityLifeCycle/app/src/main/java/com/hyeran/android/activitylifecycle">ActivityLifeCycle</a>
- Activity Life Cycle
```Java
로그를 출력하는 함수
System.out.println(): 모두 출력
Log.d(): 시스템이 과부하일 경우 로그의 일부 생략 ☞ 시스템 성능에 영향 덜 미침

Log.d(tag, msg);
- tag: 로그 창에서 내가 출력할 로그를 검색하는 용도. 보통 액티비티 이름 사용.
- msg: 로그를 담는 용도

// 플레이어 연결
// 플레이어 재생

@Override
protected void onStart() {
    super.onStart();
}
@Override
protected void onResume() {
    super.onStart();
    // 플레이어 다시 시작
}
@Override
protected void onPause() {
    super.onStart();
    // 플레이어 스탑
}
@Override
protected void onStop() {
    super.onStart();
}
@Override
protected void onDestroy() {
    super.onStart();
}

생명주기는 소멸주기 2개, 생성주기 2개로 구성.
호출되는 액티비티가 화면 전체를 가리면 두개씩(onStart, onResume/onPause, onStop) 호출되고, 
화면 부분을 가리면 하나씩(onResume/onPause) 호출된다.
```

![image](https://user-images.githubusercontent.com/38368820/46249524-b6a7ee80-c465-11e8-9d9a-0ff78cfe6eb6.png)

### 29. Fragment
<a href="https://github.com/HyeranShin/FastCampus/tree/master/ANDROID/Fragment/app/src/main/java/com/hyeran/android/fragment">Fragment</a>
- 프래그먼트 기본
```
Fragment
- Activity 간 이동 시 생기는 과도한 리소스 손실을 보완하는 측면과 
  서로 다른 크기의 화면에 대응하는 데 있어서 레이아웃과 같은 뷰가 아니라 액티비티 수준에서 대응하기 위해 설계된 클래스
- 전체 화면은 Activity가 관리하고, 개별 화면은 Fragment로 구성하여 더 가볍고 구조적으로 접근 가능
- onCreaveView는 Activity의 onCreate와 같음. Fragment가 Activity 화면에 삽입되는 순간 호출
- xml 파일을 View 클래스로 만들어서 Activity에게 넘겨주면 Activity가 화면에 보여줌

Fragment 삽입하는 방법
1. Layouts - FrameLayout
2. Containers - <fragment>
Activity의 뷰에서 내가 사용할 Fragment를 지정 ☞ 소스 코드 상에서 Fragment를 Add하는 과정 필요 X
```
- Fragment 화면이동 -transaction
```Java
transaction을 이용한 Fragment 화면 전환
- Fragment를 컨트롤하는 로직은 Activity에서

// 1. 프래그먼트 매니저 가져오기
FragmentManager manager = getSupportFragmentManager();

// 2. 트랜잭션 시작하기
FragmentTransaction transaction = manager.beginTransaction();

// 3. 프래그먼트 삽입 처리
transaction.add(R.id.frameLayout, one);

// 4. 프래그먼트를 backstack에 담아서 뒤로가기 가능하게 - option
// ***가장 처음에 들어가는 프래그먼트에는 쓰지 않는다.
transaction.addToBackStack(null)
/*
    addToBackStack 함수는 단순하게 layout.xml를 stack에 담는 것이 아니라
    beginTransaction부터 commit까지를 담는다.
    그래서 backstack에서 뒤로가기를 하게 되면 트랜잭션 전체를 rollback하는 형태로 동작
*/

// 5. 트랜잭션 완료 처리 → 프래그먼트가 액티비티 화면에 주입
transaction.commit();

+) clikable 속성을 체크하면 전 Fragment의 버튼이 클릭되는게 방지된다. 
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/Fragment/app/src/main/java/com/hyeran/android/fragment/OneFragment.java">FragmentLifeCycle</a>
- Fragment LifeCycle
```
개발자들은 생명주기 함수들 때문에 Fragment를 잘 사용하지 않는다.
Activity 안에 Fragment를 넣게 되면 거의 20개에 가까운 생명주기 함수를 컨트롤 해야하기 때문에 비효율적이다.
여러 개의 화면을 처리해야 한다면 View를 class로 만들어서 처리한다.
```

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
```
BroadcastReceiver
- 4대 컴포넌트 중에 하나
- Broadcast: 시스템에서 던지는 메세지
  ex) 문자메세지, 배터리 방전, 폰 전원 ON/OFF, 카메라 버튼, 어플 설치, 네트워크 연결, 재부팅
- 앱에서 BroadcastReceiver를 manifest에 등록해서 메세지를 중간에 캐치 할 수 있음
```
<a href="https://github.com/HyeranShin/FastCampus/tree/master/ANDROID/BroadcastReceiver/app/src/main/java/com/hyeran/android/broadcastreceiver">BroadcastReceiver</a>
- 문자메세지 가로채기
```
1. BroadcastReceiver 생성
2. 동작 구현
3. manifest에 내가 받을 메세지의 <intent-filter>를 receiver에 추가
    ☞ priority 속성: 우선 순위 설정. 값이 낮으면 우선해서 메세지 전달, 값이 높으면 시스템이 느린 경우 동작 X
4. 권한이 필요한 경우 권한 추가
```

### [안드로이드 두번째 프로젝트]
<a href="https://github.com/HyeranShin/FastCampus/tree/master/ANDROID/SampleGallery/app/src/main/java/com/hyeran/android/samplegallery">SampleGallery</a>
- 갤러리 만들기 (1)
- 갤러리 만들기 (2)
```Java
안드로이드에서 제공하는 갤러리 호출
Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

갤러리 액티비티를 커스텀으로 만들게 되면 다른 점: 보안(permission) 처리
☞ manifest에 <user-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
```

### 34. CustomView
<a href="https://github.com/HyeranShin/FastCampus/tree/master/ANDROID/ViewPager/app/src/main/java/com/hyeran/android/viewpager">ViewPager</a>
- View Pager
```
List, RecyclerView와 비슷한데 한번에 하나의 아이템 레이아웃만 나온다.
- 만화책처럼 이미지 하나씩만 보여줄 때 뷰페이저에서 기본적으로 제공하는 어댑터 상속받아서 처리
- Fragment를 뷰페이저로 사용할 때 FragmentStatePagerAdapter 사용
```
- Tab Layout
```
탭 추가하기
tabLayout.addTab(tabLayout.newTab().setText(""));

페이저가 변경됨에 따라 자동으로 탭을 변경해주는 리스너
viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

탭이 변경됨에 따라 자동으로 페이저를 변경해주는 리스너
tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
```
- Fragment in ViewPager

<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/CustomView/app/src/main/java/com/hyeran/android/customwidget/Today.java">CustomWidget</a>
- Custom View (1)
```Java
위젯 재정의하기

1. 위젯에서 사용할 속성을 정의 ☞ xml 파일에 정의
// Values resource file 생성
<declare-styleable  name="태그이름">
<attr name="속성이름">

2. 커스텀할 실제 위젯을 상속받아서 재정의 ☞ class 생성
    * 속성의 id = R.styleable.(styleable name)_(attr name)

3. 레이아웃에서 커스텀한 위젯 사용
    * 재정의한 속성은 namespace가 android가 아닌 app(res-auto 링크 받는 namespace)

+) android.support~ 패키지 밑에 있는 클래스들은 하위 버전 호환성이 고려된 클래스
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/ANDROID/CustomView/app/src/main/java/com/hyeran/android/customview/MainActivity.java">CustomView</a>
- Custom View (2)
```
- onDraw를 이용해서 화면에 그리기
    ☞ onDraw: 뷰가 최초로 화면에 호출될 때 호출되는 함수
- Custom View를 만들었으면 기존 레이아웃에 addView 형태로 아주 쉽게 사용 가능
```

### [안드로이드 세번째 프로젝트]
<a href="https://github.com/HyeranShin/FastCampus/tree/master/ANDROID/SamplePushpush">SamplePushpush</a>
- push push 게임 만들기 (1)
- push push 게임 만들기 (2)
- push push 게임 만들기 (3)
- push push 게임 만들기 (4)
