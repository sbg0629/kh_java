package question08;

import java.util.Random;
import java.util.Scanner;

public class RandomArray2 {
public static void main(String[] args) {
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("정수 몇개?");
	int a = scanner.nextInt();
	int array[] = new int[a];
	
	for (int i = 0; i < array.length; i++) {
		array[i] = random.nextInt(100)+1;
		for (int j = 0; j < i; j++) {
			if(array[i]==array[j])
			{
				i--;
			}
			
		}
	}	
	for (int b = 0; b < array.length; b++) {
		System.out.print(array[b]+" ");
	}
}
}

