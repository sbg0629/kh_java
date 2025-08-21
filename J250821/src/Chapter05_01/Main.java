package Chapter05_01;

public class Main {
	public static void main(String[] args) {
//		new Animal(); 추상 클래스 객체 생성 못함.
		Animal a; //참조 변수 선언은 된다.
		
//		new Bird(); 추상 클래스 객체 생성 못 함.
		
		Penguin p = new Penguin(); //객체 생성
		p.swim();//멤버 변수 5개(life , wing,walk,eat,swim)중 수행한다.
		
		Bird p2 = new Penguin(); //업캐스팅
//		p2.swim();//업 캐스팅은 슈퍼 클래스 멤버만 접근 가능(오류 발생)
		p2.walk();
		Penguin p3 = (Penguin) p2; //다운 캐스팅
		p3.swim();//다운 캐스팅은 모든 멤버 접근 가능
		
		Bird d = new Duck();//업 캐스팅
		d.eat();//업캐스팅은 슈퍼 클래스 의 멤버만 접근 가능
		Duck d2 = (Duck) d;//다운캐스팅
		d2.fly();//다운 캐스팅은 모든 멤버 접근 가능.
		
		//슈퍼 클래스를 참조 변수 선언(슈퍼클래스)
		Animal d3 = new Duck();//업 캐스팅은 슈퍼클래스의 멤버만 접근 가능
		int x = d3.life;
		System.out.println("x=>"+x);
		
//		new Swim2(); //인터페이스는 객체 생성 못 함.
		Swim2 s = new Penguin();//인터페이스를 참조 변수 선언.
		s.swim();
		
		//인터페이스가 인터페이스 배열 2개를 가르킴.
		Swim2[] s2 = new Swim2[2];
		s2[0] = new Penguin(); //s2[0] 참조변수
		s2[1] = new Penguin(); //s2[1] 참조변수
		s2[0].swim();//pengin swim
		s2[1].swim();//duck swim
		//컴파일 단계는 알 수 없고, 런타임 실행시 오류 발생.
//		s2[2] = new Pengin(); //인덱스 벗어남
	}
}
