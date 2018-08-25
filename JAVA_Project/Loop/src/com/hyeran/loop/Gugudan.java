package com.hyeran.loop;
/**
 * 구구단 출력하기
 * @author hyeran
 *
 */
public class Gugudan {

	public static void main(String[] args) {
		int begin = 1;	// 시작하는 단
		int end = 9;		// 마지막 단
		
		int offset = 10;	// 한단에 출력하는 개수
		
		for (int a = begin; a <= end; a = a+1) {
			for (int b = 1; b <= offset; b = b+1) {
				int c = a * b;
				
				/*
				 * println: 줄을 바꿔주는 역할
				 * printf: 특수문자와 변수를 치환해주는 역할
				 */
				
				//System.out.println(a + "X" + b + "=" + c);
				System.out.printf("%d X %d = %d \n", a, b, c);
			
			}
			
			System.out.println("");
		}
	}

}
