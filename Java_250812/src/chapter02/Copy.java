package chapter02;

public class Copy {
	public static void main(String[] args) {
		String origin = "가나다라"; //origin 변수의 초기값 설정
		String copy = origin;
		System.out.println(origin);
		System.out.println(copy);
		
		copy = copy +"마바사라";
		System.out.println(copy);
		
		
	}
}
