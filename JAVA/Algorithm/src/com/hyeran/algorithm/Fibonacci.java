package com.hyeran.algorithm;
/**
 * 알고리즘 피보나치
 * @author hyeran
 *
 */
public class Fibonacci {

	public static void main(String[] args) {

		// ----------------------------------------------------------
		// 설명.	피보나치 수열이란, 입력 값으로 첫번째 0과 두번째 1이 주어지고
		//		첫번째 값과 두번째 값을 더해서 세번째 값을 결정합니다.
		//		그리고 마찬가지로 네번째부터는 이전의 두 값을 더해서 만들어지는 수열을 말합니다.
		//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
		//
		// 문제.	1보다 큰 자연수 x가 주어졌을 때 수열의 값이 x보다 작을 때 까지
		//		몇 개가 만들어지는 지 개수를 출력하세요.
		// ----------------------------------------------------------
		
		// 풀이 1
		// 1. 첫번째 두번째 세번째 값을 저장할 변수를 선언한다.
		
		// 2. 수열의 총 개수를 저장하는 결과 변수를 선언한다.
		
		// 3. 앞의 두 수를 더한 값이 입력 값 x보다 작을 때 까지 반복문을 실행한다.
		//	3.1 반복문 안에서 결과 변수의 카운트를 증가시킨다.
		
		// 4. 결과 변수를 출력한다.
		
		int x = 10;
		
		int a = 0;
		int b = 1;
		int c = -1;	// 앞의 변수와 겹치지 않게 초기화
		
		System.out.print("0, 1, ");
		
		int count = 2;
		
		while (a+b < x) {
		// while(true) {
			c = a + b;
			
			// if (c >= x) break;
			
			System.out.print(c + ", ");
			
			a = b;
			b = c;
			count = count + 1;
		}
		
		System.out.println();	// 줄만 바꿈
		
		System.out.println(count);
		
	}

}