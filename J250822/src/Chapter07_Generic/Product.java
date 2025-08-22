package Chapter07_Generic;

//T와 m이라는 두개의 제네릭 파라미터 타입
//T = Tv / m = String
public class Product<T,m> {
	//T = Tv / m = String
	private T kind; //3.new Tv()
	private m model; //3.model = "스마트 tv"
	
	//T = TV가 메소드의 리턴타입
	public T getKind() {
		return kind; 
	}
	//T=TV가 매개변수의 타입
	//1.Tv kind = new Tv()
	public void setKind(T kind) {
		this.kind = kind; //2.new Tv()
	}
	//m = String이 메소드의 리턴타입
	public m getModel() {
		return model;
	}
	//m = String이 매개변수 타입.
	//1.String model = "스마트 tv"
	public void setModel(m model) {
		this.model = model;//2.model = "스마트 tv"
		
	}
	
	
	
}
