package question04_2;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("10개의 정수를 입력하세요 >> ");
		int Array[] = new int[10];
		int sum = 0;
		
		for (int i = 0; i < Array.length; i++) {
			Array[i] = scanner.nextInt();
			sum += Array[i];
		}
		System.out.println("합계는 = "+sum);
		scanner.close();
	}
}
