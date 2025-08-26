package question09;

interface Shape2{
	final double PI = 3.14;
	void draw();
	double getArae();
	default public void redraw() {
		System.out.print("-----다시 그립니다.");
		draw();
	}
}
class Circle2 implements Shape {
	private int radius1;
	public Circle2(int radius1) {this.radius1 = radius1;}
	@Override
	public void draw() {
		System.out.println("반지름이 "+radius1+"인 원입니다.");
	}

	@Override
	public double getArae() {
		return radius1*radius1*PI;
	}
	
}
class Oval implements Shape{
	private int a;
	private int b;
	public Oval(int a,int b) {this.a = a; this.b=b;}
	@Override
	public void draw() {
		System.out.println(a+"x"+b+"에 내접하는 타원입니다");
	}
	@Override
	public double getArae() {
		return PI*0.5*a*0.5*b;
	}
}
class Rect implements Shape{
	private int a;
	private int b;
	public Rect(int a,int b) {this.a = a; this.b=b;}
	@Override
	public void draw() {
		System.out.println(a+"x"+b+"에 크기의 사각형입니다");
	}
	@Override
	public double getArae() {
		return a*b;
	}
}

public class Shapes2 {
public static void main(String[] args) {
	Shape[] list = new Shape[3];
	
	list[0] =new Circle(10);
	list[1] =new Oval(20,30);
	list[2] =new Rect(10,40);
	
	for (int i = 0; i < list.length; i++) {
		list[i].redraw();
	}
	for (int i = 0; i < list.length; i++) {
		System.out.println("면적은 "+list[i].getArae());
	}
}
}
