package Chapter07_Generic;

public class BoxExample2 {
public static void main(String[] args) {
	// 제네릭 타입 파라미터 :String
//	Box2<String> box1 = new Box2<String>();
	//자바 7부터 생략 가능(다이아몬드 파라미터<>)
	Box2<String> box1 = new Box2<>();
	
	box1.set("hello");
	//┌─컴파일 단계에서 제네릭 타입 감지
//	box1.set(777);  //오류
	//┌─불필요한 타입 변환 없이 바로 받아 올 수 잇음.
	String greet = box1.get();
	System.out.println(greet);
	
	
//	Box2<int> box2 = new Box2<>(); //Wrapper클래스 와야함 
	Box2<Integer> box2 = new Box2<>(); 
	//컴파일 단계에서 제네릭 감지
//	box2.set("hello"); //오류
	
	//auto boxing
	box2.set(777);
	//auto unboxing
	int number=box2.get();
	System.out.println(number);
	}
}
