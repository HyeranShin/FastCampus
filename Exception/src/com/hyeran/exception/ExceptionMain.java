package com.hyeran.exception;
/**
 * 예외 처리 하기
 * @author hyeran
 *
 */
public class ExceptionMain {

	public static void main(String[] args) {
		
		// Exception(예외)의 종류
		
		// 0. 예외 처리의 기본 구조
		try {
			// 예외가 발생할 수 있는 코드
		} catch(Exception e) {
			
		}
		
		// 1. CheckedException
		// 예외가 발생했을 때 코드 상에서 처리를 할 수 있는 경우
		// 예외도 하나의 객체로서 발생하는데, CheckedException은 자바에 이미 정의 되어있음
		
		System.out.println("예외 발생 전");
		
		// 가. 정수를 0으로 나눌 때
		try {
			int a = 35/0;
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		// 나. 배열의 index 범위를 벗어날 때
		try {
			int nums[] = new int[5];
			nums[5] = 56;
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		// 하나의 블럭에서 여러 예외 처리 시 catch문 중복해서 사용 가능
		// 문제: 앞에서 예외가 발생하여 예외 처리를 하고 나면 뒤에는 실행되지 않음
		try {
			// 가. 정수를 0으로 나눌 때
			int a = 35/0;
			
			// 나. 배열의 index 범위를 벗어날 때
			int nums[] = new int[5];
			nums[5] = 56;
//		} catch(ArithmeticException e) {
//			e.printStackTrace();
//		} catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
		} catch(Exception e) {	// 다형성을 사용하여 하나로 처리 가능
			// printStackTrace는 내부적으로 제 3의 thread에서 동작하기 때문에 로그와 그 다음 코드의 순서는 달라질 수 있음
			e.printStackTrace();
		}
		
		System.out.println("예외 발생 후");
		
		// 2. UncheckedException - RuntimeException
		// 예외가 발생했을 때 코드 상에서 처리가 불가능한 경우
		// 복구가 불가능한 상황이기 때문에 예외를 발생시키지 않고 종료 처리하기도 함
		try {
			// RuntimeException 발생 시 try catch로 처리할 수 있음
		} catch(Exception e) {
			
		}
	}
}
