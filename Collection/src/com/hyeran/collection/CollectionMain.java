package com.hyeran.collection;

import java.util.ArrayList;
import java.util.Map;

/**
 * Collection 알아보기
 * @author hyeran
 *
 */
public class CollectionMain {

	public static void main(String[] args) {

		/*
		 * Collection
		 */
		// 배열은 정해진 크기를 벗어난 값을 입력할 수 없음
		int array[] = new int[100];
//		array[101] = 53; (X)
		// 컬렉션은 정해진 크기가 없고, 값을 계속 넣을 수 있음
		
		// 가. List와 Set은 Collection 인터페이스 사용
		// 1. List(설계 객체)
		// 배열과 흡사. 배열처럼 index로 값 접근
		// 리스트에는 실제 구현체가 4가지 정도 있음
		ArrayList arrayList = new ArrayList();
		
		// 1.1 입력 - add(입력할 값)
		arrayList.add("첫번째");	// List에 아무런 처리를 하지 않고 값을 입력하면  Object 타입으로 변환돼서 입력
		arrayList.add("두번째");
		arrayList.add(37);		// 그래서 서로 다른 타입도 입력 가능
		
		System.out.println(arrayList.size());
		
		// 1.2 조회(읽기, 접근) - get(index)
		String one = (String)arrayList.get(0);
		System.out.println(arrayList.get(0));
		
		// 1.3 수정 - set(index, 수정할 값)
		arrayList.set(0, "수정된 값");
		System.out.println(arrayList.get(0));
		
		// 1.4 삭제 - remove(index)
		arrayList.remove(1);
		
		System.out.println("리스트의 최종 길이=" + arrayList.size());
		System.out.println(arrayList);
		
		// 2. Set
		// List인데, 중복을 허용하지 않는 List
		
		// 나. Map은  Map 인터페이스 사용
		// 3. Map
		// 키와 값으로 구성된 배열

	}

}
