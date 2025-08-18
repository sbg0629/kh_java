package chapter03_1;

/*
 * main 메소드 매개변수 이용
 * */
public class Calc {
	//args : main 메소드 매개변수
public static void main(String[] args) {
	double sum = 0.0;
	
	//main 메소드 매개변수 크기만큼 반복
	for (int i = 0; i < args.length; i++) {

//		Double : wrapper클래스
//		parseDouble(): 실수로 변환하는 메소드
		sum += Double.parseDouble(args[i]);
	}
	System.out.println("합계: "+sum);
}
}
