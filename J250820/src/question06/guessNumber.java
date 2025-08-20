package question06;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int guess = random.nextInt(10)+1;
		
		
		while(true) {
			System.out.print("추측한 숫자를 입력하세요");
			int numberToguess = scanner.nextInt();			
			
			if(guess<numberToguess) {
				System.out.println("추측한 숫자가 틀렸습니다");
				System.out.println("추측한 숫자가 너무 큽니다.");
				
			}else if(guess>numberToguess) {
				System.out.println("추측한 숫자가 틀렸습니다.");
				System.out.println("추측한 숫자가 너무 작습니다");
			}else {
				System.out.println("맞췄습니다");
				break;
			}
		}	
		scanner.close();
	}
}
