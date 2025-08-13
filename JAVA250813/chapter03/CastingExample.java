package chapter03;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
//		int 타입을 char 타입으로 바로 저장하려고 하면오류
//		char 로 변환(casting)해서 저장
//		44032유니코드에 해당하는 '가' 문자 저장
		char charValue = (char)intValue;
		System.out.println("charValue = " + charValue);//가
		
		long longValue = 500;
		
//		intValue = longValue; 오류
//		정수 큰 타입에서 작은 타입을 변환 (변환 안 하면 오류)
		intValue = (int)longValue;
		System.out.println(intValue);//500
		
//		5000999888L에서 L 안 붙이면 int로 인식해서 오류 
		long longValue2 = 5000999888L;
		//long 타입 숫자가 int로 변환할 떄 잘려서 706032592로 저장
		intValue = (int)longValue2;
		System.out.println(intValue);//706032592
		
		double doubleValue = 3.14;
//		실수에서 정수로 변환했다
		intValue = (int)doubleValue;
		//3.14에서 소수점이 잘려서 3으로 저장
		System.out.println(intValue);//3
	}
}
