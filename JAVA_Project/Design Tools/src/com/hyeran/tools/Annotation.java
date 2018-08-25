package com.hyeran.tools;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 애너테이션 설계
// 1. Target: 적용할 대상 (생성자, 변수, 함수, 패키지, 클래스)
// 2. Retention: 정보의 유지 단계 (소스 코드, 컴파일, 실행 시간)
// 3. Documented: 문서화 되어야 하는 애너테이션일 경우 사용
// 4. Inherited: 자동으로 상속받는 애너테이션 타입일 경우

@Target(ElementType.TYPE)	// TYPE = 클래스(클래스의 또 다른 이름은 사용자 정의 타입)
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation {
	public String value() default "어떤 값";
	// val이라는 함수가 실행되면 defualt로 "어떤 값"이 return
	
	public String key();
	
	// public String aaa;(X) 변수 선언만은 불가능. 초기화 하면 가능
}
