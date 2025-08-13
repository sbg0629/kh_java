package homework;

import java.util.Scanner;

public class home2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력 받고 중간 크기 의 수 출력");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a>b && a<c) {
			System.out.println("중간값은 :"+a);
		}else if (c>b && c<a) {
			System.out.println("중간값은 :"+b);
			
		}else {
			System.out.println("중간값은 :"+c);
		}
	}
}
