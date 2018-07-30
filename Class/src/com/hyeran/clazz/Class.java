package com.hyeran.clazz;

public class Class {
	// 속성 - 변수
	int width;
	int height;
	String color = "없음";
	
	// 기능 - 함수
	// 접근제한자 리턴타입 함수명
	public void call() {
		System.out.println("전화를 겁니다.");
	}
	
	public void receive() {
		System.out.println("전화를 받습니다.");
	}
	
	public void printColor() {
		System.out.println("나의 컬러는 " + color + " 입니다.");
	}
}
