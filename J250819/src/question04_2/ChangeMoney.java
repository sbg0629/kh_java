package question04_2;

import java.util.Scanner;

public class ChangeMoney {
public static void main(String[] args) {
	final int 오만원 = 50000;
	final int 만원 = 10000;
	final int 천원 = 1000;
	final int 백원 = 100;
	final int 오십원 = 100;
	final int 십원 = 10;
	final int 일원 = 1;
	int res,money;
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("금액을 입력하세여");
	
	money = scanner.nextInt();
	
	res = money/오만원;
	if(res>0) {
		System.out.println("오만원권 "+ res+ " 매");
	}
	money = money % 오만원; //나머지
	res = money / 만원;
	if(res>0) {
		System.out.println("만원권 "+ res+ " 매");
	}
	
	money = money % 만원; //나머지
	res = money / 천원;
	if(res>0) {
		System.out.println("천원권 "+ res+ " 매");
	}
	
	money = money % 천원; //나머지
	res = money / 백원;
	if(res>0) {
		System.out.println("백원 "+ res+ " 매");
	}
	
	money = money % 백원; //나머지
	res = money / 오십원;
	if(res>0) {
		System.out.println("오십원"+ res+ " 매");
	}
	money = money % 오십원; //나머지
	res = money / 십원;
	if(res>0) {
		System.out.println("십원 "+ res+ " 매");
	}
	
	money = money % 십원; //나머지
	res = money / 일원;
	if(res>0) {
		System.out.println("일원권 "+ res+ " 매");
	}

	scanner.close();
	
	
	
//	Scanner scanner = new Scanner(System.in);
//	System.out.print("금액을 입력하세여");
//	int money = scanner.nextInt();
		
//	int a = money / 50000;
//	int b = (money %50000)/10000;
//	int c = (money %10000)/1000;
//	int d = (money %1000)/100;
//	int e = (money %100)/50;
//	int f = (money %50)/10;
//	int g = (money %10)/1;
//	
//	
//	System.out.println("오만원권 "+a);
//	System.out.println("만원권 "+b);
//	System.out.println("천원권 "+c);
//	System.out.println("백원권 "+d);
//	System.out.println("오십원 "+e);
//	System.out.println("십원 "+f);
//	System.out.println("일원 "+g);
}
}
