package com.hyeran.loop;
/**
 * 배열에 반복문 사용하기
 * @author hyeran
 *
 */
public class ArrayInLoop {

	public static void main(String[] args) {
		int array[] = new int[31];
		
		// 입력
		for(int index = 0; index < 31; index = index+1) {
			array[index] = index + 1;
		}
		
		// 출력
		// cf) 문자열.length(), 배열.length
//		for (int index = 0; index < array.length; index = index+1) {
//			System.out.println(array[index]);
//		}
		
		/*  향상된 for문
		 * 
		 *  array의 개수만큼 반복하면서 반복할 때 마다 
		 *  증가된 인덱스의 값을 변수에 담는다.
		 */
		for(int item : array) {
			System.out.println(item);
		}
	}

}
