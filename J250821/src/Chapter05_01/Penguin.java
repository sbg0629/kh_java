package Chapter05_01;

//public class Penguin extends Bird {

//extends bird swim : 자바클래스 다중상속 불가
//public class Penguin extends Bird , Swim{

public class Penguin extends Bird implements Swim2 {
	
@Override
public void swim() {
	System.out.println("penguins swim");
}

	
}
