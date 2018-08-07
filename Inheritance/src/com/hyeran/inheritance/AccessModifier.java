package com.hyeran.inheritance;

import com.hyeran.inheritance.another.NewParent;

/**
 * 상속이란?
 * - protected 접근제한자 알아보기
 * @author hyeran
 *
 */
public class AccessModifier {

	public static void main(String[] args) {
		
		// 3. protected 접근제한자
		NewParent parent = new NewParent();
		
		NewChild child = new NewChild();
		child.printProtected();

	}

}

class NewChild extends NewParent {
	public void printProtected() {
		System.out.println(car);
	}
}