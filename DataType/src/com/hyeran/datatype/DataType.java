package com.hyeran.datatype;

public class DataType {

	public static void main(String[] args) {
		// --------------------------
		// 데이터 타입
		// 변수에 담을 값의 크기를 결정하는 표식
		// --------------------------
		
		/* 가. 기본형 - primitive type */
		// 값의 크기가 정해져 있다. 여기서 크기란 값 자체가 아닌 값이 저장될 수 있는 공간의 크기를 말함
		// 1. 논리형
		boolean type_boolean = true;
		boolean type_boolean2 = false;
		
		if(type_boolean == true){
			System.out.println("값이 참입니다.");
		} else {
			System.out.println("값이 거짓입니다.");
		}
		
		// 2. 문자형
		char type_char = '값';
		char type_char2 = 'a';
		
		// 3. 정수형
		byte type_byte = 127;				// 1byte -128 ~ 127
		short type_short = 32767;			// 2byte -32768 ~ 32767
		int type_int = 23132123;				// 4byte ~2147483647
		long type_long = 1312312154654L;	// 8byte ~9223372036854775807
		// 모든 숫자 값을 int로 인식하므로 long 타입이더라도 숫자 값이 int의 범위를 넘어서면 L을 붙여서 long 타입이라는 걸 알려주어야함
		
		System.out.println(type_long*100+20);
		
		// 4. 실수형
		float type_float = 3.141592F;			// 4byte
		double type_double = 3.141592;	// 8byte
		
		System.out.println(type_double);
		
		// 5. String
		String str = "안녕하세요";
		
		/* 나. 참조형 - reference type */
		// 값의 크기가 변할 수 있음
		
		// 1. 클래스
		// 대표적으로 문자열을 저장하는 String 클래스가 있다.
		
	}
}
