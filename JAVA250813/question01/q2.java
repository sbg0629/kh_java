package question01;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가로 세로 길이를 입력하세요");
		
		int a = scanner.nextInt(); //가로
		int b = scanner.nextInt(); //세로
		int rectangle = a*b; //면적
		System.out.println("사각형의 면적은 = " +rectangle);
		
		scanner.close();
	}

}
