package question08;

import java.util.Scanner;

public class PersonDriver {
public static void main(String[] args) {
	String lname;
	String fname;
	Person person1,person2;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("성을 입력화세요");
	lname = scanner.next(); //성을 읽어 들여서 저장
	
	System.out.print("이름을 입력하세요");
	fname = scanner.next(); //이름을 읽어 들여서 저장
	
	
	person1 = new Person();
	person1.lastName = lname;
	person1.firstname = fname;
	person1.show();

	System.out.print("성을 입력화세요");
	lname = scanner.next(); //성을 읽어 들여서 저장
	
	System.out.print("이름을 입력하세요");
	fname = scanner.next(); //이름을 읽어 들여서 저장
	
	person2 = new Person();
	person2.lastName = lname;
	person2.firstname = fname;
	person2.show();
}
}
