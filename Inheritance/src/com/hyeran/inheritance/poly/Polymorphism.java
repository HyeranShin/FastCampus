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
		 * 
		 */
		
		// 코드로는 자식 생성자로 부모 타입에 대입할 수 있음
		CarList list = new CarList();
		
		Car sonata1 = new Sonata();
		list.add(sonata1);	
		// 타입이 다름에도 불구하고 상속을 받았으므로 다형성때문에 자동으로 Sonata의 타입이 Car로 변함 
		
		BMW bmw1 = new BMW();
		list.add(bmw1);
		
		Sonata sonata2 = new  Sonata();
		list.add(sonata2);
		
		// 자동차 목록 출력
		list.printList();
		
//		Parent child = new Child();
		
		// 이 기능의 필요성?
		// 설계 때문이다.
//		child.printMoney();
		
	}
}
	
// 자동차 수집가가 수집 목록에 새로운 자동차를 추가한다.
class CarList {
	Car cars[] = new Car[10];	// 자동차를 저장할 저장소
	int index = 0;
	
	public void add(Car car) {
		cars[index] = car;
		index = index + 1;
	}
	
	public void printList() {
		for (Car car : cars) {
			if (car != null)
				car.printName();
		}
	}
}
class Car {
	String name ="";
	public void printName() {
		System.out.println(name);
	}
}

// 개발자 1
class Sonata extends Car {
	public Sonata() {
		name = "소나타";	// 선언 없이 사용하기 위해서 생성자에 코딩
		System.out.println("생산되었습니다.");
	}
	public void drive() {
		System.out.println("자동차를 운전합니다.");
	}
}

// 개발자 2
class BMW extends Car {
	public BMW() {
		name = "BMW";
	}
}

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
//}
//
//class Plug {
//	int hole = 2;
//	
//	//public void 
//}
//
//class Parent {
//	int money = 10000000;
//	String car = "SLR";
//	String house = "수상가옥";
//	
//	public void printMoney() {
//		System.out.println("잔고: " + money);
//	}
//	
//	public void printCar() {
//		System.out.println("자동차: " + car);
//	}
//}
//
//class Child extends Parent {
//	public void printHouse() {
//		System.out.println(super.house);
//	}
//}
