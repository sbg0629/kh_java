package Chapter05;

import java.security.spec.ECGenParameterSpec;

public class ChildExample {
	public static void main(String[] args) {
		//Parent 클래스에 기본 생성자 만들어서 호출하고,
		//Child 클래스에 기본 생성자 만들어서 호출.
//		new Child();
		
		//upcasting (super class 타입으로 sub class 객체 저장)
		Parent parent = new Child();
		parent.filed1 = "data1";
//		 upcastion 된 객체는 서브클래스 멤버 접근 불가
//		parent.filed2 = "data2";//오류
		
		parent.method1();
		parent.method2();
		
//		upcastion 된 객체는 서브클래스 멤버 접근 불가
//		parent.method3();//오유
		
		//down-casting
		Child child = (Child)parent;
		//down-casting 객체는 서브클래스 멤버 접근 가능.
		child.field2="yyy";
		child.method3();
}
}
