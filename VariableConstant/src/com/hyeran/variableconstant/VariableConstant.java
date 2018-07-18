package com.hyeran.variableconstant;

public class VariableConstant {

	// 모든 코드는 main 함수 안에 작성
	public static void main(String[] args) {
		// 1. 변수
		// 타입	변수이름;
		int number;
		number = 157;
		
		System.out.println(number);
		
		int number2 = 327;
		
		number = 3;
		
		System.out.println(number);
		
		// 변수를 사용하는 이유
		int result = number * 5;
		result = 3 * 5;
		
		//result = 15 -5;
		result = result - 5;
		
		// 2. 상수: 변수와 비슷한데, 값을 변경할 수 없음
		final int CONSTANT = 3;
		// constant = 157;
		// 언제 사용?
		// final int PI = 3.141592;
		// 상수는 모두 대문자로 작성
		
		// 모든 언어에서 상수를 대문자로 쓰는 것은 아님
		// 최신 java 프로젝트에서 상수를 소문자로 사용하는 표준도 있었음
	}

}
