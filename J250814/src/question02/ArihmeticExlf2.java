package question02;

import java.util.Scanner;

public class ArihmeticExlf2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("연산>>");

	String op = scanner.next();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	int res = 0;
	
	if (op.equals("+")) {
		res = b+c;
	}else if (op.equals("-")) {
		res = b-c;
	}else if (op.equals("*")) {
		res = b*c;
	}else if (op.equals("/")) {
		if(c == 0) {
			System.out.println("0으로 나눌 수 없습니다");
			scanner.close();
			return;
		}else {
		res = b/c;
	}		
		}else {
			System.out.println("사칙 연산이 아닙니다.");
			scanner.close();
			return;
		}
	System.out.println(op+b+c+"의 계산 결과는 "+res);
	scanner.close();
}
}