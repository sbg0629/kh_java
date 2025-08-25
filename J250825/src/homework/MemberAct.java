package homework;

import java.util.Scanner;
class People1{
	String name;
	String age;
	String number;
	public People1(String name, String age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}

}
public class MemberAct {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("------------------------");
	System.out.println("헬스클럽 회원 관리 프로그램");
	System.out.println("------------------------");
	System.out.println("1.회원정보 관리");
	System.out.println("2.프로그램 종류");
	System.out.print("메뉴 선택>>");
	int memu = scanner.nextInt(); //메뉴 선택
	if(memu ==1) {
		System.out.println("------------------------");
		System.out.println("회원 정보 관리");
		System.out.println("------------------------");
		System.out.println("1.회원 정보 입력");
		System.out.println("2.회원 정보 삭제");
		System.out.println("3.회원 정보 확인");
		System.out.println("4.이전메뉴");
		System.out.print("메뉴 선택 >> ");
		int memu1 =scanner.nextInt();
		if(memu1 == 1) {
			System.out.println("가입 할 회원 수를 입력 >> ");
			int people = scanner.nextInt();
			People1 p[] = new People1[people];
			for (int i = 0; i < p.length; i++) {
				System.out.println((i+1)+"번 회원 등록");
				System.out.print("이름 입력: ");
				String name = scanner.next();
				System.out.print("나이 입력: ");
				String age = scanner.next();
				System.out.print("전화번호 입력: ");
				String phonenum = scanner.next();
				p[i] = new People1(name, age, phonenum);
			}
			System.out.println("총 " +p.length+"명의 회원 정보가 등록 되었습니다!");
			
			System.out.println("------------------------");
			System.out.println("등록 된 회원 정보 관리");
			System.out.println("------------------------");
			for (int i = 0; i < p.length; i++) {
				System.out.println("회원번호" + (i+1));
				System.out.println("이름 "+p[i].name);
				System.out.println("이름 "+p[i].age);
				System.out.println("이름 "+p[i].number);
				System.out.println("------------------------");
			}
			System.out.print("메뉴 선택 >> ");
			if(memu1 == 2) {
				System.out.print("삭제 할 번호를 입력하세요>>");
				int delpeople = scanner.nextInt();
				
				
			}
		}
	}else if(memu == 2){
		System.out.println("프로그램 종료");
	}else {
		System.out.println("잘못 입력");
	}
	
}
}
