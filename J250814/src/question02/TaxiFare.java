package question02;

import java.util.Scanner;

public class TaxiFare {
public static void main(String[] args) {
	Scanner scaneer = new Scanner(System.in);
//	System.out.println("요금을 입력하세여");
	int income = 0; //총 요금
	
	for (int i =0 ;i<10; i++) {
		System.out.print("요금을 입력하세여: ");
		int fare = scaneer.nextInt();
//		System.out.println("요금을 입력하세여"+fare);
		income += fare;
		
	}
	System.out.println("총 수입은: "+income);
	scaneer.close();
}
}
