package Chapter08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 : 구조가 키 , 값으로 구성
		//Map 인터페이스 타입으로 hashmap 클래스 객체 생성(키:문자열, 값,정수형 Wrapper클래스)
		Map<String, Integer> map=new HashMap<String, Integer>(); //업캐스팅
		
		map.put("임영웅",31);
		map.put("영탁",38);
		map.put("이찬원",25);
//		map.put("임영웅",30); 키 중복은 안됌
		map.put("김호중",31); //값은 중복 허용
		
		System.out.println("총 Entry 수 : "+map.size() ); //map.enrty 구조로 키 값으로 구성
		System.out.println("임영웅: "+map.get("임영웅"));
		System.out.println();
		

		Set<String> keyset = map.keySet();
		Iterator<String> ketIterator =  keyset.iterator();
		//MAP 컬렉션 키/값을 가져오는 1번쨰 방심
		while (ketIterator.hasNext()) { //객체가 있으면 참
			String key = ketIterator.next(); //컬렉션 객체를 가져옴
			map.get(key); //get()메소드로 map 컬렌션의 키를 가지고 값을 가져옴
			Integer value = map.get(key);
			//출력 순서는 랜덤으로 발생됌
			System.out.println("\t"+key+": "+value);
		}
		System.out.println();
		

		map.remove("임영웅");
		System.out.println("총 Entry 수 : "+map.size() ); //map.enrty ㄱ조로 키 값으로 구성
		
		//map.enrty 구조로 키/값 으로 객체를 받음.
		Set<Map.Entry<String,Integer>> entrySet =map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		//MAP 컬렉션 키/값을 가져오는 2번쨰 방심
		while (entryIterator.hasNext()) { //객체가 있으면 참
			Map.Entry<String, Integer> entry = entryIterator.next(); //컬렉션 객체를 가져옴
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+": "+value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수 : "+map.size() ); 
		}

}
