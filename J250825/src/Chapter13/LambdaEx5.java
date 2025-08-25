package Chapter13;

@FunctionalInterface//추상 메소드 1개만 쓰도록 체크
interface MyFunction5<T>{//제네릭 타입 T를 가진 함수형 인터페이스
	void print(T x);
	//	int calc2(int x , int y); //추상메소드 2개 사용시 컴파일 오ㅠ 
	
	
}
public class LambdaEx5 {
public static void main(String[] args) {
	MyFunction5 <String> f1 = (x) -> System.out.println(x);
	f1.print("ABC");
	
	MyFunction5 <Integer> f2 = (x) -> System.out.println(x);
	f2.print(Integer.valueOf(100));//Integer 객체를 람다식에 넘겨준다
	f2.print(200);//auto boxing
}
}
