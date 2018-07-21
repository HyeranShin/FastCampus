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
		System.out.println(addString2.length());	// 공백 포함
		
		// 4. 시작 또는 끝나는 문자
		// startsWith, endsWith
		String fullName1 = "김동성";
		
		System.out.println("성이 김씨인가요? " + fullName1.startsWith("김"));
		
		// 5. 특정 위치의 문자 반환 - charAt
		char one = fullName1.charAt(1);
		System.out.println("김동성의 두번째 문자는 " + one + " 입니다.");
		
		// 6. 문자열 교체 - replace, replaceAll
		String replaced = addString2.replace(" ", "!");
		System.out.println(replaced);

		// 7. 구분자로 문자열 분리 - split
		String original = "김동성:37:남";
		String orgArray[] = original.split(":");
		
		System.out.println(orgArray[1]);
		
		// 8. 특정 위치의 문자열 추출 - substring
		System.out.println(original.substring(3, 5));
		//   A   B   C   D E F G
		// 0   1   2    3 
		
		// 9. 문자열 검색
		// indexOf - 문자열이 없으면 -1을 리턴
		int position = original.indexOf("37");
		System.out.println("문자열 37은 " + position + "번째에 있습니다.");
		// contains - 리턴타입이 boolean (true or false)
		boolean contain = original.contains("37");
		System.out.println("문자열 original에 \"37\"이 포함되어 있나요? " + contain);
		
		// 10. 공백제거 - trim
		// 처음이나 마지막 위치의 공백만 제거
		// 중간의 공백을 제거 하고 싶으면 replaceAll(" ", "") 사용
		String trimStr = " 안 녕 하 세 요 ! ".trim();
		System.out.println(trimStr);
		
		String trimStr2 = " 안 녕 하 세 요 ! ".replaceAll(" ", "");
		System.out.println(trimStr2);
		
		// 11. 대소문자 변환 - toLowerCase, toUpperCase (영문에만 해당)
		String uppeEq2 = eq2.toUpperCase();
		System.out.println(uppeEq2);
	}

}
