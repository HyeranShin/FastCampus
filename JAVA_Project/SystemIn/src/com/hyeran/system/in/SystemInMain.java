package com.hyeran.system.in;

import java.util.Scanner;

/**
 * 키보드 입력 처리
 * @author hyeran
 *
 */
public class SystemInMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		boolean runFlag = true;
		
		while(runFlag) {
			String word = scanner.nextLine();	// 프로그램이 실행된 후 이 코드에서 대기
			
			switch(word) {
			case "1":
				System.out.println("1. 안녕하세요");	break;
			case "2":
				System.out.println("2. 요즘 어때요?");	break;
			case "3":
				System.out.println("3. 날씨가 좋군요");	break;
			case "4":
				System.out.println("4. 오랜만이에요");	break;
			case "5":	
				System.out.println("5. 또 봐요");	break;
			// 0이 입력되면 프로그램 종료
			case "0":
				runFlag = false;	break;
			// 1~5, 0 이외의 글자가 입력되면 명령어가 잘못 입력되었습니다.
			default:
				System.out.println("명령어가 잘못 입력되었습니다.");
			}
		}
	}
}
