package question07;

import java.util.Scanner;

public class ChangeMoney {
public static void main(String[] args) {
	int[] unit = {50000,10000,1000,500,100,50,10,1};
	Scanner scanner = new Scanner(System.in);
	System.out.println("금액을 입력하세요");
	int money = scanner.nextInt(); //65123 입력
	
	for (int i = 0; i < unit.length; i++) {
		int a = money/unit[i]; //50000원 권 첫 출력. 몫이 1나옴 if문에 맞아서 출력

		if(a>0) {
			System.out.println(unit[i] +"원 :"+a+"개");
			money%=unit[i]; // 남은 돈을 계속 저장 (핵심 point)
		}
	}
	
	}
}
