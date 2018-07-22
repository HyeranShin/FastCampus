package com.hyeran.condition;
/**
 * 조건문 If
 * @author hyeran
 *
 */
public class If {

	public static void main(String[] args) {
		// if문의 기본 구조
		String id = "scotty@naver.com";
		String password = "asdf12345";
		
		// 1. 아이디의 존재 여부 검사
		if(id.equals(" ")) {
			System.out.println("아이디가 없습니다.");
		// 2. 아이디의 길이 6자 이상
		} else if(id.length() < 6) {
			System.out.println("아이디의 길이가 6보다 작습니다.");
		// 3. @이 있는지 이메일 형식 검사
		} else if(!id.contains("@")) {
			System.out.println("아이디가 이메일 형식에 맞지 않습니다.");
		// 4. 패스워드의 존재 여부 검사
		} else if(password.equals(" ")) {
			System.out.println("패스워드가 입력되지 않았습니다.");
		// 5. 패스워드 길이 8자보다 길고 16자보다 짧은 지
		} else if(password.length() < 8 || password.length() > 16) {
			System.out.println("패스워드의 길이가 8보다 크고 16보다 작아야 합니다.");
		} else {
			System.out.println("로그인 되었습니다.");
		}

	}

}
