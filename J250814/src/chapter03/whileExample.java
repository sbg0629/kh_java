package chapter03;

import java.util.Scanner;

/*
 * 정수를 입력 받음
 * 입력 받은 갯수와 평균 출력
 * 마지막에 -1을 입력 중단
 * */
public class whileExample {
	public static void mian() {
		int count =0;
		int sum = 0;
		
		System.out.println("정수를 입력 하고 마지막 -1을 입력");
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		
		//n이 -1이 아닐때 까지 반복
		while (n != -1) {
			sum+=n;
			count++;
			n = sr.nextInt();
		}
		
		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
		}else {
			System.out.println("정수의 갯수는" +count+"개 입니다");
			System.out.println("평균" +(double)sum/count+" 입니다");
		}
		sr.close();
	}
}
