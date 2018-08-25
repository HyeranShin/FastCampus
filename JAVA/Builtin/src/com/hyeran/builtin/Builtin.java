package com.hyeran.builtin;

import java.util.Random;

/**
 * 내장 클래스, 내장 함수, 라이브러리?
 * @author hyeran
 *
 */
public class Builtin {

	public static void main(String[] args) {
		
		// 1. 내장 클래스
		// System, String처럼 Java에 이미 만들어져 있는 클래스로 바로 가져다 사용 가능
		
		System.out.println();
		
		// 2. 내장 함수
		// println(), length(), indexOf()
		
		double pi = 3.141592;
		
		System.out.println(pi);
		
		System.out.println(Math.ceil(pi));	// ceil: 올림 함수
		System.out.println(Math.floor(pi));	// floor: 내림 함수
		System.out.println(Math.round(pi));	// round: 반올림 함수
		
		System.out.println(Math.random()*100);	// 0-99 사이의 값 리턴
		
		Random random = new Random();	// import 필요
		System.out.println(random.nextInt(10) + 1);	// 1-10 사이의 값 리턴
		
		// 3. 라이브러리
		/*
		 * Java에 기본적으로 포함되지 않는 클래스
		 * 주로 3rd party 개발자들이 만들어서 제공
		 * 라이브러리 형태로 파일을 다운받아서 사용
		 */
	}

}
