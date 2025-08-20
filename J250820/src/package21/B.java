package package21;

public class B {
	public static void main(String[] args) {
		A a =new A();
		a.field1 =2;
		a.field2 =2;
		//private 멤버는 자기 클래스만에서만 접근 됌
//		a.field3 =2;
		
		a.method1();
		a.method2();
		//private멤버는 자기 클래스 안에서만 접근됌
//		a.method3();
}
}
