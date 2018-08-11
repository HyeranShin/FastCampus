package com.hyeran.innerclass;
/**
 * inner 클래스
 * @author hyeran
 * 	// 종류
	// 1. 멤버 클래스
	// 2. static 클래스
	// 3. local 클래스 - 함수 안에 정의
	// 4. 익명 클래스 - 단독으로 실행되는 클래스 - 주로 interface를 구현하는 형태로 정의
 *
 */
public class InnerMain {

	public static void main(String[] args) {

		// 객체 지향 설계 마무리 - 이너 클래스로 정리
		
		// inner class란?
		// 클래스 내부에 정의하는 클래스
		
		// 1. 이너클래스 사용하기
		Outer out = new Outer();

		Outer.Inner in = out.new Inner();	// 외부 클래스를 통해서 new 연산자 사용 가능
	}

}

// 1. 일반적인 이너클래스의 형태
class Outer {
	
	
	class Inner {
		
	}
}
