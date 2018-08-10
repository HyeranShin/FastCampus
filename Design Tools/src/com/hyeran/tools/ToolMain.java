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
		// 사전적 의미로 "주석 달기"라는 뜻
		// 주석 앞에 @을 이용하여 주석을 작성하는 것
		
		//주석과 애너테이션의 차이
		// 1. 주석: 오로지 개발자만 보기 위해 작성하는 비고
		// 2. 애너테이션: 개발자, 컴파일러, 런타임(실행환경)
		
		// @Override: 컴파일러에 정보를 제공 (개발자에게도 알려줌)
		// 애너테이션의 용도
		// 가. 컴파일러에 정보 제공
		// 나. 실행 시간에 특수 기능 제공
		// 다. 코드 자동 생성
		
		AnnoClass anno = new AnnoClass();
		
		// anno 변수에서 애너테이션 정보 꺼내기
		String value = anno.getClass().getAnnotation(Annotation.class).value();
		System.out.println(value);
		
		Class cls = anno.getClass();
		// 도트 연산자 썼을 때 나오는 함수들에서 콜론 뒤에 나오는 타입이 해당 함수의 리턴 타입
		Annotation ano = (Annotation) cls.getAnnotation(Annotation.class);
		String key = ano.key();
		System.out.println(key);
		
	}
	
}

/* 애너테이션 사용하기 */

@Annotation(key = "추가된 키의 값")
class AnnoClass {
	
}



/* abstract 사용하기 */

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






/* interface 사용하기 */

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
