package chapter03;

import java.util.Scanner;

/*
 * 시간을 입력 받아서 임금 계산
 * */
public class Pay {
	public static void main(String[] args) {
		final int RATE = 10000; //1시간 임금
		int hour ; //시간
		int pay ; //1시간 임금을 시간에 곱한값(급여)
		
		System.out.println("시간을 입력 하세요");
		
		Scanner scanner = new Scanner(System.in);
		
		hour=scanner.nextInt();
		
//		8시간 초가 : 1시간 임금 *시간*1.5
		if (hour > 8) {
			pay =(int)(RATE * 8 + (RATE * (hour-8 )*1.5));
		} else { //8시간 이하 : 1시간 *임금
			pay = RATE * hour;
		}
		System.out.println("급여" +pay+ "입니다");
		scanner.close();
	}
}
