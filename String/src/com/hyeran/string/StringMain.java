package com.hyeran.string;
/**
 * 문자열 String
 * @author hyeran
 *
 */
public class StringMain {

	public static void main(String[] args) {

		// 문자열 비교
		// equals
		String eq1 = "Aaa";
		String eq2 = "AAa";
		
		System.out.println(eq1.equals(eq2));	// 대소문자 구분
	
		// 대소문자를 구분하지 않고 비교하는 함수 - equalsignoreCase
		System.out.println(eq1.equalsIgnoreCase(eq2));
		
		// 2. 문자열 합치기 - concat
		String addString = "안녕" + "하세요";
		
		String addString2 = addString.concat(" 반갑습니다");
		
		System.out.println(addString2);
		
		// 3. 문자열 길이 - length

	}

}
