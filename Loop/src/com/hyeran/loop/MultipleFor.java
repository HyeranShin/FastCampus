package com.hyeran.loop;
/**
 * 중첩 for
 * @author hyeran
 *
 */
public class MultipleFor {

	public static void main(String[] args) {
		// -------------------
		// 중첩(다중) for문 기본 구조
		// -------------------
		for (int a = 1; a <= 10; a = a+1) {
			
			System.out.println("out : " + a);
			
			for (int b = 1; b <= 10; b = b+1) {
				
				System.out.println("in : " + b);
				
			}
			
			// 실행할 코드 2
	
		}

	}

}
