package Chapter06;

class Point{
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}	
}

public class ObjectPropertyEx {
	//매개변수로 객체를 받는다.
//	해당 메서드는 어떤 객체든 매개변수로 받을 수 있습니다.
	public static void print(Object obj) { //object obj = new point(2,3) > 업 캐스팅
		//실행중인 클래스
		System.out.println(obj.getClass());//class Chapter06.Point
		System.out.println(obj.getClass().getName());//Chapter06.Point
		System.out.println(obj.hashCode());//2055281021 객체의 서명(10진스 해시코드)
		System.out.println(obj.toString()); //Chapter06.Point@7a81197d 패키지.클래스@16진수 해시코드
		System.out.println(obj); //Chapter06.Point@7a81197d 문자열로 변환해서 출력.
		
	}
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		print(p); 
	}
}
