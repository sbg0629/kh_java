package question01;

import java.util.Scanner;

//class 여러개 사용해도 무관
class Aaa{}
class Baa{}

//public class: 자바 파일안에 두개 이상 존재시 오류
//public class: caa{}
//1.jvm 이 수많은 class에서 public class 찾아감 
public class q4 {
	public static void aaa() {
		System.out.println("888");
	}
	
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("2개의 실수 입력");
	double a = scanner.nextDouble();
	double b = scanner.nextDouble();
	
	System.out.println("두 수의 덧셈은? "+(a+b));
	System.out.println("두 수의 뺼셈은? "+(a-b));
	System.out.println("두 수의 곱셈은? "+(a*b));
	System.out.println("두 수의 나눗셈은? "+(a/b));
	
	scanner.close();
}
}
