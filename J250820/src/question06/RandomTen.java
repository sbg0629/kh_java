package question06;

import java.util.Random;

public class RandomTen {
public static void main(String[] args) {
	Random random = new Random();
	int Array[] = new int [10];
	int sum = 0;
	System.out.print("랜덤한 정수들: ");
	for (int i = 0; i < Array.length; i++) {
//		Array[i]=random.nextInt(10)+1;
		int r = (int)(Math.random()*10)+1;
		Array[i] = r;
		sum += Array[i];
	}
	for (int i = 0; i < Array.length; i++) {
		System.out.print(Array[i]+" ");
	}
//	System.out.println();
	System.out.println("\n평균 = "+(double)(sum/Array.length));
	
}
}
