package chapter03;

public class AssihnmentIncDecOperator {
	public static void main(String[] args) {
		int a = 3, b = 3, c= 3;
//		a=a+3;
		a+=3;
		b*=3; //b=b*3
		c%=2; //몫1 나머지1 %는 나머지 /은 몫
		System.out.println("a = "+a+" b = "+b+" c = "+c);
		
		int d = 3;
//		d를 먼저 a에 넘기고 ,1을 증가
//		뒤에 붙은 ++/--는 후위연산자임
		a= d++; //a=3.b=4
		System.out.println("a = "+a+",d = "+d);
		
//		전위 연산자 : 먼저1을 증가하고 a에저장
		a= ++d; //a=5.b=5
		System.out.println("a = "+a+",d = "+d);
		
		a= d--; //a=5.b=4
		System.out.println("a = "+a+",d = "+d);
		
		a= --d; //a=3.b=3
		System.out.println("a = "+a+",d = "+d);
		
		
	}
}
