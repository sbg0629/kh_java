package chapter03_2;

public class NumberFormatException {
public static void main(String[] args) {
//	String[] stringNumber = {"23","12","3","998"};
	String[] stringNumber = {"23","12","aaa","9.35","3","998"};
	
	int i ;

	for (i = 0; i < stringNumber.length; i++) {
		try {
			//integer : wrapper클래스
			//parseint : 문자열을 정수로 반환하는 메소드
			int j = Integer.parseInt(stringNumber[i]);
			System.out.println("숫자로 변환된 값은 "+j);
		} catch (Exception e) {
			System.out.println(stringNumber[i]+"는 정수로 변환 할 수 없습니다.");
		}
	}
}
}
