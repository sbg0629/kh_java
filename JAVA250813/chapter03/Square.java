package chapter03;

public class Square {
	public static void main(String[] args) {
		int n = 4;
		int s = square(n); //메소드 호출
//		System.out.println(s);
		System.out.println("한변의 길이가 "+n+"인 정사각형의 넓이는? " +s);
}
	//square 메소드 명
//	void: 리턴 타입이 없음
//public static void square() {
//	int length : int 타입의 매개변수 (인자,라파미터,입력변수)
//	n -> length로 받음
public static int square(int length) { //메소드 정의부
		
//		return; //생략 가능
//	return ""; //void 대신 int 타입 불일치시 오류
//	return 0;
	return length * length;
	
	}
}
