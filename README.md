# FastCampus
안드로이드 앱 개발 시작하기 CAMP 수강 (18.07.15-)

### 1. 프로그램 다운로드 및 설치 & 2. 이클립스 프로젝트 구조
<a href="https://github.com/HyeranShin/FastCampus/tree/master/TestProject/src/com/hyeran/testproject">TestProject</a>
- 새 프로젝트 생성 및 테스트
- 이클립스 한글처리
```
1. 깨지는 것 대비
Window > Preferences > General > Workspace > Text file encoding > utf-8

2. 글자 폰트 변경
Window > Preferences > General > Colors and Fonts > Basic > Text Font
```
- 프로젝트 구조
- 패키지
- 클래스
- 함수 및 프로그램 시작점 entry point

### 3. 코딩 규칙 및 변수 다루기
<a href="https://github.com/HyeranShin/FastCampus/tree/master/CodingRule/src/com/hyeran/codingrule">CodingRule</a>
- 코드 작성 규칙
```
1. 패키지 이름: 모두 소문자로

2. 클래스 이름: 낙타 표기법
  * 영어 단어: 첫번째 글자는 대문자, 두번째 글자부터는 소문자로
  * 복합 단어: 두번째 혹은 세번째 명사의 첫번째 글자를 대문자로
  
3. 함수 이름: 낙타 표기법-첫번째 글자 소문자로

4. 세미콜론: 문장의 끝, 줄의 끝에 세미콜론(;) 입력

5. 블럭(scope): 하나의 영역으로 내부에 선언된 변수나 함수들은 동일한 영역에서 실행되는 것으로 간주

6. 칸 띄우기(space): 연속된 칸 띄우기는 하나의 공간으로 인식

7. 주석: 개발자가 알아보기 위해서 부가적인 정보를 적어 넣는 것
   7.1 한줄 주석 처리
   // 안녕
   7.2 여러 줄 주석 처리
   /* 안
    * 녕
    */
   7.3 Java 문서를 만들 때 사용하는 주석
   /**
    * 클래스에 대한 설명
    */
    
8. 식별자
   * 첫번째 글자로는 영문, 한글, 밑줄(_), 달러($)만 사용 가능 (영문만 사용할 것 권장)
   * 키워드는 식별자로 사용 불가능
   * 낙타 표기법 
```
- 들여쓰기

<a href="https://github.com/HyeranShin/FastCampus/blob/master/VariableConstant/src/com/hyeran/variableconstant/VariableConstant.java">VariableConstant</a>
- 변수와 상수
```JAVA
1. 변수: 타입 변수이름;
int number = 57;

2. 상수: 변수와 유사하나 값 변경 불가능, 보통 대문자로 작성
final double PI = 3.141592;
```

<a href="https://github.com/HyeranShin/FastCampus/tree/master/DataType/src/com/hyeran/datatype/DataType.java">DataType</a>
- 자료형
```JAVA
데이터 타입: 변수에 담을 값의 크기를 결정하는 표식

가. 기본형(primitive type): 값이 저장될 수 있는 공간의 크기가 정해져 있다.
1. 논리형
boolean type_boolean = true;

2. 문자형
char type_char = '값';

3. 정수형
byte type_byte = 127;      // 1byte: -128~127
short type_short = 32767;  // 2byte: -32768~32767
int type_int = 23132123;   // 4byte: ~2147483647
long type_long = 1312312154654L;    // 8byte: ~9223372036854775807
* 모든 숫자 값을 int로 인식하므로 long 타입이더라도 숫자 값이 int의 범위를 넘어서면 L을 붙여서 long 타입이라는 것을 
   알려주어야 함

4. 실수형
float type_float = 3.141592F;   // 4byte
double type_double = 3.141592;  // 8byte

5. String
String str = "안녕하세요";

나. 참조형(reference type): 값이 저장될 수 있는 공간의 크기가 변할 수 있음
클래스: 대표적으로 문자열을 저장하는 String 클래스가 있음
```

