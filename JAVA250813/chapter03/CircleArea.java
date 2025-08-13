package chapter03;

public class CircleArea {
	public static void main(String[] args) {
		double pi = 3.14;
		int radius = 10;
		//숫자 연산시 결과는 큰 타입을 따라감 ┌─ 밑에 는 더블타입으로 따라감.
//		int circleArea = pi * radius * radius;
		double circleArea = pi * radius * radius;
		
		System.out.println(circleArea);
	}
}
