package homework;

import java.util.Scanner;

class People{
	 String name;
	 String phonenum;
	
	public People(String name, String phonenum) {
		this.name = name;
		this.phonenum = phonenum;
	}
	
	
	
}
public class PhoneBook {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("인원수 >> ");
	int peolenum = scanner.nextInt(); 
	People a[] = new People[peolenum];
	
	for (int i = 0; i < a.length; i++) {
		System.out.print("이름과 전화 번호 (이름이과 번호는 빈 칸 없이 입력)>> ");
		String name = scanner.next();
		String phonenum = scanner.next();
		a[i]=new People(name,phonenum);
	}
	System.out.println("저장했습니다");
	for (int j = 0; true; j++) { //무한반복
		System.out.print("검색할 이름은>> ");
		String b = scanner.next();
		if(b.equals("그만")) {
			System.out.println("프로그램을 종료합니다");
			break;
		}
		for (int i = 0; i < a.length; i++) {
			if(b.equals(a[i].name))
				System.out.println(a[i].name+"의 번호는 "+a[j].phonenum);
		}
//		else{
//			System.out.println(b+" 없습니다.");
//			break;
		}
		scanner.close();
		
	}
}

