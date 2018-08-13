package com.hyeran.innerclass;
/**
 * inner 클래스
 * @author hyeran
 * 	// 종류
	// 1. 멤버 클래스
	// 2. static 클래스
	// 3. local 클래스 - 함수 안에 정의
	// 4. 익명 클래스 - 단독으로 실행되는 클래스 - 주로 interface를 구현하는 형태로 정의
 *
 */
public class InnerMain {

	public static void main(String[] args) {

		// 객체 지향 설계 마무리 - 이너 클래스로 정리
		
		// inner class란?
		// 클래스 내부에 정의하는 클래스
		
		// 1. 이너클래스 사용하기
		Outer out = new Outer();

		Outer.Inner in = out.new Inner();	// 외부 클래스를 통해서 new 연산자 사용 가능
	
		// 6. static 이너클래스 사용하기
		Common.Inner in2 = new Common.Inner();
		
		// 8. 지역클래스 사용하기
		Local out2 = new Local();
		out2.local();
	}

}

// 8. 지역(Local) 이너클래스
class Local {
	int outer_variable = 15;
	public void local() {
		int local_variable = 37;
		
		class Inner {
			public void init() {
				System.out.println(outer_variable);
				System.out.println(local_variable);
			}
		}
		
		new Inner().init();
	}
}





// 6. static 이너클래스
class Common {
	final static int flag = 10;
	int variable = 20;
	public static void startFunction() {}
	private void getValue() {}
	
	static class Inner {
		public void init() {
			int innerVariable = flag;	// outer의 static 멤버변수
			startFunction();
			// 7. staitc 이너클래스에서는 외부 클래스의 static 멤버만 사용할 수 있음
			// getValue(); (X)
		}
	}
}




// 1. 일반적인 이너클래스의 형태
class Outer {
	
	final static int flag = 10;
	int variable = 20;
	public static void startFunction() {}
	private void getValue() {}

	class Inner {
	
		// 2. 이너클래스에서는 static으로 된 멤버를 사용할 수 없음
		// 단 final은 예외
		final static int pi = 3;
		//static int var = 20;
		
		// 3. 외부 멤버의 이름을 사용할 수 있음
		int variable = 35;
		
		public void init() {
			// 4. 일반 이너클래스에서는 외부 클래스의 모든 자원 사용 가능. 자기 것 처럼
			int innerVariable = flag;	// outer의 static 멤버변수
			startFunction();
			getValue();
		}
	}
}
