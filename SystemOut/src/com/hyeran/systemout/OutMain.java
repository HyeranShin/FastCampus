package com.hyeran.systemout;

import java.io.PrintStream;

/**
 * System.out.print를 만들어보자
 * @author hyeran
 *
 */
public class OutMain {

	public static void main(String[] args) {

		String str = "Hello System.out.println!!!";
		
		System.out.println(str);
		// 클래스의 도트 연산자 다음 괄호가 없으면 변수, 괄호가 있으면 함수
	}

}

class System {
	public static PrintStream out = new PrintStream(java.lang.System.out);
}