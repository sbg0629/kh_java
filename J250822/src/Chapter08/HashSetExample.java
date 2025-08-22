package Chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{}
public class HashSetExample {
public static void main(String[] args) {
	//Set 인터페이스 컬렉션 타입으로 hashhset 클래스 객체 생성 
	Set<String> set = new HashSet<String>(); //upcasting
//	Set<AA> set = new HashSet<>(); 
//	Set<Object> set = new HashSet<>(); //object로 하면 스트링 객체 다 받아줌 
	set.add("JAVA");
	set.add("JDBC");
	set.add("Servlet/JSP");
	set.add("JAVA"); //set컬렉션 중복 객체 추가 불가
	AA a = new AA();//(object) 타입으로 사용 가능
//	set.add(a);
	
	
	int size = set.size();
	System.out.println("총 객체수 : " +size);
	
	//set컬렉션은 iterator 메소드 호출해서 Iterator 인터페이스 타입으로 값을 받음
	Iterator<String> iterator = set.iterator();
//	Iterator<Object> iterator = set.iterator();
	while (iterator.hasNext()) {//iteratro 객체 값이 있으면
		String element = iterator.next(); //값을 꺼내와서
		System.out.println("\t"+element);
	}
	set.remove("JDBC");
//	System.out.println("총 객체수 : " +size);
	System.out.println("총 객체수 : " +set.size());
	
//	Iterator<String> iterator2 = set.iterator();
//	while (iterator2.hasNext()) {//iteratro 객체 값이 있으면
//		String element = iterator2.next(); //값을 꺼내와서
//		System.out.println("\t"+element);
//}
	for (String element : set) {
		System.out.println("\t"+element);		
	}
	if (set.isEmpty()) { //객체가 하나라도 있는지 확인
		System.out.println("비어있다");
	} else {
		System.out.println("객체가 있다");
		
	}
	set.clear();
		if (set.isEmpty()) { //객체가 하나라도 있는지 확인
			System.out.println("비어있다");
		} else {
			System.out.println("객체가 있다");

	}
}
}
