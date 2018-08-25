package com.hyeran.loop;
/**
 * while
 * 
 * for문과 달리
 * 시작 값과 종료 값이 명확하지 않거나
 * 증감이 일정하지 않을 때 사용
 * 
 * @author hyeran
 *
 */
public class While {

	public static void main(String[] args) {
		/*
		 * 
		 * 1. while
		 * 
		 * while( 조건식 ) {
		 * 		// 반복할 코드
		 * }
		 * 
		 * 2. do-while
		 * 조건에 상관없이 코드가 한번 실행되야 하는 경우
		 * 
		 * do {
		 * 		// 반복할 코드
		 * } while( 조건식 );
		 * 
		 */

		int a = 11;
		
		while(a <= 10) {
			System.out.println(a);
			a = a + 1;
		}
		
		do {
			System.out.println(a);
			a = a + 1;
		} while(a <= 10);
		
	}

}
