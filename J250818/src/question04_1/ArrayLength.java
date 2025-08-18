package question04_1;

import java.util.Scanner;

public class ArrayLength {
public static void main(String[] args) {
	
	int arr[] = new int[5];
	double sum = 0;
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("양수 5개를 입력하세요");
	
	
	for (int i = 0; i < arr.length; i++) {
		arr[i] = scanner.nextInt(); //5번 반복해서 양수 5개를 배열 원소에 저장
		sum += arr[i];
	}
//	for (int i = 0; i < arr.length; i++) {
//	
//		sum += arr[i];
//	}
	System.out.println("평균은 "+sum/arr.length);
	scanner.close();
	
}
}
