package question01;

import java.util.Scanner;

public class q6 {
	public static void main(String[] args) {
		final double Dolla=1200;
		final double Euro=1500;
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요 ");
		int m = scanner.nextInt();

		double d = m/Dolla;
		double e = m/Euro;
		
		System.out.println(m+"원은 $"+d);
		System.out.println(m+"원은 E"+e);
		
		scanner.close();
	}
}
