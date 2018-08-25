package com.hyeran.condition;
/**
 * 조건문 switch
 * @author hyeran
 *
 */
public class Switch {

	public static void main(String[] args) {
		// ---------------
		// switch의 기본 구조
		// ---------------
		/*
		switch(변수) {
		case 1:
			// 실행 코드
		case 2:
			// 실행 코드
		case 3:
			// 실행코드
		...
			
		default:
			// 실행코드 - 위의 모든 case와 매치되지 않으면 default의 코드 실행
		 }
		 */
		
		int A = 30;
		
		// 특정 값을 충족하면 이후에 나오는 모든 case문을 실행
		// => break를 붙이는 이유
		switch(A) {
		case 29:
			System.out.println("A의 값은 29입니다.");
			break;
		case 30:
			System.out.println("A의 값은 30입니다.");
			break;
		case 31:
			System.out.println("A의 값은 31입니다.");
			break;
		}
	}

}
