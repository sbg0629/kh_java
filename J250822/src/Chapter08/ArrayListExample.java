package Chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//List 컬렌션에서 ArrayList 클래스로 객체 생성(재네릭 타입파라미터를 String)
		//upcastion
		List<String> list = new ArrayList<>(); //리스트가 arraylist보다 위에 있음. 리스트에 커서 위치하고 ctrl+t
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
//		list.add("Database");
		list.add(2, "Database"); //2번 인덱스에 삽입되어서 2번이 밀려남 > 3번 :servlet/jsp
		list.add("Spring");
		
		int size = list.size();
		System.out.println("총 list 갯수 : "+ size);
		
		String skill = list.get(2);
		System.out.println("2번째 인덱스 " + skill);
		
		
		for (int i = 0; i < size; i++) {
			String str = list.get(i);
			/*
			  * 0 : java
				1 : JDBC
				2 : Database
				3 : Servlet/JSP
				4 : Spring


			 * */
			System.out.println(i +" : " +str);
		}
		System.out.println();
		
		list.remove(2);
		
//		for (int i = 0; i < size; i++) { 오류
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
	
			System.out.println(i +" : " +str);
		}
		System.out.println();
		
		list.remove("Spring");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			
			System.out.println(i +" : " +str);
		}
		System.out.println();
	}
}
