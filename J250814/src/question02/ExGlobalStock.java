package question02;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("매수금액은");
		int a = scanner.nextInt();//매수금액
		System.out.print("매도금액은");
		int b = scanner.nextInt();//매도 금액
		double res;
		
		if(b>a) {
			res = (double)(b-a)*0.22;
			System.out.println("양도세"+res);
		}else if(b<=a) {
				res = 0;
				System.out.println("양도세"+res);
		}
//		System.out.println("양도세"res);
		
		scanner.close();
		
		}
}
