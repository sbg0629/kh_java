package Chapter05_01;

public class Duck extends Bird implements Swim2,Fly {

	@Override
	public void swim() {
	System.out.println("Ducks swim.");
		
	}

	@Override
	public void fly() {
		System.out.println("ducks fly");
		
	}

}
