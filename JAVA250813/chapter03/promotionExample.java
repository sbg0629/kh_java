package chapter03;

public class promotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		//작은 타입을 큰 타입으로 받음: 자동 변환
		int intValue = byteValue;
		System.out.println("intValue = " + intValue);
		
		char charValue = '가'; 
		//변슈에 유니코드가 저장.
		intValue = charValue;
		System.out.println("charValue = " + intValue);
		
		intValue = 50;
		//작은 타입을 큰 타입으로 받음 : 자동변환 
		long longValue = intValue;
		System.out.println("longValue = "+ longValue);
		
		longValue = 100;
		//정수 타입을 실수 타입으로 받음
		float floatValue = longValue;
		System.out.println("floatValue = "+floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue = " + doubleValue);
	}
}
