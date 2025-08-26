package question09;

class Point3{
	private int x,y;

	public Point3(int x, int y) {	this.x = x;this.y = y;}

	public int getX() {return x;}	
	public int getY() {	return y;}
	protected void move(int x,int y) {this.x= x;this.y=y;}

}

public class Point3D extends Point3{
	private int a;
	
	public int getA() {return a;}
	
	public Point3D(int x,int y , int a) {
		super(x, y);
		this.a=a;
	}
	public String toString() {
		return "("+getX()+","+getY()+","+a+")";
	}
//	@Override
	public void moveUp() {
		a++;
	}
	public void moveDown() {
		a--;
	}
	
	public void move(int x, int y,int a) {
		super.move(x, y);
		this.a=a;
	}
	
public static void main(String[] args) {
	Point3D p = new Point3D(1,2,3);
	System.out.println(p.toString()+"입니다");
	
	p.moveUp();
	System.out.println(p.toString()+"입니다");
	
	p.moveDown();
	p.move(10,10);
	System.out.println(p.toString()+"입니다");
	
	p.move(100,200,300);
	System.out.println(p.toString()+"입니다");
}
}
