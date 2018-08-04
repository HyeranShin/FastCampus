package com.hyeran.stringreview;

public class StringMain {

	public static void main(String[] args) {

		String word = "안" + "녕" + "하" + "세" + "요";		// String 직접 연산 시 메모리 낭비 -> cpu 성능 하락 -> 속도 저하
		
		// 1. StringBuffer: 문자열 연산을 위해 제공되는 클래스
		StringBuffer buffer = new StringBuffer();		// 글자 수가 많을 경우 최대 3000배 이상도 빨라짐 
		buffer.append("안");
		buffer.append("녕");
		buffer.append("하");
		buffer.append("세");
		buffer.append("요");
		
		System.out.println(buffer.toString());
	
		// 2. StringBuilder: 문자열 연산을 위해 제공되는 클래스
		StringBuilder builder = new StringBuilder();	// StringBuffer보다 더 빠르지만 Multi-Thread인 경우 동기화 보장 X
		builder.append("안");							// 서버 프로그램 제작이나 채팅 앱의 경우 무조건 StringBuffer를 써야 함
		builder.append("녕");							// Single-Thread에서는 가장 좋은 방법
		builder.append("하");
		builder.append("세");
		builder.append("요");
		
		System.out.println(builder.toString());
		
		// 최신 버전의 자바에서는 문자열의 단순 + 더하기 연산은 StringBuilder로 변환해서 처리
		
		String result = "";
		for(int i=0; i < 1000000; i++) {
			if(i%10 == 0) {
				result = result + ":";
			}
			result = result + i;
			if(i%3 == 0) {
				result = result + i + "3";
			}
		}
		// ...
		System.out.println(result);
	}

}
