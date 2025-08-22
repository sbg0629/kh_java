package Chapter07_Generic;

//대문자 알파벳 T를 타입 파라미터로 받는 제네릭
public class Box2<T> { //T가 String    Integer
	//T가 string
	//3.hello    777
	private T t; //타입 파라미터를 t의 타입으로 사용
	
	//타입파라미터를 메소드의 리턴타입으로 사용
	//T가 string    Integer
	public T get() { 
		return t;
	}
	//T가 string    Integer
	//타입파라미터 를 메소드의 매개변수 타입으로 사용
	public void set(T t) { //1.hello(변환없이 저장됨)     777
		this.t =t; //2.hello   777
	}
}

