package question08;

import java.util.Scanner;


 class Add{
	public int a,b;
	
public void SetValue(int a, int b) {
	this.a = a;
	this.b = b;
}

public int calculate(){
	return a+b;
}
}

class Sub{
	public int a,b;
	
	public void SetValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate(){
		return a-b;
	}
}
	
	class Mul{
		public int a,b;
		
		public void SetValue(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		
		public int calculate(){
			return a*b;
		}
	}
		
		class Div{
			public int a,b;
			
			public void SetValue(int a, int b) {
				this.a = a;
				this.b = b;
			}
			
			
		
			public int calculate(){
				return a/b;
			}

public int callculate() {
	if (b==0) {
	System.out.println("0으로 못 나눔");
	return 0;
	}
	return a/b;
	}
	}

public class Calc {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("정수와 연산자를 입력하세요");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	char operator  = scanner.next().charAt(0);
	
	Add add = new Add();
	Sub sub = new Sub();
	Mul mul = new Mul();
	Div div = new Div();
	
	switch (operator) {
	case '+':
		add.SetValue(a, b);System.out.println(add.calculate());break;
	case '-':
		sub.SetValue(a, b);System.out.println(sub.calculate());break;
	case '*':
		mul.SetValue(a, b);System.out.println(mul.calculate());break;
	case '/':
		div.SetValue(a, b);System.out.println(div.calculate());break;

	default:
		break;
	}
	scanner.close();
}
}
