package question09;

class TV2{
    private int size;
    public TV2(int size) {
        this.size = size;
    }
    protected int getSize() {
        return size;
    }
}
class ColorTV2 extends TV2{
    int color;
    public ColorTV2(int size, int color) {
        super(size);
        this.color = color;
    }
    protected int getColor() {
        return color;
        }
}
	class IPTV1 extends ColorTV2{
		private String ip;
		public IPTV1(String ip, int size, int color) {
			super(size, color);
			this.ip = ip;
		}
	void printProperty() {
		System.out.println("나의 IPTV는 "+ ip +" "+getSize()+"인치 " + color +"컬러");
	}
	
}
public class IPTV {
public static void main(String[] args) {
	IPTV1 iptv = new IPTV1("192.1.1.2",32,2048);
	iptv.printProperty();
}
}
