package com.hyeran.inheritance;
/**
 * 상속에 대해 알아봅시다
 * @author hyeran
 *
 */
public class InheritMain {

	public static void main(String[] args) {

		// 1.1 상속이란?
		// 부모 클래스에 정의된 것을 상속받은 자식 클래스가 사용 가능
		Child child = new Child();
		System.out.println(child.money);
		
		child.printHouse();
		child.printParentsHouse();
		
		// 1.2 상속 관계에서의 호출 순서
		// 부모 클래스가 생성된 후에 자식 클래스가 생성
		
		// 1.3 다단 상속 알아보기
		GrandChild grandChild = new GrandChild();
		
		// 1.4 다중 상속은 허용 X
		
		// 2. 오버라이드 override
		// ~보다 더 중요하다
		// 상속 관계에서 자식에 선언된 자원을 사용하기 위해 쓰임
		// 부모 클래스의 함수와 같은 이름의 함수를 자식 클래스에 정의
		
		// 3. protected 접근제한자
		
		// 4. 다형성 polymorphism
		
		// 5. 내부클래스 inner class

	}

}

class Parent {
	int money = 1000;
	String car = "BMW530i";
	String house = "XX아파트";
	
	public Parent() {
		System.out.println("부모님입니다.");
	}
	
	public void printHouse() {
		System.out.println(house);
	}
}

// 상속을 받기 위해서는 extends 예약어 사용
class Child extends Parent {
	String house = "초가집";
	
	public Child() {
		System.out.println("자식입니다.");
	}
	
	public void printHouse() {
		System.out.println(super.house);
	}
	
	// super 예약어를 사용하면 부모의 자원을 사용할 수 있음
	public void printParentsHouse() {
		super.printHouse();
	}

	// this는 현재 내 클래스에 있는 자원을 사용하게 함
	public void print() {
		this.printHouse();
	}
}

// 손자 클래스
class GrandChild extends Child {
	public GrandChild() {
		System.out.println("손자입니다.");
	}
}