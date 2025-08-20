package Chapter05;

/*
 * instanceof 연산자 사용(상속)
 * */
class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}
public class InstanceOfEx {
	static void print(Person p) {
		if (p instanceof Person) {//p객체가 person 클래스 타입인지
			System.out.println("Person"); //참이면 출력.
		}
		if (p instanceof Researcher) {//p객체가 person 클래스 타입인지
			System.out.println("Researcher"); //참이면 출력.
		}
		if (p instanceof Student) {//p객체가 person 클래스 타입인지
			System.out.println("Student"); //참이면 출력.
		}
		if (p instanceof Professor) {//p객체가 person 클래스 타입인지
			System.out.println("Professor"); //참이면 출력.
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student()->\t");print(new Student());//Person Student
		System.out.print("new Researcher()->\t");print(new Researcher());//Person Researcher
		System.out.print("new Professor()->\t");print(new Professor());//Person Researcher Professor
	}
}
