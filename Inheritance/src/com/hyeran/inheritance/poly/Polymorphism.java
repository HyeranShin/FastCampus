package com.hyeran.inheritance.poly;
/**
 ***** 상속에서 가장 중요한 다형성 *****
 * @author hyeran
 *
 */
public class Polymorphism {

	public static void main(String[] args) {
		/*
		 * 다형성 - 설계에 특화된 객체 지향에서 가장 중요
		 * 
		 * 다형성이란? 함수의 overload 개념을 클래스로 확장시킨 것
		 * new로 생성하는 클래스와 선언하는 클래스 타입을 바꿀 수 있음
		 * new는 항상 최종적으로 대상이 되는 클래스를 new 해야 함
		 */
		
		// 코드로는 자식 생성자로 부모 타입에 대입할 수 있음
		Parent child = new Child();
		
		// 이 기능의 필요성?
		child.printMoney();
		
		// 설계 때문이다.
		// 내 클래스나 인터페이스를 누군가 상속받아서 사용
		// 설계를 할 때는 내가 설계한 부모 클래스를 상속받은 사람이 자식 클래스의 이름을 뭘로 만들 지 알 수 없음
		// 그걸 대비해서 만든 것

	}
//
	// overload review
//	// 동일한 이름의 함수지만 동작하는 바가 다름
//	public void call(int phoneNumber) {
//		System.out.println(phoneNumber + "로 전화를 겁니다.");
//	}
//	
//	public void call(String name) {
//		// 이름으로 전화번호를 검색
//		
//		// 해당 전화번호로 전화를 건다.
//	}
}

class Plug {
	int hole = 2;
	
	//public void 
}

class Parent {
	int money = 10000000;
	String car = "SLR";
	String house = "수상가옥";
	
	public void printMoney() {
		System.out.println("잔고: " + money);
	}
	
	public void printCar() {
		System.out.println("자동차: " + car);
	}
}

class Child extends Parent {
	public void printHouse() {
		System.out.println(super.house);
	}
}
