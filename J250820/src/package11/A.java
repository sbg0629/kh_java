package package11;

public class A {
	public A(boolean b) {
		
	}
	//오버로딩
	A(int b) { //default 접근 지정자.
		
	}
	private A(String b) { //private 접근 지정자
		
	}
	//객체 생성 하면서 생성자 호출
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
}
