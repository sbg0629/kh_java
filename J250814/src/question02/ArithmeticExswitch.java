package question02;

import java.util.Scanner;

public class ArithmeticExswitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>>");

		String op = scanner.next();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int res = 0;
		
		switch (op) {
		case "+":
			res = b+c;
			break;
		case "-":
			res = b-c;
		case "*":
			res = b*c;
			break;
		case "/":
			if(c == 0) {
				System.out.println("0으로 나눌 수 없습니다");
				scanner.close();
				return;
			}else {
			res = b/c;
		}		
			break;
		default:
			System.out.println("사칙 연산 잘 못 함");
//			break;
			return;
		}
	}
}
