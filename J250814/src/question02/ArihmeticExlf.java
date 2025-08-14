package question02;

import java.util.Scanner;

public class ArihmeticExlf {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("연산자를 입력하세요 + - * /");
	String a = scanner.next();
	System.out.println("정수 두개를 입력하세요");
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	
	if(a.equals("+")) {
		System.out.println("연산 >>"+b+"+"+c+"="+(b+c));
	}else if (a.equals("-")) {
		System.out.println("연산 >>"+b+"-"+c+"="+(b-c));		
	}else if (a.equals("*")) {
		System.out.println("연산 >>"+b+"*"+c+"="+(b*c));				
	}else if (a.equals("/")) {
	System.out.println("연산 >>"+b+"/"+c+"="+(b/c));
	
}else {
	System.out.println("잘못입력했슴.");
}
	scanner.close();
}
}

