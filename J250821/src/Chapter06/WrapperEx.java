package question07;

public class WrapperEx {
public static void main(String[] args) {
	char c1 = '4',c2 ='F';
	
	//Chareacter Wrapper클래스
	//isDigit 숫자 체크하는 메소드.
	if(Character.isDigit(c1)) {
		System.out.println("숫자");
	}else {
		System.out.println("숫자 아님");
	}
	//isDigit 숫자 체크하는 메소드.
	if(Character.isDigit(c2)) {
		System.out.println("숫자");
	}else {
		System.out.println("숫자 아님");
	}
	//isAlphabetic:영문자 인지 체크하는 메소드
	if(Character.isAlphabetic(c2)) {
		System.out.println("영문자");
	}else {
		System.out.println("영문자 아님");
	}
	if(Character.isAlphabetic(c1)) {
		System.out.println("영문자");
	}else {
		System.out.println("영문자 아님");
	}
	//Integer: wrapper클래스 , parseInt: 문자열을 정수로 반환
	System.out.println(Integer.parseInt("-123")); //정수 -123출력
	//toHexString 16진스
	System.out.println(Integer.toHexString(28)); //1c = 16+12=28 (16진수)
	System.out.println(Integer.toBinaryString(28)); //11100=16+8+4=28
	System.out.println(Integer.bitCount(28)); //11100=1의 개수 ->3
	
	Double d = Double.valueOf(3.14); //3.14를 포람하는 객체를 가리키는 d참조변수
	System.out.println(d.toString()); //믄자열 3.14를 출력
	System.out.println(Double.parseDouble("3.14")); //실수3.14를 출력.
	
	boolean b = (4>3);
	//Boolean.toString : Boolean Wrapper 클래스의 toString 메소드로 불린 값을 문자열로 반환
	System.out.println(Boolean.toString(b)); //문자열 true 출력.
	System.out.println(Boolean.toString(b)); //문자열 true 출력.
	//parseBoolean  : parseBooleanan 메소드로 문자열을 불린값으로 변환 
	System.out.println(Boolean.parseBoolean("false")); //불린값 false로 변환
	
}
}
