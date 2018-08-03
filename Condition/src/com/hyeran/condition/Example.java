package com.hyeran.condition;
/**
 * if문과 switch 언제 사용하나?
 * if: 범위
 * switch: 값
 * 변수의 값을 특정할 수 있고 값의 종류가 많을 때 switch
 * @author hyeran
 *
 */
public class Example {

	public static void main(String[] args) {
		//-----------------
		// GDH 웹사이트 회원 정보
		// ----------------
		
		// 회원 1
		String name1 = "강다니엘";
		int age1 = 21;
		String gender1 = "남";
		String job1 = "singer";
		
		// 회원 2
		String name2 = "박지훈";
		int age2 = 21;
		String gender2 = "남";
		String job2 = "singer";
		
		// 회원 3
		String name3 = "박진영";
		int age3 = 46;
		String gender3 = "남";
		String job3 = "producer";

		// 회원 N
		
		// 1. 40대 이상 회원, 40대 미만 회원 분리
		String above40[] = new String[100];
		String under40[] = new String[100];
		
		int aboveIndex = 0;
		int underIndex = 0;
		
		if (age1 >= 40) {
			above40[aboveIndex++] = name1;
		}else {
			under40[underIndex++] = name1;
		}
		
		if (age2 >= 40) {
			above40[aboveIndex++] = name1;
		}else {
			under40[underIndex++] = name1;
		}
		
		if (age3 >= 40) {
			above40[aboveIndex++] = name1;
		}else {
			under40[underIndex++] = name1;
		}
		
		// switch로 전환
		switch(age1) {
		case 40:
			above40[aboveIndex++] = name1;
		case 41:
		case 42:
		case 43:
			// ...
		}
		
		// 2. 직업군으로 회원 분리
		String singer[] = new String[100];
		String producer[] = new String[100];
		
		int singerIndex = 0;
		int producerIndex = 0;
		
		switch(job1) {
		case "singer":
			singer[singerIndex++] = name1; break;
		case "producer":
			producer[producerIndex++] = name1; break;
		case "writer":
			//
		case "dancer":
			//
		case "investor":
			//
		case "trainer":
			//
		}
		
		// if문으로 전환
		if(job1.equals("singer")) {
			singer[singerIndex++] = name1;
		} else if(job1.equals("producer")) {
			//
		} else if(job1.equals("writer")) {
			//
		} else if(job1.equals("dancer")) {
			//
		} else if(job1.equals("investor")) {
			//
		} else if(job1.equals("trainer")){
			//
		}
	}

}
