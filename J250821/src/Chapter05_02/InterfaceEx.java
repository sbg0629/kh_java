package Chapter05_02;

//기본 폰 전화를 걸어서 100초 동안 응답없으면 타임아웃.
//전화거는 기능 받는 기능 화면에 폰 이라고 출력

interface PhoneInterface{
//	public static final int IIMEOUT =100;
	int TIMEOUT=100; //public static final 생략
//	public abstract void sendCall() ; //추상메소드
	void sendCall(); //public abstract 생략
	void receiveCall(); //public abstract 생략
	
	
//	default void printLogo();  //디폴트 (일반메소드)는 구현해야 함.
	default void printLogo() {
		System.out.println("** Phone **");
	}
	}

class SamsungPhone implements PhoneInterface{

	//추상 메소드 두개를 오버라이딩 한다.
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔슴돠");
	}
	//삼성폰의 고유의 기능.
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
public class InterfaceEx {
public static void main(String[] args) {
	SamsungPhone phone = new SamsungPhone();
	phone.printLogo();//인터페이스 상속받아서 사용
	phone.sendCall(); //추상메소드 구현해서 사용
	phone.receiveCall();//추상메소드 구현해서 사용
	phone.flash();//삼성폰의 고유의 기능.
}

}