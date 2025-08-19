package Chapter04;

public class Circle {
	//멤버 변수(필드)
	int radius; 
	String name;
	
	//오버로딩 대표적인게 생성자 같음
//	┌─클래스하고 이름이 똑같은 메소드 : 생성자(기본)
	public Circle() {}
	public Circle(int a) {} // 클래스 하고 이름이 똑같는 메소드: 생정자(매개변수 1개)
	public Circle(int a,int b) {} // 클래스 하고 이름이 똑같는 메소드: 생정자(매개변수 2개)
	
	private double getaArea() { //멤버 함수(메소드)
		return 3.14 * radius * radius;
	}
public static void main(String[] args) {
	Circle pizza; //참조변수(태명) 선언, Circle 이 클래스(객체를 생성하는 틀/판)
//	new Circle();//이름 없는 circle
	pizza = new Circle(); //객체 생성 이름이 pizza
	pizza.radius =10; //멤머변수 값
	pizza.name ="자바피자"; //멤머변수 값
	double area = pizza.getaArea(); //멤버 함수 호출
	System.out.println(pizza.name+"의 면적은"+area); //멤버 변수 값 사용
	
	Circle donut = new Circle();//객체 생성 이름이 donut
	donut.radius = 2;
	donut.name = "자바도넛";
	area = donut.getaArea();
	System.out.println(donut.name+"의 면적은"+area); //멤버 변수 값 사용
	
}
}
