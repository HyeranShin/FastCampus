package com.hyeran.function;
/**
 * 함수 오버로드: 동일한 함수 명으로 다른 동작
 * @author hyeran
 *
 */
public class Overload {
	
	public void take(String str) {
		System.out.println("스트링님이 탑승하셨습니다.");
	}

	// 1. 파라미터의 개수
	public void take(String str, String str2) {
		System.out.println("스트링 두 분이 탑승하셨습니다.");
	}
	
	public void take(String str, String str2, String str3) {
	}
	
	// 2. 파라미터의 타임
	public void take(int number) {
		System.out.println("숫자님이 탑승하셨습니다.");
	}
	
	public void take(String str, int number) {
		System.out.println("문자와 숫자님이 탑승하셨습니다.");
	}
	
	// 파라미터의 순서만 달라도 오버로드 가능
	public void take(int number, String str) {
		System.out.println("숫자와 문자님이 탑승하셨습니다.");
	}
	
	// X. 리턴 타입은 오버로드 대상이 아님
//	public int take(String str) {
//		
//	}
}
