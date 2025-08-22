package Chapter07_Generic;

public class Box {
	private Object object; //홍길동 , 777
	
	public Object get() { 
		return object;
		
	}
	
	//Object  object = "홍길동" //upcasting
	//Object  object = 777 //upcasting
	//Object  object = new apple() //upcasting
	public void set(Object object) {
		this.object = object;
	}
}
