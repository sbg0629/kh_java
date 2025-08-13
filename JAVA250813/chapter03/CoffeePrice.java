package chapter03;

import java.util.Scanner;

/*
 * 커피 주문을 받아서 커피명과 가격을 출력*/
public class CoffeePrice {
public static void main(String[] args) {
	System.out.println("무슨 커피를 드릴까요? ");
	Scanner scanner = new Scanner(System.in);
	
	//next() 문자열 입력받은 메소드
	String order = scanner.next();
//	커피 가격 변수 선언
//	int price; 초기값이 없으면 오류 발생
	int price = 0;
	
	switch (order) {
	case "에소프레소":
	case "카푸치노:":
	case "가페라떼:":
		price = 3500;
		break;
	case"아메리카노":
		price = 2000;
		break;
		
	default:
		System.out.println("메뉴에 없슴돠!");
		break;
	}
	if (price != 0) {
		System.out.println(order+"가격은"+price+"입니다");		
	}
	
//	System.out.println(order+"가격은"+price+"입니다");
	scanner.close();
}
}
