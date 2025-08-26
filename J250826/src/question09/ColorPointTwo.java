package question09;


class PointTwo{
	private int x,y;
	public PointTwo(int x, int y) {	this.x = x;this.y = y;}

	public int getX() {return x;}	
	public int getY() {	return y;}
	protected void move(int x,int y) {this.x= x;this.y=y;}
}
public class ColorPointTwo extends PointTwo {
	String Color;

	public ColorPointTwo() {
		this(0, 0);
	}
public ColorPointTwo(int x, int y) {
		super(x, y);
		this.Color = "Black";
	}
private void setXY(int x,int y) {
	move(x, y);
}
public void setColor(String color) {
	Color = color;
}
@Override
public String toString() {

	return Color+"색의"+"("+getX()+","+getY()+")"+"입니다";
}




public static void main(String[] args) {
	ColorPointTwo zeroPoint = new ColorPointTwo();
	
	System.out.println(zeroPoint.toString()+"입니다");
	
	ColorPointTwo cp = new ColorPointTwo(10,10);
	cp.setXY(5,5);
	cp.setColor("RED");
	System.out.println(cp.toString()+"입니다");
	
}
}
