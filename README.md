# FastCampus
안드로이드 앱 개발 시작하기 CAMP 수강 (18.07.15-)

### 1. 프로그램 다운로드 및 설치 & 2. 이클립스 프로젝트 구조
<a href="https://github.com/HyeranShin/FastCampus/tree/master/TestProject/src/com/hyeran/testproject">TestProject</a>
- 새 프로젝트 생성 및 테스트
- 이클립스 한글처리
- 프로젝트 구조
- 패키지
- 클래스
- 함수 및 프로그램 시작점 entry point

### 3. 코딩 규칙 및 변수 다루기
<a href="https://github.com/HyeranShin/FastCampus/tree/master/CodingRule/src/com/hyeran/codingrule">CodingRule</a>
- 코드 작성 규칙
- 들여쓰기

<a href="https://github.com/HyeranShin/FastCampus/tree/master/VariableConstant/src/com/hyeran/variableconstant">VariableConstant</a>
- 변수와 상수

<a href="https://github.com/HyeranShin/FastCampus/tree/master/DataType/src/com/hyeran/datatype">DataType</a>
- 자료형

<a href="https://github.com/HyeranShin/FastCampus/tree/master/ArrayType/src/com/hyeran/arraytype">ArrayType</a>
- 배열

<a href="https://github.com/HyeranShin/FastCampus/tree/master/TypeCasting/src/com/hyeran/typecasting">TypeCasting</a>
- 타입캐스팅

<a href="https://github.com/HyeranShin/FastCampus/tree/master/Operator/src/com/hyeran/operator">Operator</a>
- 연산자

### 4. Eclipse Run
- run 버튼
- JDK와 JRE로 보는 코드처리 과정
![image](https://user-images.githubusercontent.com/38368820/42943691-710977a4-8b9e-11e8-821c-e15679b181b0.png)

### 5. 문자열 String 다루기
<a href="https://github.com/HyeranShin/FastCampus/tree/master/String/src/com/hyeran/string">String</a>
- 자주 사용되는 String 함수 (1)
- 자주 사용되는 String 함수 (2)
- 문자열 함수 사용 예 (로그인 처리)

### 6. 조건문 (<a href="https://github.com/HyeranShin/FastCampus/blob/master/Condition/java%20%EC%A0%9C%EC%96%B4%EB%AC%B8.pdf">pdf</a>)
<a href="https://github.com/HyeranShin/FastCampus/tree/master/Condition/src/com/hyeran/condition">Condition</a>
- if
- switch
- switch문에서 break 없애기
- if와 switch, 어떤게 좋을까?

### 7. 반복문 
<a href="https://github.com/HyeranShin/FastCampus/tree/master/Loop/src/com/hyeran/loop">Loop</a>
- for
- 중첩 for
- 구구단 출력하기
- break_continue
- while_dowhile
- 배열에서 반복문 사용하기

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
```Java
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
Method Area: 모든 코드와 static 변수, 상수 정보 등이 저장
Heap: new 연산자로 생성된 모든 instance가 저장
  * new를 하면 클래스 코드는 heap에 따로 저장되지 않고 Method Area에 있는 것을 가져다 사용
  * heap에는 class의 멤버 변수만 저장
Java Stack: 함수 내에서 사용되는 변수 값과 리턴 값들이 저장
  * 함수는 호출 후 종료되면 내부에서 선언되었던 값들이 사라지기 때문에 다른 영역 사용
```

<a href="https://github.com/HyeranShin/FastCampus/tree/master/Function/src/com/hyeran/function">Function</a>
- Function
- overload
```JAVA
함수에 값 넘길 때 명칭: 입력 시 argument, 정의 시 parameter

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
  * 리턴 타입이 없는 함수 ex) public One() {}
  * 클래스의 이름과 함수의 이름이 같음 (대문자로 시작)
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
  * new 연산자를 사용했을 때 heap으로 로드되면서 사용 가능한 상태가 됨
  * 코드 자체는 code area에 올라가 있지만 사용 가능한 상태는 아님
  * 장점: 공간 효율 ↑ - 사용할 때만 메모리 생성
  * 단점: 처리 속도 ↓
  
2. static 예약어
  * new 없이 클래스 명에 도트 연산자를 바로 사용
  * code area로 내 코드가 static이니까 써도 된다고 알려주는 것
  * 장점: 처리 속도 ↑
  * 단점: 공간 효율 ↓ - 항상 메모리에 올려 놓고 써야 함
```

### 11. 내장 객체와 라이브러리
- 내장 객체, 내장 함수, 라이브러리
- System.out은 어떻게 만들어져 있을까?
- StringBuffer와 StringBuilder