<a href="https://github.com/HyeranShin/FastCampus/tree/master/ArrayType/src/com/hyeran/arraytype/ArrayType.java">ArrayType</a>
- 배열
```JAVA
선언하는 방법: int[] array; 혹은 int array[];

가. 선언과 동시에 초기화
int array[] = new int[5];

나. 선언한 후에 초기화
int array[];
array = new int[5];

다. 값으로 초기화
String array[] = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
```

<a href="https://github.com/HyeranShin/FastCampus/tree/master/TypeCasting/src/com/hyeran/typecasting/Typecasting.java">TypeCasting</a>
- 타입캐스팅
```JAVA
자료형 변환이 필요한 이유
1. 큰 자료형을 작은 자료형에 넣을 수 없음
2. 정수형 연산의 결과 값은 int 임
3. 문자 10과 숫자 10은 다름

가. 기본형 변환
long a = 35;
[X] int b = a;
[O] int b = (int)a;

byte b1 = 15;
byte b2 = 27;
[X] byte b3 = b1 + b2;
[O] byte b3 = (byte)(b1 + b2);

나. 숫자 -> 문자 변환
String numStr = String.valueOf(num);
String numStr = num + "";
// 활용법) 자릿수 알아내기: numStr.length();

다. 문자 -> 숫자 변환
long result = Long.parseLong(str);
double result = Double.parseLong(str);
int result = Integer.parseInt(str);
```

<a href="https://github.com/HyeranShin/FastCampus/tree/master/Operator/src/com/hyeran/operator/Operator.java">Operator</a>
- 연산자
```
1. 대입 연산자 =

2. 산술 연산자 * / + - %(모드: 나머지 연산자)

3. not 연산자 !(연속해서도 사용 가능(!!!))

4. 관계 연산자 == > < != !!!
   * 비교 연산자(==)와 대입 연산자(=) 구분
   
5. 논리 연산자
   AND(&&): 두 항이 모두 참이면 참 리턴
   OR(||): 두 항 중 하나라도 참이면 참 리턴
   * short-circuit
   가. A && B: A가 false이면 B의 값을 확인하지 않음
   나. A || B: A가 true이면 B의 값을 확인하지 않음
   
6. 삼항 연산자
조건식? 값1(true) : 값2(false);
pass = (english_score > cut_line)? true : false;
```

