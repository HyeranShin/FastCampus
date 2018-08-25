package com.hyeran.string;
/**
 * 문자열 함수 사용 예
 * @author hyeran
 *
 */
public class StringExample {

	public static void main(String[] args) {

		// -----------------------
		// 일반적인 로그인 처리 순서
		// -----------------------
		
		boolean validation = true;
		
		String id = "scotty@";
		String password = "asdf1234";
		
		// 1. 입력된 아이디가 존재하는지 검사
		validation = validation && !id.equals(" ");
		// && 쓰는 이유: 둘 중 하나라도 false면 false가 되게 하기 위해
		
		System.out.println("로그인 처리 결과 1: " + validation);
		
		// 2. 입력된 아이디의 길이가 6자 이상인지 검사
		validation = validation && id.length() >= 6;
		
		System.out.println("로그인 처리 결과 2: " + validation);
		
		// 3. 입력된 아이디가 이메일이라면 형식에 맞는지도 검사 (여기서 @이 있는지만 검사)
		validation = validation && id.contains("@");
		
		System.out.println("로그인 처리 결과 3: " + validation);
		
		// 4. 입력된 비밀번호가 존재하는 지 검사
		validation = validation && !password.equals(" ");

		System.out.println("로그인 처리 결과 4: " + validation);
		
		// 5. 입력된 비밀번호의 길이가 8자 이상이고 16자 이하인지 검사
		validation = validation && password.length() >= 8 && password.length() <= 16;

		System.out.println("로그인 처리 결과 5: " + validation);
	}

}
