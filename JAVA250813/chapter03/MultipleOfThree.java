package chapter03;

import java.util.Scanner;

/*
 * 숫자를 입력 받아서 3의 배수 여부를 출력 
 * */
public class MultipleOfThree {
	public static void main(String[] args) {
		System.out.println("수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if (number%3 == 0) {
			System.out.println("3의 배수 입니다");
		}else {
			System.out.println("3의 배수가 아이다");
		}
		scanner.close();
	}
	

}
