package question04;

import java.util.Scanner;

public class EmergencyMoney2 {
public static void main(String[] args) {
	final int hundred = 120000;
	final int ten = 12000;
	int res , money, num;
	Scanner scanner = new Scanner(System.in);
	System.out.println("가구의 수를 입력하세요");
	int a = scanner.nextInt();//가구 수
		
	if(a == 1) {
		money = 400000;
	}else if(a == 2) {
		money = 600000;
	}
	else if(a == 3) {
		money = 8000000;
	}else {
		money = 1000000;
	}
	res = money/hundred;
	if (res > 0) {
		System.out.println("100달러짜리로" + res + "매");
	}
//	나머지 돈을 다시 셋팅
	money = money % hundred;
	res = money/ten;
	if (res > 0) {
		System.out.println("00달러짜리로" + res + "매");
	}
	scanner.close();
	
}
}