### 4. Eclipse Run
- run 버튼
- JDK와 JRE로 보는 코드처리 과정
![image](https://user-images.githubusercontent.com/38368820/42943691-710977a4-8b9e-11e8-821c-e15679b181b0.png)

### 5. 문자열 String 다루기
<a href="https://github.com/HyeranShin/FastCampus/tree/master/String/src/com/hyeran/string">String</a>
- 자주 사용되는 String 함수 (1)
- 자주 사용되는 String 함수 (2)
```JAVA
1. 문자열 비교: equals
   대소문자 구분하지 않고 비교: equalsignoreCase
   'A'.equals('A');
   
2. 문자열 합치기: concat
   "안녕".concat("하세요");
   
3. 문자열 길이(공백 포함): length 
   str.length();
   
4. 시작 또는 마지막 문자: startsWith, endsWith
   name.startsWith("김");
   
5. 특정 위치의 문자 반환: charAt
   name.charAt(0);
   
6. 문자열 교체: replace, replaceAll  
   str.replace('A', 'B');
   
7. 구분자로 문자열 분리: split
   str.split(" ");
    
8. 특정 위치의 문자열 추출: substring
      A   B   C   D   E
    0   1   2   3   4   5
   str.substring(3, 5);
   
9. 문자열 검색
   indexOf: 인덱스 위치 반환, 문자열이 없으면 -1을 리턴
   contains: 리턴 타입이 boolean(true or false)
   str.indexOf("37");
   str.contains("37");
   
10. 공백 제거: trim
    * 처음이나 마지막 공백만 제거
    * 중간의 공백을 제거하고 싶으면 replaceAll(" ", "") 사용
    " 안녕하세요! ".trim();
    
11. 대소문자 변환(영문에만 해당): toLowerCase, toUpperCase
    "abc".toUpperCase();
```
- 문자열 함수 사용 예 (로그인 처리)

### 6. 조건문 (<a href="https://github.com/HyeranShin/FastCampus/blob/master/Condition/java%20%EC%A0%9C%EC%96%B4%EB%AC%B8.pdf">pdf</a>)
<a href="https://github.com/HyeranShin/FastCampus/tree/master/Condition/src/com/hyeran/condition">Condition</a>
- if
- switch
```JAVA
switch의 기본 구조

switch(변수) {
case 1:
    // 실행코드
    break;
case 2:
    // 실행코드
    break;
case 3:
    // 실행코드
    break;
...
위의 모든 casd와 매치되지 않을 경우 default의 코드 실행
default:
    // 실행코드
}
```
- switch문에서 break 없애기
```JAVA
break를 붙이는 이유: 특정 값을 충족하면 이후에 나오는 모든 case문 실행

이를 활용하는 법
switch(A) {
case 1:
case 2:
    System.out.println("3 미만 입니다.");
    break;
case 3:
case 4:
case 5:
    System.out.println("3 이상 입니다.");
    break;
```
- if와 switch, 어떤게 좋을까?

### 7. 반복문 
<a href="https://github.com/HyeranShin/FastCampus/tree/master/Loop/src/com/hyeran/loop">Loop</a>
- for
- 중첩 for
- 배열에서 반복문 사용하기
```JAVA
for (int index=0; index < array.length; index = index+1) { }
// cf) 문자열.length(), 배열.length

향상된 for문
array의 개수만큼 반복하면서 반복할 때 마다 증가된 인덱스의 값을 변수에 담는다.
for (int item : array) {}

무한 루프
for ( ; ; ) {}
```
- 구구단 출력하기
```
println: 줄을 바꿔주는 역할
printf: 특수 문자와 변수를 치환해주는 역할
```
- break_continue
```JAVA
break: for문 종료
continue: 해당 조건만 생략

레이블을 이용해서 내부 for문에서 외부 for문 제어 가능
레이블명 : for() {
    for() {
        break 레이블명;
    }
}

out : for(int a = hegin; a <= end; a = a+1) {
   for(int b = 1; b <= offset; b = b+1) {
       1. if (b > 7) break;      // 7 이후 출력 X
       2. if (b == 7) continue;  // 7만 생략
       3. if (b == 7) break out; // 외부 for문 종료
   }
}
```
- while_dowhile
```JAVA
while: for문과 달리 시작 값과 종료 값이 명확하지 않거나 증감이 일정하지 않을 때 사용

1. while
while (조건식) {
    // 반복할 코드
}

2. do-while
조건에 상관없이 코드가 한 번은 실행되어야 하는 경우
do {
    // 반복할 코드
} while (조건식);
```

### 8. Algorithm 문제 풀기
<a href="https://github.com/HyeranShin/FastCampus/tree/master/Algorithm/src/com/hyeran/algorithm">Algorithm</a>
- 기본 알고리즘 예제 1 - sum
- 기본 알고리즘 예제 2 - 피보나치

### 9. 객체 지향에서의 클래스
<a href="https://github.com/HyeranShin/FastCampus/tree/master/Class/src/com/hyeran/clazz">Class<a>
- Class_1
- Class_2
- Class_3
- Class_4
```
설계: 객체들의 이름을 나열하고 이들의 관계를 구성하는 것
코딩: 설계에서 만들어진 이름으로 자바 파일을 생성하고 코드를 채워 나가는 것
객체: 앞으로 작성할 코드를 내가 이해할 수 있게 이름을 부여하는 것
클래스: 부여한 이름에 맞춰서 코드를 작성한 것
```
```JAVA
객체(Object)는 속성(Attribute)과 기능(Method)를 가지는 대상
  
예시1. 사람
속성: 나이, 키, 몸무게, 성별, 이름
기능(함수): 걷다, 자다, 먹다

class Person() {
  int age;
  int height;
  int weight;
  String gender;
  String name;
  
  public void walk() {
    System.out.println("걷는 중");
  }
  public void sleep() {
    System.out.println("자는 중");
  }
  public void eat() {
    System.out.println("먹는 중");
  }
}

예시2. 자동차
속성: 모델, 색상, 배기량
기능: 좌회전, 우회전, 기어 변속, 문 열기, 후진, 창문 열기
```
- 클래스와 인스턴스     
```
JVM 메모리

Method Area: 모든 코드와 static 변수, 상수 정보 등이 저장
  * Code Area, Class Area, Static Area로도 불림
Heap: new 연산자로 생성된 모든 Instance가 저장
  * new를 하면 클래스 코드는 heap에 따로 저장되지 않고 Method Area에 있는 것을 가져다 사용
  * heap에는 클래스의 멤버 변수만 저장
Java Stack: 함수 내에서 사용되는 변수 값과 리턴 값들이 저장
  * 함수는 호출 후 종료되면 내부에서 선언되었던 값들이 사라지기 때문에 다른 영역 사용
```
```
Instance: Heap에 로드된 상태

Obejct(객체)가 개념적이라면, Class는 구체적
Instance가 붕어빵이라면, Class는 붕어빵을 만드는 틀

Object   <= 개념(설계)
Class    <= 구현체(코드화)
Instance <= 실행체(new Class)
```

<a href="https://github.com/HyeranShin/FastCampus/tree/master/Function/src/com/hyeran/function">Function</a>
- Function
```
함수에 값 넘길 때 명칭: 입력 시 argument, 정의 시 parameter
```
- overload
```JAVA
함수 오버로드: 동일한 함수 명으로 다른 동작

1. 파라미터의 개수
public void take(String str) {}
public void take(String str, str2) {}

2. 파라미터의 타입(순서 포함)
public void take(int number) {}
public void take(String str, int number) {}
public void take(int number, String str) {}

X. 리턴 타입은 오버로드 대상이 아님
```

<a href="https://github.com/HyeranShin/FastCampus/tree/master/Constructor/src/com/hyeran/constructor">Constructor</a>
- constructor
```
생성자: 클래스 호출 시 자동으로 불리는 함수
  * 클래스의 이름과 함수의 이름이 같음 (대문자로 시작)
  * 리턴 타입이 없는 함수 ex) public One() {}
  * 생성자가 없으면 default 생성자 실행
  * 오버로드 가능
  * 접근 제한자 변경 가능
```

### 10. 클래스와 로딩
<a href="https://github.com/HyeranShin/FastCampus/blob/master/UsingClass/src/com/hyeran/using/UsingMain.java">UsingClass</a>
- new와 static으로 보는 메모리(1)
- new와 static으로 보는 메모리(2)
```
클래스 자원(멤버 함수, 멤버 변수) 사용하는 방법

1. new 연산자
  * new 연산자를 사용했을 때 Heap으로 로드되면서 사용 가능한 상태가 됨
  * 코드 자체는 Code Area에 올라가 있지만 사용 가능한 상태는 아님
  * 장점: 공간 효율 ↑ - 사용할 때만 메모리 생성
  * 단점: 처리 속도 ↓
  
2. static 예약어
  * new 없이 클래스 명에 도트 연산자를 바로 사용
  * code area로 내 코드가 static이니까 써도 된다고 알려주는 것
  * 장점: 처리 속도 ↑
  * 단점: 공간 효율 ↓ - 항상 메모리에 올려 놓고 써야 함
```

### 11. 내장 객체와 라이브러리
<a href="https://github.com/HyeranShin/FastCampus/tree/master/Builtin/src/com/hyeran/builtin/Builtin.java">Builtin</a>
- 내장 객체, 내장 함수, 라이브러리
```
내장 클래스: System, String처럼 Java에 이미 만들어져 있는 클래스로 바로 가져다 사용 가능

내장 함수 
  ex) println(), length(), indexOf(), Math.ceil(), Math.floor(), Math.round()
  
라이브러리
  * Java에 기본적으로 포함되지 않는 클래스
  * 주로 3rd party 개발자들이 만들어서 제공
  * 라이브러리 형태로 파일을 다운받아서 
```
<a href="https://github.com/HyeranShin/FastCampus/tree/master/SystemOut/src/com/hyeran/systemout/OutMain.java">SystemOut</a>
- System.out은 어떻게 만들어져 있을까?
<a href="https://github.com/HyeranShin/FastCampus/tree/master/StringReview/src/com/hyeran/stringreview/StringMain.java">StringMain</a>
- StringBuffer와 StringBuilder
```
문자열 더하기 연산을 할 때
직접 연산 시 메모리 낭비 -> cpu 성능 하락 -> 속도 저하

해결방법: 문자열 연산을 위해 제공되는 클래스 사용

1. StringBuffer
  * 글자 수가 많을 경우 직접 연산보다 최대 3000배 이상도 빨라짐
  
2. StringBuilder
  * StringBuffer보다 빠름
  * 하지만 Multi-Thread인 경우 동기화가 보장되지 않음 
     -> 서버 프로그램 제작이나 채팅 앱의 경우 무조건 StringBuffer를 써야 함
   * Single-Thread에서는 가장 좋은 방법
   
최신 버전의 자바에서는 문자열의 단순 더하기 연산은 StringBuilder로 자동 변환해서 처리
하지만 Builder가 판단하기 어려운 복잡한 연산일 경우 자동 변환되지 않음
그러므로 문자열을 더하는 경우 더하기 연산을 쓰는 것 보다는 StringBuilder를 쓰는 게 바람직
```

### 12. 첫번째 프로젝트
<a href="https://github.com/HyeranShin/FastCampus/tree/master/ProjectLotto">ProjectLotto</a>
- Random 클래스를 이용한 로또 번호 추출기

### 13. 코드 관리
- Git 기본
```
Git: Version Control System, 파일의 버전을 관리해주는 관리 도구
1. 프로그래밍 리소스(소스코드, 이미지 파일 등)의 변화를 시간에 따라 기록
2. 과거 특정 시점의 리소스 복원 가능
3. VCS(Version Control System) 중에 가장 많이 사용

VCS 종류
가. CVCS(Central Version Control System): 중앙 집중식 버전 관리
- 대표적인 CVCS로는 Java 프로젝트에서 가장 많이 사용되는 SVN
- 보안상 이유로 대형 SI 프로젝트의 경우 내부에 SVN 서버를 설치하고 사설망 내에서 서버 관리
나. DVCS(Distributed Version Control System): 분산 버전 관리
- 이 DVCS에 해당되는 대표적인 시스템이 바로 Git
```
- Git 설치 및 Github 업로드(Window)
- Git 설치 및 Github 업로드(mac OS)
```
Git Config
1. git을 설치하고 가장 먼저 해야 하는 작업
2. GUI 툴들은 처음 실행할 때 이 설정을 물음
3. 앞으로 github에 가입할 이메일 주소 등록 권장
> git config --global user.name "이름"
> git config --global user.email "github 이메일 주소"

확인
> git config --list

Git 로컬 저장소 생성
1. 탐색기에서 git에 저장할 디렉토리 열기
2. 프로젝트 우클릭 -> 팝업 메뉴에서 git bash 선택
> git init: 현재 디렉토리의 파일을 관리하는 git 저장소 생성
> git add -A / git add 파일명: git 저장소에 등록할 파일들을 먼저 준비 단계인 stage에 등록
> git commit -m "(commit message)": stage에 등록된 파일을 git 저장소에 등록

로컬 git 저장소를 온라인 사이트와 연결
> git remote add origitn https://github.com/계정이름/저장소이름.git
확인
> git remote -v
로컬 git 저장소를 온라인 사이트에 업로드
> git push -u origin master

변경 사항 반영
> git add -A
> git commit -m "(commit message)"
> git push -u origin master
```


### 14. 상속이란?
<a href="https://github.com/HyeranShin/FastCampus/tree/master/Inheritance/src/com/hyeran/inheritance">Inheritance</a>
- inheritance_상속이란?
- inheritance_다단상속
```
상속
  * 부모 클래스에 정의된 것을 상속받은 자식 클래스가 사용 가능
  * 상속 관계에서의 호출 순서: 부모 클래스가 생성된 후에 자식 클래스가 생성 
     -> 메모리에 적층되는 원리, 최상위 부터 상속 받은 순서대로 실행
  * 상속을 받기 위해서는 extends 예약어 사용
  * 다단 상속 가능, 다중 상속 불가능
```
- override
```
오버라이드
  * 상속 관계에서 자식에 선언된 자원을 사용하기 위해 쓰임
  * 부모 클래스의 함수와 같은 이름의 함수를 자식 클래스에 정의

super 예약어: 부모 클래스에 있는 대상 식별자를 가진 자원 사용

this 예약어: 상속 여부에 상관 없이 내 클래스 블럭 내에 있는 자원 사용
```
- protected_접근제한자
```
디폴트 접근제한자: 동일한 패키지에서만 사용 가능
public: 다른 패키지에서도 사용 가능
protected: 다른 패키지에 있더라도 상속을 통해서 사용 가능
```
- polymorphism_다형성
- polymorphism_다형성 코드
```
다형성
  * 함수의 overload 개념을 클래스로 확장시킨 것
  * 설계에 특화된 객체 지향에서 가장 중요
  * new로 생성되는 클래스와 선언하는 클래스 타입을 바꿀 수 있음
     -> new는 항상 최종적으로 대상이 되는 클래스를 new 해야 함
  * 자식 생성자로 부모 타입에 대입 가능
     -> 자식 타입으로 선언했어도 필요에 따라 부모 타입으로 자동 변환

다형성의 필요성
  * 설계 때문
  * 내 클래스나 인터페이스를 누군가 상속받아서 사용할 때, 
    설계를 할 때는 내가 설계한 부모 클래스를 상속 받은 사람이 자식 클래스의 이름을 뭘로 만들 지 알 수 없음
     -> 이를 대비하여 만든 것
  * 다형성이 지원되면 부모 클래스의 속성과 기능만 알고 있으면 자식 클래스의 코드를 몰라도 사용 가능
```

### 15. 객체지향 설계 도구
<a href="https://github.com/HyeranShin/FastCampus/tree/master/Design%20Tools/src/com/hyeran/tools">Design Tools</a>
- interface
```Java
interface
  * 설계자의 의도대로 기능을 구현하도록 강제하는 것
  * 설계자가 함수의 이름을 미리 정해놓음
  * 다형성 적용 가능(한번에 하나만)
  * 다중 구현 가능

interface 구현
interface IDoor { // 인터페이스 이름은 주로 Interface의 약자인 I를 붙여서 설계
  // 함수 선언만 가능, body가 없음
  public void open();
  public void close();
}

interface 사용 
  * implements 예약어 사용 (상속에서의 extends와 유사하게 사용)
  * interface 내부에 선언한 함수를 모두 구현해야 함
```
- abstract
```Java
abstract (추상 클래스, 추상 함수)
  * 설계자의 의도대로 기능을 구현하도록 강제하는 것
  * 설계자가 미리 정해놓은 함수 이름 + 로직(연산이 일어나는 코드)
  * 초기화 할 수 없음. 상속을 통해서만 사용 가능
  
abstract 구현
abstract class Abstract {
  abstract public void open();  // 상속받은 클래스에서 반드시 구현해야 함
  
  public void close() {  // 일반 함수도 만들 수 있음
    System.out.println("문이 닫혔습니다.");
  }
}

abstract 사용 > 상속과 동일
```
- annotation
```Java
annotation
  * 사전적 의미로 '주석 달기'라는 뜻
  * 주석 앞에 @을 이용하여 주석 작성
  
주석과 annotation의 차이
주석: 오로지 개발자만 보기 위해 작성하는 비고
애너테이션: 개발자, 컴파일러, 런타임(실행환경)
ex) @Override: 컴파일러에 정보 제공(개발자에게도 알려줌)

annotation 용도
가. 컴파일러에 정보 제공
나. 실행 시간에 특수 기능 제공
다. 코드 자동 생성

annotation 설계
1. Target: 적용할 대상(생성자, 변수, 함수, 패키지, 클래스)
2. Retention: 정보의 유지 단계(소스 코드, 컴파일, 실행 시간)
3. Documented: 문서화 되어야 하는 애너테이션일 경우 사용
4. Inheritated: 자동으로 상속받는 애너테이션 타입일 경우

@Target(ElementType.TYPE)  // TYPE=클래스(클래스의 또 다른 이름은 사용자 정의 타입)
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation {
  public String value() default "어떤 값";  // val이라는 함수가 실행되면 defult로 "어떤 값"이 return
  
  public String key();
  
  // public String aaa; (X) 변수 선언만은 불가능. 초기화 하면 가능
}

annotation 사용
@Annotation(key = "추가된 키의 값")
class AnnoClass {
}

annotation 정보 꺼내기
AnnoClass anno = new AnnoClass();

1. String value = anno.getClass().getAnnotation(Annotation.class).value();

2. Class cls = anno.getClass();
// 도트 연산자 썼을 때 나오는 함수들에서 콜론 뒤에 나오는 타입이 해당 함수의 리턴 타입
Annotation ano = (Annotation) cls.getAnnotation(Annotation.class);
String key = ano.key();
```
<a href="https://github.com/HyeranShin/FastCampus/blob/master/InnerClass/src/com/hyeran/innerclass/InnerMain.java">InnerClass</a>
- inner class
```Java
inner class: 클래스 내부에 정의하는 클래스

종류
1. 멤버 클래스
2. static 클래스
3. local 클래스: 함수 안에 정의
4. 익명 클래스: 단독으로 실행되는 클래스. 주로 interface를 구현하는 형태로 정의

1. 이너클래스 
  * 이너클래스에서 static으로 된 멤버 사용 불가. 단, final은 제외
  * 외부 멤버 이름 사용 가능
  * 일반 이너클래스에서는 외부 클래스의 모든 자원을 자기 것처럼 사용 가능
  
이너클래스 사용하기
Outer out = new Outer();
Outer.Inner in = out.new Inner(); // 외부 클래스를 통해서 new 연산자 사용 가능

2. static 이너클래스 
  * 외부 클래스의 static 멤버만 사용 가능

static 이너클래스 사용하기
Common.Inner in2 = new Common.Inner();

3. 지역(Local) 이너클래스
  * 멤버, 자신을 포함하고 있는 함수의 지역 변수 등 모든 영역의 변수에 접근 가능
  
4. 익명 클래스
  * 독립적으로 만들어지는 내부 클래스
  * 주로 인터페이스의 구현체로 코딩
```

### 16. 예외처리
<a href="https://github.com/HyeranShin/FastCampus/tree/master/Exception/src/com/hyeran/exception">Exception</a>
- exception
- finally
```Java
예외 처리의 기본 구조

try {
  // 예외가 발생할 수 있는 코드
} catch(Exception e) {
  e.printStackTrace();
  // printStackTrace는 내부적으로 제 3의 thread에서 동작하기 때문에 로그와 그 다음 코드의 순서는 달라질 수 있음
} finally {
  // 예외가 발생하더라도 무조건 실행
  System.out.println("프로그램 정상 종료.");
  
  // 대표적으로 파일이나 네트워크 처리 시 try문에서 연결한 연결점을 꼭 닫아줘야 함
}

Exception(예외) 종류

1. CheckedException
  * 예외가 발생했을 때 코드 상에서 처리 가능
  * 예외도 하나의 객체로서 발생하는데, CheckedException은 자바에 이미 정의되어 있음
  * 하나의 블럭에서 여러 예외 처리 시 catch문 중복해서 사용 가능
     -> 문제: 앞의 코드에서 예외 발생 시 예외 처리를 하고 나면 뒤의 코드는 실행 되지 않음
  * 다형성을 사용하여 Exception 하나로 처리 가능
  ex) ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException
  
2. UncheckedException - RuntimeException
  * 예외가 발생했을 때 코드 상에서 처리 불가능
  * 복구가 불가능한 상황이기 때문에 예외를 발생시키지 않고 종료 처리하기도 함
```

### 17. 키보드 입력 처리
- Scanner와 System.in -입력 클래스 사용

### 18. 두번째 프로젝트
- 계산기 만들기 -라이브러리 활용

### 19. 컬렉션
- list
- 컬렉션을 위한 Generic
- set (1)
- set (2)
- map

### 20. 파일 읽고 쓰기
- File IO 설명
- File
- FileInputStream
- FileOutputStream
- InputStream 한글 처리
- BufferedInputStream
- BufferedOutputStream
- IO Package
- Reader & Writer
- Path

