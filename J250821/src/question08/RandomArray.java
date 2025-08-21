package question08;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
public static void main(String[] args) {
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("정수 몇개?");
	int a = scanner.nextInt();
	int array[] = new int[a];
	
	for (int i = 0; i < array.length; i++) {
		int r = random.nextInt(100)+1;
		array[i]=r;
		
		
		if (i%10 == 0) {
			System.out.println();
		}
		System.out.print(array[i] +" ");
	}
	scanner.close();
}
}
