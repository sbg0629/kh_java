package Chapter05;

public class InstanceofExample {
private static void method1(Parent parent) {
	// Parent parent = new Child(); child 객체를 판단.
	//instanceof: 객체가 해당 클래스 타입인지 판단(참/거짓)
	if (parent instanceof Child) {
		//다운캐스팅
		Child child = (Child)parent;
		System.out.println("method1 - Child 로 변환 성공.");
	} else {
		System.out.println("method1 - Child 로 변환 실패.");
	}
	
}
public static void main(String[] args) {
	//업캐스팅
	Parent parentA = new Child();
	method1(parentA); //성공
	
	Parent parentB = new Parent();
	method1(parentB); //실패
}
}
