package com.hyeran.loop;
/**
 * break와 continue
 * 
 * break -> for문 종료
 * continue -> 해당 조건만 생략	
 * 
 * @author hyeran
 *
 */
public class BreakContinue {

	public static void main(String[] args) {

		int begin = 1;	// 시작하는 단
		int end = 9;		// 마지막 단
		int offset = 10;	// 한단에 출력하는 개수
		
		// 구구단 코드
		
		/* 레이블을 이용해서 내부 for문에서 외부 for문을 제어 할 수 있음
		 *  
		 *  레이블명 : for () {
		 *  	for () {
		 *  		break 레이블명;
		 *  	}
		 *  }
		 */
		
		out : for (int a = begin; a <= end; a = a+1) {
			
			// if (a > 5) break;
			
			for (int b = 1; b <= offset; b = b+1) {
				
				// if (b > 7) break; // 7 이후 출력 X
				// if (b == 7) continue;	// 7만 생략
				
				if (b == 7) break out;	// 외부 for문 종료
				
				int c = a * b;
				System.out.printf("%d X %d = %d \n", a, b, c);
			}
		}

	}

}
