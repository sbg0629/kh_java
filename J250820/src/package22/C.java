package package22;

import package21.A;

public class C {
public static void main(String[] args) {
	A a =new A();
	a.field1 =3;
	//default private 은 다른 패킺에서 접근 불가
//	a.field2 =3; 
//	a.field3 =3;
	
	a.method1();

//	default private 은 다른 패킺에서 접근 불가
//	a.method2();
//	a.method3();
}
}
