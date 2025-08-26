package question09;
class Point4{
	private int x,y;

	public Point4(int x, int y) {	this.x = x;this.y = y;}

	public int getX() {return x;}	
	public int getY() {	return y;}
	protected void move(int x,int y) {this.x= x;this.y=y;}

}

public class PositivePoint extends Point4 {
	public PositivePoint() {
		this(0,0);
	}
	public PositivePoint(int x,int y) {
		super(x, y);
		
		if(x<0||y<0) {//x또는 y가 0보다 작으면 0,0
			super.move(0, 0);
		}
	}
	@Override
	public String toString() {
		return"("+getX()+","+getY()+")";
	}
	
	protected void move(int x, int y) {
		if(x>=0 && y>=0) //x랑 y가 0보다 크면 x,y출력
		super.move(x, y);
	}
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10,-10);
		System.out.println(p2.toString()+"입니다.");
		
	}
}
