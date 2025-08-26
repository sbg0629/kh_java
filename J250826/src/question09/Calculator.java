package question09;

import java.util.Scanner;

 abstract class Calc{
	protected int a,b;

	public void setValue(int a, int b) {this.a = a;this.b = b;}
	
	abstract public int calculate(); //상속으로 add, sub mul div 계산해줌 
}

class Add extends Calc{
	@Override
	public int calculate() {
		return a+b;
	}
}

class sub extends Calc{
	@Override
	public int calculate() {
		return a-b;
	}
}
class Mul extends Calc{@Override
public int calculate() {
	return a*b;
}}
class div extends Calc{@Override
public int calculate() {
	return a/b;
}}
	
	
public class Calculator {

public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("정수와 연산자를 입력하세요");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	char operator  = scanner.next().charAt(0);
	Calc exp = null;
//	Calc c;
	switch(operator){
//case '+':
//	c = new Add();
//	c.setValue(a, b);System.out.println(c.calculate());
//	break;
//case '-':
//	c = new sub();
//	c.setValue(a, b);System.out.println(c.calculate());
//	break;
//case '*':
//	c = new Mul();
//	c.setValue(a, b);System.out.println(c.calculate());
//	break;	
//case '/':
//	c = new div();
//	c.setValue(a, b);System.out.println(c.calculate());
//	break;
//default:
//	break;

case '+':
	exp = new Add();
	break;
case '-':
	exp = new sub();
	break;
case '*':
	exp = new Mul();
	break;
case '/':
	exp = new div();
	break;
default:
	System.out.println("잘못 된 계산입ㄴ디ㅏ");
	break;
	
}	//instanceof 는 객체 타입 비교
	exp.setValue(a, b);
	if (exp instanceof div && b  == 0){
				System.out.println("0으로 나눌 수 없다.");
	} else {
		System.out.println(exp.calculate());
	}
scanner.close();
}
}
