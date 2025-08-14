package question02;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세여: ");
		int a = scanner.nextInt();
		
		int hours = a / 3600; //시
		int minutes = (a % 3600) / 60; //분   (timme/60)%60
		int seconds = a % 60; //초
		
		System.out.println(a+"초는"+hours+"시"+minutes+"분"+seconds+"초");
	}
	}