//package question01;
//
//import java.util.Scanner;
//
//public class q5 {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("원하를 입력하세요");
//		int money = scanner.nextInt();
//		
//		double m = dollar(money);
//		System.out.println(money + "은 $" + (double)(m/1100));
//		
//		
//		int money = scanner.nextInt();
//		System.out.println(money + "은 $" + (double)(money/1100));
//	}
//	public static double dollar(int x) {
//		return x/1100;
//	}

//}
package question01;

import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		final int RATE = 1100;
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하를 입력하세요");
		int money = scanner.nextInt();
		double dollar = money/RATE;
		System.out.println(money + "은 $" + dollar);
	
		scanner.close();

}
}