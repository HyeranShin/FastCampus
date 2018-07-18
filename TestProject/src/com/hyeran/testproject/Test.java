package com.hyeran.testproject;

public class Test {
	
	// 여기는 변수명, 함수명
	// 실제 로직은 함수 안에 작성

	public static void main(String[] args) {	// 시작점
		// 1. 깨지는 것 대비 > 텍스트엔코딩 설정 > utf-8
		// Window > Preferences > General > Workspace
		// 2. 글자폰트 변경
		// Window > Preferences > General > Colors and Fonts > Basic > Text Font
		System.out.println("안녕 안드로이드!");
	}

	// 함수 작성규칙
	// 접근제한자 리턴타입 함수명() {}
	public void test() {
		// 여기에 코드
		System.out.println("함수가 호출되었습니다.");
	}
}