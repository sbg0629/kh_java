package Chapter05_02;

interface RemoteControl{
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
 public static void main(String[] args) {
	RemoteControl  rc = new RemoteControl() {
		
		@Override
		public void turnOn() {	
		System.out.println("Tv trunOn");			
		}
		
		@Override
		public void turnOff() {
			System.out.println("Tv trunOff");			
			
		}
	};
	rc.turnOn();
	rc.turnOff();
}
 
}
