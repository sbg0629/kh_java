package question01;

import java.util.Scanner;

public class q8 {
	public static void main(String[] args) {
	System.out.println("정수를 입력하세여");
	Scanner scanner = new Scanner(System.in);
//	int a = scanner.nextInt(); 
//	int b = scanner.nextInt(); 
//	int c = scanner.nextInt(); 
	float li1 = scanner.nextFloat(); 
	float li2 = scanner.nextFloat(); 
	float li3 = scanner.nextFloat();
	
	if (li3 == 0) {
//	if (c == 0) {
//	if (a != 0 && b !=0 && c==0){
		System.out.println("삼각형의 넓이는" + li1*li2/2);
//		System.out.println("삼각형의 넓이는 "+(double) (a*b/2));
	}else {
		
		System.out.println("사다리꼴의 넓이는" +(li1+li2)*li3/2);
//		System.out.println("사다리꼴의 넓이는" +(double)((a+b)*c/2));
	}
	scanner.close();
	}
}

