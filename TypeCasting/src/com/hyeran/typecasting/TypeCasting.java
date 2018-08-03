package com.hyeran.typecasting;
/**
 * 자료형 변환 Type Casting
 * @author hyeran
 *
 */
public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * 자료형 변환이 필요한 이유
		 * 1. 큰 자료형을 작은 자료형에 넣을 수 없다.
		 * 2. 정수형 연산은 결과값이 int 이다.
		 * 3. 문자 10과 숫자 10은 다르다.
		 */
		
		// 1. 기본형 변환
		long a = 35;
//		int b = a; 오류
		int b = (int)a;
		
		byte b1 = 15;
		byte b2 = 27;
		
//		byte b3 = b1 + b2; 오류
		byte b3 = (byte)(b1 + b2);
		
		// 2. 숫자 -> 문자변환
		int num = 57;
		// 2.1
		String numStr1 = String.valueOf(num);
		// 2.2
		String numStr2 = num + "";
		
		int num2 = 971;
		// num2의 자릿수 알아내기
		String num2Str = num2 + "";
		
		int countOfNum = num2Str.length();
		
		System.out.println(countOfNum);
		
		// 3. 문자 -> 숫자변환
		String str3 = "153";
		
		long result1 = Long.parseLong(str3);	// Long은 클래스
		double result2 = Double.parseDouble(str3);
		int result3 = Integer.parseInt(str3);
		
		String str4 = "10";
		int num4 = 10;
		
		String result4 = str4 + num4;
		// int로 하면 아예 연산 오류
		System.out.println(result4);
		
		int result5 = Integer.parseInt(str4) + num4;
		System.out.println(result5);
	}

}
