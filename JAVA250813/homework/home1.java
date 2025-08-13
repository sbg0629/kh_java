package homework;

import java.util.Scanner;

public class home1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3자리 정수 입력");
		int a = scanner.nextInt();
		int b = a/100; //100의자리
		int c = (a%100) / 10 ; //10의자리
		int d = (a%100)%10; //1의자리

		System.out.println("100의자리와 10의 자리 합은 : " + (b+c));
		System.out.println("10의자리와 1의 자리 곱은 : " + c*d);
	}
}
