package question01;

import java.util.Scanner;

public class q9 {
public static void main(String[] args) {
	System.out.println("2자리수 정수를 입력하세요 10~99");
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	
	if (a == 11 || a ==22 ||a ==33 ||a ==44 ||a ==55 ||a ==66 ||a ==77 ||a ==88 ||a ==99) {
		System.out.println("Yes! 10의 자리 와 1의 자리 가 같다");
	}else{
		System.out.println("No! 10의 자리와 1의 자리가 다르다");
	}
	scanner.close();
}
}
