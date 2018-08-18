package com.hyeran.collection;

import java.util.Random;
import java.util.TreeSet;

/**
 * Collection 알아보기 - Set
 * @author hyeran
 *
 */
public class SetMain {

	public static void main(String[] args) {
		
		// Set - List와 동일한데 중복 값을 허용하지 않음
		// 		  동일한 Collection 인터페이스를 사용하기 때문에 명령어(함수) 체계가 같음
		//		 index가 없음
		//		  중복 값을 허용하지 않음. 같은 값이 입력되면 제거
		
		/*
		 * 중요 - 컬렉션은 꼭 generic과 함께 쓴다!
		 */
		
		// HashSet, TreeSet <- 자동 정렬 기능
		// 0. TreeSet 선언
		TreeSet<String> set = new TreeSet<>();
		
		// 1. 입력
		set.add("월");
		set.add("화");
		set.add("수");
		set.add("목");
		set.add("금");
		
		set.add("수");	// 중복 -> 제거
		
		// 2. 조회 - 반복문을 통해 조회하는 것이 가장 쉽다.
		for(String item : set) {
			// 자동 정렬 되기 때문에 가나다 순으로 출력
			System.out.println(item);
		}

		// 3. Set 예제 - 로또 번호 생성기
		// TreeSet이 자동으로 중복을 걸러주므로 중복 코드가 필요 없어서 코드가 많이 짧아짐
//		Random random = new Random();
//		TreeSet<Integer> numbers = new TreeSet<>();
//		while(numbers.size() < 6) {
//			int num = random.nextInt(35)+1;
//			numbers.add(num);
//		}
//		for(int item : numbers) {
//			System.out.println(item);
//		}
		
		System.out.println("----------------삭제 후----------------");
		
		// 5. 삭제
		set.remove("금");
		for(String item : set) {
			// 자동 정렬 되기 때문에 가나다 순으로 출력
			System.out.println(item);
		}
		
		System.out.println("----------------수정 후----------------");
		
		// 4. 수정 = 삭제+입력
		set.remove("월");
		set.add("일");
		for(String item : set) {
			// 자동 정렬 되기 때문에 가나다 순으로 출력
			System.out.println(item);
		}
	}

}
