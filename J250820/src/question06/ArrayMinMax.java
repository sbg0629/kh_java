package question06;

import java.util.Scanner;

public class ArrayMinMax {
public static void main(String[] args) {
	int max = 0;
	int min = Integer.MAX_VALUE;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("양수 10개를 입력하세요");
	int Array[] = new int [10];
	
	for (int i = 0; i < Array.length; i++) {
		Array[i]= scanner.nextInt();
		if(Array[i]>max) {
			max=Array[i];
		}
		if(Array[i]<min) {
			min = Array[i];
		}
	}
	System.out.println("가장 작은 수는 "+min+"이고, 가장 큰 수는 "+ max +"이고 최소값 + 최대 값은 "+(min+max)+"입니다");
	scanner.close();
}
}
