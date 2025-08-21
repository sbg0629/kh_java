package Chapter05_01;

//추상 클래스에 추상메소드가 없어도 됨(객체 생성안됌)
abstract class Bird extends Animal {
	public int wing = 2;
	public void walk() {
		System.out.println("walk");
	}
	public void eat() {
		System.out.println("eat");
	}
}
