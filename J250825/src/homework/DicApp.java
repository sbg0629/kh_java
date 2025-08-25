package homework;

import java.util.Scanner;

public class DicApp {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("한영 단어 검색 프로그램 입니다.");
	
	while (true) {
		System.out.print("한글 단어? ");
		String kor = scanner.next();
		if(kor .equals("그만")) {
			System.out.println("종료합니다");
			break;
		}
		switch (kor) {
		case "희망":
			System.out.println("희망은 hope");
			break;
		case "사랑":
			System.out.println("사랑은 love");
			break;
		case "아기":
			System.out.println("아기은 baby");
			break;
		case "돈":
			System.out.println("돈은 money");
			break;
		case "미래":
			System.out.println("미래은 future");
			break;
		default:
			System.out.println(kor + "는 저의 사전에 없습니다");
			break;
		}	
	}
	scanner.close();
}
}
