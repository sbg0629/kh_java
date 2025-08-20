package Chapter05;

class Shape{
public void draw() {
	System.out.println("Shape");
	}
}
class Line extends Shape{
	
	//오버라이딩(void:리턴 타입 일치, draw : 메소드명 일치, 매개변수 없는 것 일치)
	public void draw() {
		System.out.println("Line");
	
	
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
public class MethodOverridingEx {
	//shape p = new Line(); upcastion
	//shape p = new Shape();
	
	static void paint(Shape p) {
		//업캐스팅에 의해서 슈퍼클래스의 draw()매소드로 갔다가 오버라이딩 되어서 line 으로 간다.
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); //line (업캐스팅, 오버라이딩)
		paint(new Shape()); //Shape
		paint(new Rect()); //Rect (업캐스팅, 오버라이딩)
		paint(new Circle()); //Circle (업캐스팅, 오버라이딩)
	}
}
