package com.hyeran.using;
/**
 * 클래스 자원 사용하기
 * @author hyeran
 *
 */
public class UsingMain {

	public static void main(String[] args) {
		// 1. 클래스 자원(멤버 함수, 멤버 변수) 사용하기
//		One one = new One();
//		one.memFunction();
		
		// 2. static 예약어 - new 없이 클래스명에 도트연산자를 바로 사용
		One.staticFunction();
		
		System.out.println(One.member);
	}

}

// 접근 제한자 X
class One {
	static String member;
	
	public void memFunction() {
		
	}
	
	public static void staticFunction() {
		
	}
}