package question04_2;

import java.util.Scanner;

public class ArrayMin {
public static void main(String[] args) {
//	int min = 0;
	int min = Integer.MAX_VALUE;//int 타입의 가장 큰 숫자
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("양수 7개를 입력하세요");
	int Array[] = new int[7];
	
	for (int i = 0; i < Array.length; i++) {
		Array[i] = scanner.nextInt();
		//1번 방법
//		if (i==0) {
//			min = Array[i];
//		}
		
		if(Array[i]<min) {
			min = Array[i];
		}
	}		
	System.out.println("가장 작은 수 는 "+min+"입니다");
	scanner.close();


}
}


