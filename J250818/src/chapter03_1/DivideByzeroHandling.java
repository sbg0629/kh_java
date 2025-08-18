package chapter03_1;

import java.util.Scanner;

/*
 * 나눗셈(분자,분모 입력 받음)
 * 몫을 출력(분모가 0인 경우 불능)
 * */
public class DivideByzeroHandling {
public static void main(String[] args) {
	int dividend;
	int divisor;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("분자를 입력하세요 >> ");
	dividend = scanner.nextInt();
	
	System.out.print("분모를 입력하세요 >> ");
	divisor = scanner.nextInt();
	
//	분자를 입력하세요 >> 10
//	분모를 입력하세요 >> 0
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at chapter03_1.DivideByzero.main(DivideByzero.java:22)
	
	System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+ dividend/divisor+" 입니다.");
	scanner.close();
}
}
