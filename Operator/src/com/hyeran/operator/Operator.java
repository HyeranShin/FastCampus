package com.hyeran.operator;
/**
 * 연산자
 * @author hyeran
 *
 */
public class Operator {

	public static void main(String[] args) {
		/*
		 * 아래의 연산자 외에도 비트를 다루는 연산자도 있지만 게임과 같이 조금 특정한 분야에서 사용하기 때문에 이 과정에서는 다루지 않음
		 */
		
		// 1. 대입 연산자 = 
		int a = 37 + 37;
		
		// 2. 산술 연산자 * / + -
		int b = 5 % 3;	// 나머지 연산자(모드)
		System.out.println("b의 결과값은 " + b);
		
		// 3. not 연산자 !
		boolean b1 = !true;	// false
		boolean b2 = !false;	// true
		
		System.out.println("not연산의 결과는 " + !!!!b2);	// 연속해서도 사용 가능
		
		// 4. 관계 연산자 == > < != !!!
		int aa = 1;
		int bb = 2;
		
		System.out.println("a와 b의 비교 결과는 " + (aa==bb));	// 연산자 우선순위 때문에 괄호 필요
		System.out.println(aa < bb);
		System.out.println(aa >= bb);
		
		// * 비교연산자와 대입연산자
		// 왼쪽 == 오른쪽
		// =
		
		// 5. 논리 연산자
		// AND: && - 두 항이 모두 참이면 참을 리턴
		// OR: || - 두항 중에 하나만 참이면 참을 리턴
		System.out.println("b1과 b2의 논리연산 AND의 결과는 " + (b1 && b2));
		System.out.println("b1과 b2의 논리연산 OR의 결과는 " + (b1 || b2));
		// * short-circuit
		// 가. A && B - A가 false이면 B의 값을 확인하지 않음
		//		a > b && c == d
		// 나. A || B - A가 true이면 B의 값을 확인하지 않음
		//		a > b || c == d
		
		// 6. 3항 연산자
		// 조건식? 값1(true) : 값2(false);
		boolean pass;
		int cut_line = 80;
		int english_score = 85;
		
		pass = (english_score>cut_line)? true: false;
		System.out.println("영어 점수가 커트라인을 통과하였나요? " + pass);
		
		// 7. 연산자 우선순위
		

	}

}
