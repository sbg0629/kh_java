package question06;

public class TV {
	String name;
	int year;
	int a;
	
	public TV(String name,int year, int a) {
		this.name =name;
		this.year =year;
		this.a = a;
	}
	public void show() {
		System.out.println(name+"에서 만든 "+year+" 년형 "+a+" 인치 티비");
	}
	
	
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		
		myTV.show();
	}
		
}

