package Chapter04;

//	public class Circle {
public class Circle2 {
//	4.멤버변수가 1
	//1.4 매개변수 값이 멤버 변수로 저장됨
	int radis;
	String name;
	public double getArea() {
		return radis*radis*3.14;
	}
	
//	2.생성자 호출 됨
	public Circle2() {
//		3.반지름 1
		radis = 1;
		name = ""; 
	}
	
	//1.2 생성자 호출됌
	public Circle2(int radis, String n) {
		//매개변수와 멤버변수가 같을때 this 사용하면 경고창 없애줌.
		//1.3 매개변수 값이 저장
		this.radis = radis; //10 
		name = n; //자바피자
	}
	
 public static void main(String[] args) {
	//레퍼런스 (참조) 변수 선언
//	 Circle2 pizza;
	 //객체 생성하면서 생성자 호출(기본 생성자 없으면 자동으로 생성해서 호출)
	 //기본 생성자 외에 다른 생성자가 있으면 생성하지 못해서 컴파일 오류
//	 new Circle2();

//	 1.객체 생성하면서 생성자 호출
	 Circle2 pizza = new Circle2();//반지름이 1이고 이름(name)이 없는 피자 생성.
	 double area = pizza.getArea();
	 System.out.println(area);
	 
	 //매개 변수 1개를 가지고 있는 생성자가 없어서 오류
	 //new Circle2(10); //객체 생성
	 
	 //1.1객체 생성하면서 생성자 호출 (매개변수10, '자바피자' 2개를 들고 감.)
	 Circle2 pizza2 = new Circle2(10, "자바피자"); //반지름이 10이고 , 이름은 자바피자인 pizza객체를 생성
	 area = pizza2.getArea();
	 System.out.println(pizza2.name+"의 면적은 "+area);
	 
	 Circle2 donut = new Circle2(); //반지름이 10이고 , 이름은 자바피자인 pizza객체를 생성
	 donut.name="자바도넛";
	 area = donut.getArea();
	 System.out.println(donut.name+"의 면적은 = " + area);
	 
 	}	
}
