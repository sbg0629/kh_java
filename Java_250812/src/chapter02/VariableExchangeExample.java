package chapter02;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:"+x+" y:"+y);
		
//		x값을 임시저장
		int temp = x;
//		x를 y값으로 저장
		x = y;
		//임시 값을 y에 저장
		y = temp;
		System.out.println("x:"+x+" y:"+y);
	}

}
