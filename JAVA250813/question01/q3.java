package question01;

import java.util.Scanner;

public class q3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("2개의 정수를 입력");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int sum = a+b;
	int x = a*b;
	System.out.println("두수의 합은"+sum);
	System.out.println("두수의 곱은"+x);
	
	scanner.close();
}
}
