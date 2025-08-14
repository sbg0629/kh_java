package question03;

import java.util.Scanner;

public class Multiple {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	boolean multiple = false;
	
	System.out.println("양의 정수를 입력하세요");
	int number = scanner.nextInt();
	
	if(number>0) {
		if(number % 3 ==0) {
			System.out.println("3의 배수이다");
			multiple = true;
		}if (number % 5 == 0) {
			System.out.println("5의 배수이다");
			multiple = true;
		} if (number % 8 == 0) {
			System.out.println("8의 배수이다");
			multiple = true;
		}if(multiple == false){
			System.out.println("어늬 배수에도 속하지 않는다");
		}
	}
	scanner.close();
}
}
