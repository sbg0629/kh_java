package question06;

import java.util.Scanner;

public class MutipleOfThree {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("양수의 정수를 10개 입력하세요");
		int Array[] = new int[10];
		
		for (int i = 0; i < Array.length; i++) {
			Array[i]=scanner.nextInt();
		}
			System.out.print("3의 배수는");
			for (int i = 0; i < Array.length; i++) {				
				if(Array[i]%3 == 0) {
					System.out.println(Array[i]);
				}
			}
			scanner.close();
		}
	}

