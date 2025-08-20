package package11;

public class B {
	//private 접근지정자는 접근 안됨(자기 클래스만 접근됌)
	//default 접근지정자는 접근됌(같은 패키지)
	A a1 = new A(true);
	
	A a2 = new A(1);
	
//	A a3 = new A ("문자열"); 오류가 뜸.
}
