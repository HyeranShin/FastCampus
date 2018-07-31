package com.hyeran.function;
/**
 * 함수 만들고 사용하기
 * @author hyeran
 *
 */
public class FunctionMain {

	public static void main(String[] args) {

		One one = new One();
		
		// 1. 반환 값이 없는 함수 사용
		one.call();
		
		// 2. 반환 값이 있는 함수 사용 - 반환 값을 받아주는 변수 필요
		String value = one.getValue();
		System.out.println(value);
		
		// 3. 파라미터가 있는 함수에 값 넘기기
		// 입력할땐 argument, 정의할땐 parameter
		Two two = new Two();
		two.print("안녕");	// argument
		
		String str = "Hello";
		two.print(str);
		
		two.printMulti("오랜만에", 100, "good to see you");
	}

}
