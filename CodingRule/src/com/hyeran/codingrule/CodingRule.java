// 1. 패키지 이름: 모두 소문자
package com.hyeran.codingrule;

// 2. 클래스 이름: 낙타표기법
//					   영어단어 - 첫번째 글자는 대문자로, 두번째 글자부터는 소문자로
//					   복합단어 - 두번째 혹은 세번째 명사의 첫번째 글자를 대문자로 작성

// 7.3 Java 문서를 만들 때 사용하는 주석
/**
 * 코딩 규칙을 설명하는 클래스
 * @author hyeran
 *
 */
public class CodingRule {

	int 변수명b;
	
	// 3. 함수 이름: 낙타표기법 - 첫번째 글자를 소문자로
	public static void main(String[] args) {	// 여기는 세미콜론을 붙이지 않는다.
		int 변수명a;
		// 4. 세미콜론: 문장의 끝, 줄의 끝에는 세미콜론을 입력
		System.out.println("글자");

	}
	// 5. 블럭(scope): 하나의 영역으로 내부에 선언된 변수나 함수들은 동일한 영역에서 실행되는 것으로 간주한다.
	public void sub2() {
		int 변수명c;
	}
	
	// 6. 칸 띄우기: 연속된 칸 띄우기(space)는 하나의 공간으로 인식한다.
	public                   void              sub3() {
		
	}
	
	// 7. 주석: 개발자가 알아보기 위해서 부가적인 정보를 적어 넣는 것
	// 7.1 한줄 주석 처리
	// 7.2 여러 줄 주석 처리
	/* 안
	 * 녕
	 * 하
	 * 세
	 * 요
	 */
	
	// 8. 식별자
	// 8.1 첫번째 글자로는 영문, 한글, 밑줄(_), 달러($)만 사용가능
	//							 영문만 사용하는 것을 권장
	int firstName;
	// 8.2 키워드는 식별자로 사용할 수 없음
	// ex) int public;
	// 8.3 식별자는 되도록 모두 낙타표기법을 사용 - 꼭!
}
