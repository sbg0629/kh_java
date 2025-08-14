package question02;

import java.util.Scanner;

public class Nestedlf {
public static void main(String[] args) {
	Scanner scaneer = new Scanner(System.in);
	System.out.print("점수를 입력하세여");
	int a = scaneer.nextInt(); //점수입력
	System.out.print("학년을 입력하세요");
	int b = scaneer.nextInt();//학년을 입력하세요
//	if(a>=60&&b<4) {
//		System.out.println("합격입니다");
//	}else if(b >=4 && a>=70) {
//		System.out.println("합격입니다");
//	}else {
//		System.out.println("불합격입니다");
//	}
	if (a >=60) {
		if(b !=4) {
			System.out.println("합격");
		}else if(a>=70) {
			System.out.println("합격");			
		}else {
		System.out.println("불합격입니다");
		}
	}else {			
		System.out.println("불합격입니다");
	}
	scaneer.close();
}
}
