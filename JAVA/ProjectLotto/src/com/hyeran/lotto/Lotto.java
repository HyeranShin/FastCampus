package com.hyeran.lotto;

import java.util.Random;

/**
 * 로또 번호를 생성하는 클래스
 * @author hyeran
 *
 */
public class Lotto {
	
	/*
	 * 반환 값이 있는 함수의 경우 
	 * 
	 * 1.반환 타입으로 result 변수를 먼저 선언하고 
	 * 10.마지막 줄에 return 해놓고 코딩을 시작한다.
	 */
	public int[] generate(int count) {
		int[] result = new int[count];
		
		// 이 사이에 코드를 작성
		// 36개의 숫자 중에 count개를 랜덤으로 출력
		
		Random random = new Random();
		
		for(int i = 0; i < count;) {
			int randomNumber = random.nextInt(35) + 1;
			if(!isExist(randomNumber, result)) {	// 중복 검사
				result[i] = randomNumber;
				i = i+1;
			}
		}
		return result;
	}
	
	private boolean isExist(int randomNumber, int randomArray[]) {
		boolean result = false;
		
		for(int num : randomArray) {
			if (num == randomNumber)
				return true;
		}
		
		return result;
	}
	
	// default 숫자는 6
	
	final int DEFAULT_COUNT = 6;
	
	public int[] generate() {
		return generate(DEFAULT_COUNT);
	}
}
