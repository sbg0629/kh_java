package chapter03_1;

public class EX3_7 {
public static void main(String[] args) {
	int[] evens = {0,2,4,6,8,10,12,14,16,18};
	int[] primess = {2,3,5,7,11,13,17,19};
	
	//1. 짝수 배열을 메소드 매개변수로 호출
	//5. 합계를 받아서 evensum에 저장.
//	int evensum = sum(evens);
	int evensum = sum(evens);
//	int evensum = sum(evens[]); 오류난다.
	int primesum = sum(primess);
	//6.출력
	System.out.println("짝수 배열의 합: "+evensum);
	System.out.println("소수 배열의 합: "+primesum);
	
	
}

//sum메소드 arr파라미터
//합계를 구하는 메소드
//2.arr로 evens를 받음
public static int sum(int[] arr) {
//	public static int sum(int arr) { int [] 뺴면 오류 난다. 받는 매개변수는 배열 형식을 생략하면 오류
	int sum = 0;
	
	//매개 변수 배열의 크기 만큼 반복하면서 sum에 합계를 누적
	//3.arr배열원소를 가지고 반복(0,2,4,6,8,10,12,14,16,18)해서 합계 구함.
	for (int i = 0; i < arr.length; i++) {
		sum +=arr[i];
	}
	//4합계 반환.
	return sum;
}
}
