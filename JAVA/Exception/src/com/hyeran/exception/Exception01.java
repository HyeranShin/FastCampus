package com.hyeran.exception;
/**
 * 예외 처리 예제
 * @author hyeran
 *
 */
public class Exception01 {

	public static void main(String[] args) {
		
		try {
			// 다. NullPointerException
			String aaa = "aaa";
			
			aaa.length();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {	// 예외가 발생하더라도 무조건 실행
			/* 파일이나 네트워크 처리를 할 때 try문에서 연결한 연결점을 꼭 닫아줘야함 */
			System.out.println("프로그램이 정상적으로 종료되었습니다.");
		}
	}

}
