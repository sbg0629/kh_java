package homework;

import java.util.Scanner;

public class home4 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("달을 입력 하세요 : ");
	int a = scanner.nextInt();
	
	if (a == 1 || a==12 || a==2) {
		System.out.println("겨울");
	} else if (a == 3 || a==4 || a==5) {
		System.out.println("봄");	
		}else if (a == 6 || a==7 || a==8) {
			System.out.println("여름");	
			}else {
				System.out.println("가을");
			}
}
}
