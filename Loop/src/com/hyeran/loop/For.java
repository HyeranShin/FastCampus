package com.hyeran.loop;
/**
 * 반복문 for
 * @author hyeran
 *
 */
public class For {

	public static void main(String[] args) {
		// -------------
		// for문의 기본 구조
		// -------------
		for (int a = 1; a <= 10; a = a+1) {
			System.out.println(a);
		}
		// 동일한 결과
		for (int a = 1; a <= 10; ) {
			System.out.println(a);
			a = a + 1;
			// a++; 가독성 문제로 위의 코드 권장
		}
		
		// 무한 루프
		for ( ; ; ) {
			System.out.println("출력");
		}
	}

}
