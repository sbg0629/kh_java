package question08;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	//문자열 리스트
	ArrayList<String> a = new ArrayList<String>();
	
	//4번 반복해서 이름 입력하기
	for (int i = 0; i < 4; i++) {
		System.out.print("이름을 입력하세요");
		String s = scanner.next();		
		a.add(s); //리스트 a 에 이름 넣기
	}
	
	
	for(int i = 0 ; i<a.size(); i++) {
		String name = a.get(i);
		System.out.print(name + " ");
	}
	
	
	int longname = 0;
	for (int i = 0; i < a.size(); i++) {
		if(a.get(longname).length() < a.get(i).length())
			longname = i;
	}
	System.out.println("\n 가장 긴 이름은   =  "+a.get(longname) );
	
	
	scanner.close();
}

}
