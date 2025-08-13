package question01;

import java.util.Scanner;

public class q7 {
public static void main(String[] args) {
	System.out.println("정수 3개를 입력하시오");
	Scanner scanner = new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	
	if (a+b> c && a+c >b && a+c > b ) {
		System.out.println("삼각형이 됩니다");
	}
//	}else if(a+c >b) {
//		System.out.println("삼각형이 됩니다");
//	}
//	else if(a+c > b) {
//		System.out.println("삼각형이 됩니다");
//	}
	else {
		System.out.println("삼각형이 안됩니다ㅠ");
	}
		scanner.close();
}
}

//if ((a+b)<=c||(c+b)<=a||(a+c)<=b) 안된다