package com.hyeran.calc;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 두번째 프로젝트 : 계산기
 * @author hyeran
 *
 */
public class CalcMain {
	
	/*
	 * 계산기 만들기 과제: ScriptEngine을 사용하지 않고 계산기를 만들어보세요!
	 */

	public static void main(String[] args) {

		/* 
		 * 계산기 처리 순서
		 * 1부터 3까지를 문자열 exit가 입력될 때 까지 반복한다.
		 */
		
		// 1. 키보드에서 입력을 받는다 : 35 * 6 - 2
		Scanner scanner = new Scanner(System.in);
		
		boolean runFlag = true;
		
		while(runFlag) {
			// 1.2 입력 대기
			System.out.println("계산식을 입력하세요:");
			String word = scanner.nextLine();
			
			// 2. 분기 처리 exit, 다른 문자
			if(word.equals("exit")) {
				runFlag = false;
			} else {
				// 3. 입력받은 문자열을 계산하고
				// 문자열을 계산해주는(식으로 만들어주는) 라이브러리 사용
				ScriptEngineManager manager = new ScriptEngineManager();
				
				ScriptEngine engine = manager.getEngineByName("javascript");	// javascript.eval() > "문자열을" 코드처럼 처리해준다 
				
				try {
					Object object = engine.eval(word);
					// 4. 결과 값을 출력한다
					System.out.println("result: " + object);
				} catch (ScriptException e) {
					// e.printStackTrace();
					System.out.println("입력한 식이 잘못 되었습니다.");
				}
			}
		} // while
		
		System.out.println("계산기를 종료하였습니다.");

	}

}
