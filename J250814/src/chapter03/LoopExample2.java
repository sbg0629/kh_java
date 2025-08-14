package chapter03;

import java.util.Scanner;

public class LoopExample2 {
public static void main(String[] args) {
	int n;
	int i = 1;
	System.out.print("구구단 중에서 출력하고 싶은단을 입력하세요");
	Scanner sr = new Scanner(System.in);
	n = sr.nextInt();
	
	while (i<=9) {
		System.out.println(n+"*"+i+"="+(n*i));
		i++;
	}
	sr.close();
}
}
