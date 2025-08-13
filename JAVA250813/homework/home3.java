package homework;

import java.util.Scanner;

public class home3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("점 (x,y)좌표를 입력하세요");
	int x = scanner.nextInt();
	int y = scanner.nextInt();
	
	int a = 100;
	int b =100;
	int c =200;
	int d =200;
	
	
	if(x > a && x < c && y > b && y < d) {
		System.out.println("("+x+","+y+")는 사각형 안에 있습니다");

	}else {
		
		System.out.println("("+x+","+y+")는 사각형 밖에 있습니다");
	}
}
}
