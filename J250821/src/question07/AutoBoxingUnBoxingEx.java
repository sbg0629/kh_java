package question07;

public class AutoBoxingUnBoxingEx {
public static void main(String[] args) {
	int n = 10;
	//n을 값으로 가지는 객체 생성(intObject: 참조변수)
	Integer intObject = Integer.valueOf(n);//boxing
	Integer intObject2 = n;//auto boxing
	
	//10출력
	System.out.println("intObject = "+intObject);
	System.out.println("intObject2 = "+intObject2);
	 
//	int m = intObject.intValue()+intObject.intValue();//언박싱
	int m = intObject+intObject;//오토 언박싱

	System.out.println("m = "+m);
}
}
