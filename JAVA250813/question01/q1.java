package question01;

import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //키보드 입력
		
		System.out.println("반지름을 입력하세요"); //문자 출력
		 
		int rid = scanner.nextInt(); //반지름 키보드 값 입력 받기
		double pi = 3.14; // 원주율을 3.14로 두고
		double area = rid *rid * pi; //원넓이 반지름*반지름*3.14
		System.out.println("원의 면적은 = " +area); 
		
		scanner.close();
	}
}
