package com.hyeran.tools;
/**
 * 객체 지향 설계 도구?
 * @author hyeran
 *
 */
public class ToolMain {

	public static void main(String[] args) {

		// 객체 지향을 설계할 수 있도록 도와주는 것들
		
		// 1. interface
		// 설계자의 의도대로 기능을 구현하도록 강제하는 것
		// 설계자가 미리 정해놓은 함수 이름
//		Child child = new Child();
//		child.function();
//		child.open();
		
		// 2. abstract (추상 클래스, 추상 함수)
		// 설계자의 의도대로 기능을 구현하도록 강제하는 것
		// 설계자가 미리 정해놓은 함수 이름 + 로직(연산이 일어난 코드)
		// 초기화 할 수 없다. 상속을 통해서만 사용 가능
		
		// Abstract abst = new Abstract(); X
		
		Abstract child = new AbstractChild();
		// 타입이 Abstract인 경우 AbstractChild에서 새로 만든 함수는 사용 불가
		child.open();
		child.close();
		
		// 3. annotation
	}
}

// 1. abstract 만들기

abstract class Abstract {
	
	abstract public void open();
	
	// 일반 함수도 만들 수 있음
	public void close() {
		System.out.println("문이 닫혔습니다.");
	}
}

// 2. abstract 사용하기 > 상속과 동일
class AbstractChild extends Abstract {

	@Override
	public void open() {
		System.out.println("문이 열렸습니다.");
	}
	
	public void something() {
		
	}
}








// 1. 인터페이스 만들기
// 인터페이스 이름은 주로 Interface의 약자인 I를 붙여서 설계
interface ITool {
	// 내부에 함수만 만들 수 있음
	// body가 없음
	public void function();	// 함수를 선언만 함
	
	public void function2();
}

interface IDoor {
	public void open();
}

// 2. 인터페이스 구현하기 = 상속에서의 extends와 유사하게 사용
// 	     인터페이스에서는 implements 예약어 사용
class Child implements ITool, IDoor {

	@Override	// 애너테이션
	public void function() {
		System.out.println("구현한 함수1이 실행됨");
	}

	@Override
	public void function2() {
		System.out.println("구현한 함수2가 실행됨");
	}

	@Override
	public void open() {
		System.out.println("문이 열렸습니다.");
		
	}
}
