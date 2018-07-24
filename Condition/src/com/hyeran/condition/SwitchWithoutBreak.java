package com.hyeran.condition;
/**
 * break를 사용하지 않는 switch
 * @author hyeran
 *
 */
public class SwitchWithoutBreak {

	public static void main(String[] args) {

		String job = "skater"; // swimmer, runner, skater, driver, rider
		
		switch(job) {
		case "swimmer":
			System.out.println("나는 수영복이 필요합니다.");
			break;
		case "runner":
			System.out.println("나는 운동화가 필요합니다.");
			break;
		case "skater":
//			System.out.println("나는 탈것이 필요합니다.");
//			break;
		case "driver":
//			System.out.println("나는 탈것이 필요합니다.");
//			break;
		case "rider":
			System.out.println("나는 탈것이 필요합니다.");
			break;
		}

	}

}
