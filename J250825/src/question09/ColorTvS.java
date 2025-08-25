package question09;

class TV {
	 private int size;
	 public TV(int size) { this.size = size; }
	  protected int getSize() { return size; }
	  }

class ColorTv extends TV{
	int color;
	
	public ColorTv(int size, int color) {
	super(size);
	
	this.color = color;
	}
	
	void printProperty() {
		System.out.println(getSize()+"인치 " + color +"컬러");
	}
	
}

public class ColorTvS {
public static void main(String[] args) {
	ColorTv myTV = new ColorTv(32,1024);
	myTV.printProperty();
	
	
}
}
