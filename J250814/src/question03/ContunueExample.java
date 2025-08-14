package question03;

import java.util.Scanner;

public class ContunueExample {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int sum = 0;
	System.out.println("정수 5개를 입력하세요");
	
	for(int i = 0; i<5;i++) {
		int a = scanner.nextInt();
		if (a<=0) {
			continue;
		} else {
			sum+=a;
		}
//		if (a>0) {
//			sum+=a;
//		}
	}
	System.out.println("입력된 양수들의 합: " + sum);
    scanner.close();
}
}
