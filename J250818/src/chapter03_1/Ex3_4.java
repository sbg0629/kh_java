package chapter03_1;

public class Ex3_4 {
 public static void main(String[] args) {
	//String[] names; //String타입의 names배열 선언.
	 
	 //배열 원소(값)이 4개면 인덱스 3까지.
//	String[] names = {"Sam","Kate","John","Jenny"}; //배열 선언 생성 초기화 까지 한번에
	 
	//String 배열 객체 생성
	 //String 기본값: null
	 String[] names = new String[4]; 
	
//	 String[] names; //배열 선언
//	 names = new String[4]; //배열 생성
//	 names[0] ="aaa"; //인덱스 0 자리에 aaa
	 
	 //기본값: 0.0
//	 double[] names;
//	 names = new double[4];

	 //배열 선언,생성
	 //int 기본값:  0
//	 int[] names = new int[4];
	 
	 System.out.println(names[0]);
	 System.out.println(names[1]);
	 System.out.println(names[2]);
	 System.out.println(names[3]);
}
}
