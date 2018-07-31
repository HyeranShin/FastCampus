package com.hyeran.function;

public class Two {
	
	String member;
	
	// 1. 파라미터가 있는 함수
	public void print(String parameter) {
		System.out.println(parameter);
	}
	
	// 2. 파라미터가 여러개 있는 함수
	public void printMulti(String param1, int param2, String param3) {
		System.out.println(param1);
		System.out.println(param2);
		System.out.println(param3);
	}
}
