package chapter03;

public class RandomNumber {
	public static void main(String[] args) {
		int n = rollDie();
		System.out.println("주사위의 수는: " +n);
	}
//	매개변수가 없는 메소드 (주사위의 숫자 구하기 = 1~6)
	private static int rollDie() {
		//random():0이상1미만 난수 발생 (실수)
//		Math.random();
//		random():0이상6미만 난수 발생(실수)
		double x= 6*Math.random();
		//0~5의 난수
		int temp = (int)x;
		
//		1~6까지 난수
		return temp+1;
	}

}
