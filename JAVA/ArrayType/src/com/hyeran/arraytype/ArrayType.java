package com.hyeran.arraytype;

public class ArrayType {

	public static void main(String[] args) {

		// ----------------
		// 1. 변수의 선언과 초기화
		// ----------------
		int var;		// 선언
		var = 37;		// 초기화
		
		int var2 = 37;
		// ----------------
		// 2. 배열
		// ----------------
		// int[] var; 혹은 int var[];
		// 가. 선언과 동시에 초기화
		int array[] = new int[5];
		
		array[0] = 35;
		array[2] = 190;
		
		System.out.println(array[2]);
		
		// 나. 선언한 후에 초기화
		int array2[];
		array2 = new int[7];
		
		// 다. 값으로 초기화
		String array3[] = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		System.out.println(array3[3]);
		
		array3[2] = "수정";
		
		System.out.println(array3[2]);
		
	}

}
