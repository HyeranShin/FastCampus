package com.hyeran.constructor;
/**
 * 생성자 이해하기
 * @author hyeran
 *
 */
public class One {

	/* 기본 구조
	 *  - 생성자는 리턴 타입이 없는 함수
	 *  - 클래스의 이름과 함수의 이름 같음(대문자로 시작)
	 * 
	 * 생성자가 없으면 default 생성자 실행
	 */

	public One() {
		System.out.println("생성자가 호출됨");
	}
	
	// 생성자 오버로드
	public One(String str) {
		System.out.println(str+"로 생성자가 호출됨");
	}
	
	public One(int number) {
		System.out.println(number+100);
	}
}
