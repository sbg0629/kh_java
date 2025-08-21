package Chapter05_02;


interface PhoneInterface2{
	int TIMEOUT=100; //public static final 생략
	void sendCall(); //public abstract 생략
	void receiveCall(); //public abstract 생략
	
	
	default void printLogo() {
		System.out.println("** Phone **");
	}
	}

//pcs(ex>016,018,019)
//인터페이스 간의 상속 > extends사용
//interface MobilePhoneInterface interface PhoneInterface2{ //오류
//문자를 보내고 받은 기능을 추상메소드로 선언.
interface MobilePhoneInterface extends PhoneInterface2{
	
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface{
	void play();
	void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}	
}
//아이폰 : 계산기능 문자 전송 음악기능 상속받음.
class SmartPhone extends PDA implements MobilePhoneInterface,MP3Interface{

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔슴돠");
		
	}

	@Override
	public void play() {
		System.out.println("음악 연주합니다");
		
	}

	@Override
	public void stop() {
		System.out.println("음악 중단 합니다");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자 갑니다");		
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어요");
	}
	public void schedult() {
		System.out.println("일정 관리합니다.");
	}
}


public class InterfaceEx2 {
public static void main(String[] args) {
	SmartPhone phone = new SmartPhone();
	phone.printLogo();//인터페이스 상속받아서 사용
	phone.sendCall(); //추상메소드 구현해서 사용
	phone.receiveCall();//추상메소드 구현해서 사용
	phone.play();//삼성폰의 고유의 기능.
	System.out.println(phone.calculate(3, 5));
//	phone.stop();
	phone.sendSMS();
	phone.receiveSMS();
	phone.schedult();
}

}