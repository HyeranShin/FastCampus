package com.hyeran.algorithm;
/**
 * Sum 알고리즘
 * @author hyeran
 *
 */
public class Sum {

	public static void main(String[] args) {
		
		// ------------------------------------------------
		// 문제.	1부터 x까지의 모든 값을 더한 후에 출력하는 코드를 작성하세요
		//	      	x의 값은 100,000,000,000 입니다
		// ------------------------------------------------

		// 풀이 1
		
		// 1. 더한 결과 값을 저장하는 결과 변수를 하나 선언한다.
		
		// 2. 1부터 x까지 반복하면서 모든 값을 결과 변수에 더한다.
		
		// 3. 반복문이 끝난 후에 결과 변수를 출력한다.
		
		float result = 0;
		for (float i = 1; i <= 100000000000f; i = i+1) {
			result = result + i;
		}
		
		System.out.println(result);
	}

}