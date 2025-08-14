package question03;

import java.util.Scanner;

public class Tesla {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("매수 수량을 입력하시오>>");
	int a = scanner.nextInt();
	a = a*520;
	int b = a/100;
	int c = (a%100)/10;
	
	System.out.println("100달러짜리"+b+"매");
	if(c!=0) {
		System.out.println("10달러짜리"+c+"매");		
	}else {
		System.out.println();
	}
}
}

