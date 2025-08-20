package Chapter05;

/*
 * Point 클래스 (x,y) 한점을 표현
 * Point 클래스를 상속받은 ColorPoint 클래스 (색을 가진 점)
 * */
class Point{
	private int x, y; //4번
	
	public void set(int x ,int y) { //2번 
		this.x = x;	
		this.y = y; //3번 
	}
	
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}

}
//ColorPoint 서브 클래스 (자식)
class ColorPoint extends Point{ //point는 슈퍼 클래스(부모)
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		//메소드 안에서 상속받은 메소드 호출.
		showPoint();
	}
}

public class ColorPointEX {
	public static void main(String[] args) {
		Point p = new Point(); //객체를 생성, 멤버는 4개, 생성자 호출(기본)
		//1.메소드 호출
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();//객체 생성 멤버는7개 생성자 호출(기본):point(슈퍼) > colorpoint(서브)
		cp.set(3, 4);
		cp.showPoint();
		cp.setColor("red");
		cp.showColorPoint();
		
		
	}
	
}
