package package12;

//다른 패키지에서 접근할 떄 import 
import package11.A;

public class C {
	A a1 = new A(true);
	
	//default 접근지정자는 다른패키지에서 접근 불가
//	A a2 = new A(1);
	
	//private 접근지정자는 접근 안됌(자기클래스만 접근됌)
//	A a3 = new A("문자열");
}
