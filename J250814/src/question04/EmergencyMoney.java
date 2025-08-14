package question04;

import java.util.Scanner;

public class EmergencyMoney {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("가구의 수를 입력하세요");
	int a = scanner.nextInt();//가구 수
	int money = 0;
	int b = 0 ; //100달러
	int c = 0;  //10달러
	
	
	if(a == 1) {
		money = 400000/1200;
		b = money/100;
		c = (money%100)/10;
		System.out.println(a+"의 가구에수는");
		System.out.println("100달러 자리는 "+b+"매");
		System.out.println("10달러 자리는 "+c+"매");
		
	}
	if(a == 2) {
		money = 600000/1200;
		b = money/100;
		c = (money%100)/10;
		System.out.println(a+"의 가구에수는");
		System.out.println("100달러 자리는 "+b+"매");}
	else if(c!=0) {
//		System.out.println("10달러 자리는 "+c+"매");		
	}
		
	if(a == 3) {
		money = 800000/1200;
		b = money/100;
		c = (money%100)/10;
		System.out.println(a+"의 가구에수는");
		System.out.println("100달러 자리는 "+b+"매");
		System.out.println("10달러 자리는 "+c+"매");
		
	}
	if(a == 4) {
		money = 1000000/1200;
		b = money/100;
		c = (money%100)/10;
		System.out.println(a+"의 가구에수는");
		System.out.println("100달러 자리는 "+b+"매");
		System.out.println("10달러 자리는 "+c+"매");
		
	}
}
}
