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
		Child child = new Child();
		child.function();
		child.open();
		
		// 2. abstract
		
		// 3. annotation
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
