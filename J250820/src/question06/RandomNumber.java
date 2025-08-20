package question06;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		Random generator = new Random();
		
		while(true) {
			int random = generator.nextInt(10)+1; //난수 발생 (1~10)
			System.out.println(random);
			if(random == 7) {
				break;
			}					
		}
		
//		System.out.println(generator.nextInt());//난수 발생 (int 타입 범위 (-2의 31승~2의 31승 - 1) 까지.)
//		System.out.println(generator.nextInt(10));//난수 발생 (0~9사이 정수))
//		System.out.println(generator.nextBoolean()); //참 거짓
//		System.out.println(generator.nextDouble());//0~1 사이
//		
	}
}
