package com.hyeran.clazz;

public class ClassMain {

	public static void main(String[] args) {
		
		// 클래스 사용하기
		// 1. 변수를 클래스의 이름을 타입으로 해서 선언
		Class name;
		
		// 2. new 연산자로 초기화
		name = new Class();
		
		// Class name2 = new Class();
		
		// cf) 기본형 변수 선언 - 초기화
		int varName;
		varName = 35;
		
		// 3.1 변수 사용하기 - 도트 연산자로 멤버에 접근
		name.color = "black";
		
		name.printColor();
		
		// 3.2 함수 사용하기 - 도트 연산자로 멤버에 접근
		name.call();
		
		// 4. 기본형과 동일하게 배열 표현식을 사용할 수 있음
		// Class classes[] = new Class[5];
		// int ints[] = new int[5];
		
		name.color = "red";
		name.printColor();
		
		name.color = "orange";
		
		System.out.println(name.color);
		
		// 5. 위에 선언한 classes 변수는 다섯개의 Class를 갖는 배열 변수
		
		// 5.1 기본형 변수 사용하기
		String colors[] = {"red", "orange", "yellow", "green", "blue"};
		
		for(String item : colors) {	// 하나씩 담음
			System.out.println(item);
		}
		
		/*
		 * 기본형 배열은 new로 공간만 할당해도 기본 값으로 0이 입력됨
		 */
		int ints[] = new int[5];
		
		for(int item : ints) {
			System.out.println(item);
		}
		
		/*
		 * 클래스 배열
		 */
		// 1. 배열의 경우는 공간만 먼저 할당
		Class classes[] = new Class[5];
		
		// 2. 각 공간에 클래스를 new 연산자로 초기화 해줘야 함
		classes[0] = new Class();
		classes[1] = new Class();
		classes[2] = new Class();
		classes[3] = new Class();
		classes[4] = new Class();
		
		classes[1].color = "blue";
		
		for(Class item : classes) {
			System.out.println(item.color); // -> NullPointerException 발생
		}
		
//		Class item1 = new Class();
//		System.out.println(item1.color);
	}

}
