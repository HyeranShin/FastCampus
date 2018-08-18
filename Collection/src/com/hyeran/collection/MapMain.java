package com.hyeran.collection;

import java.util.HashMap;

/**
 * Colletion 알아보기 - Map
 * @author hyera
 *
 */
public class MapMain {

	public static void main(String[] args) {

		// map - 키와 밸류로 입력되고, 키로 조회할 수 있는 컬렉션
		
		/*
		 * 중요 - 컬렉션은 generic과 함께 쓴다!
		 */
		
		// 0. 정의
		HashMap<String, Integer> map = new HashMap<>();
		
		// 1. 입력 - put(키, 값) 키와 값을 모두 입력
		map.put("마지막월", 12);
		map.put("첫월", 1);
		
		// 2. 조회
		int lastMonth = map.get("마지막월");
		System.out.println(lastMonth);
		
		// 3. 수정
		map.put("마지막월", 11);
		lastMonth = map.get("마지막월");
		System.out.println(lastMonth);
		
		System.out.println("삭제 전 사이즈="+map.size());
		
		// 4. 삭제
		map.remove("마지막월");
		
		System.out.println("삭제 후 사이즈="+map.size());
		
	}

}
