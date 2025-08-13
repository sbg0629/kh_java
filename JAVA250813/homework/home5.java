package homework;

import java.util.Scanner;

public class home5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("달을 입력 하세요 : ");
	int a = scanner.nextInt();
	
	switch (a) {
	case 12:
	case 1:
	case 2:
		System.out.println("겨울");
		break;
	case 3:
	case 4:
	case 5:
		System.out.println("봄");
		break;
	case 6:
	case 7:
	case 8:
		System.out.println("여름");
		break;
	default:
		System.out.println("가을");
		break;
	}
}
}