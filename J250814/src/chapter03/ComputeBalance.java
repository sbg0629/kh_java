package chapter03;

import java.util.Scanner;

public class ComputeBalance {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("금액을 입력하세요 ");
	
	int purchaseAmount = scanner.nextInt(); //금액 입력
	int balance = 0;
	
	if(purchaseAmount>=300000) {
//		System.out.println("구매 금액 = "+purchaseAmount);
		balance = purchaseAmount - 30000;
//		System.out.println("청구 금액은 "+balance);
	}else if (purchaseAmount>=100000) {
//		System.out.println("구매 금액 = "+purchaseAmount);
		balance = purchaseAmount -5000;
//		System.out.println("청구 금액은 "+balance);
	}else if(purchaseAmount<100000) {
//		System.out.println("구매 금액 = "+purchaseAmount);
		balance = purchaseAmount;
//		System.out.println("청구 금액은 "+balance);
	}else {
		System.out.println("잘못입력한듯?");
	}	
	System.out.println("구매 금액 = "+purchaseAmount);
	System.out.println("청구 금액은 "+balance);
	
	scanner.close();
}
}
