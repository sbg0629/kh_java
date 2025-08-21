package Chapter05_02;

class OuterClass{//외부클래스
	private String secret = "Time is Money";
//	public String secret = "Time is Money";
	
	public OuterClass() {//2.댤걀 생성자 호출됨
//		new InnerClass();
		InnerClass obj = new InnerClass();  //3.노른자 객체 생성
		obj.method();
	}
	public class InnerClass{ //내부 (중첩 or inner)클래스
		public InnerClass() { //4.노른자의 생성자 호출
			System.out.println("내부 클래스의 생성자 입니다");
	}
		public void method(){
			System.out.println(secret);
		}
	}
		
}
public class OuterClassTest {
	public static void main(String[] args) {
//		new OuterClass();
//		new InnerClass(); //내부클래스 접근 불가
		OuterClass outer = new OuterClass(); //1.달걀 갹체 생성
//		outer.secret = ""; //접근 제한(private 이면)
	}

}
