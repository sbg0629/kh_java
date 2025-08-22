package Chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		//arraylist 클래스타입으로 arraylist 클래스로 객체 생성(재너릭 타입파라미터를 string)
		ArrayList<String> array = new ArrayList<String>(); //객체 생성
		
		boolean aaa= array.add("oracle");
		System.out.println(aaa); //true
		boolean bbb= array.add("mysql");
		System.out.println(bbb); //true
		boolean ccc = array.add("oracle");//중복된 객체를 추가해도 문제 없음
		System.out.println(bbb); //true
		
		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			System.out.println(i + " : " + str);
			
		}
	}
}
