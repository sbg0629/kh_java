package question05;

/*
 * 배열 리턴2(메소드 이용)
 * 일차원 배열 생성(정수1~10)
 * 배열 리턴 > 배열원소 +100 > 출력
 * */
public class RetrunArray2 {

	public static int[] makeArray(){ //배열을 리턴하는 makeArray() 작성.
		int temp [] = new int[10];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i+1; 
		}
		

		
		return temp;
	}
	
public static void main(String[] args) {
	int intArray[];
	//메소드 호출
 	intArray = makeArray();//temp 배열 받음//0 1 2 3 4 5 6 7 8 9 10
 	
 	for (int i = 0 ; i < intArray.length; i++) {
		System.out.print(intArray[i]+100 + " ");
	}
}
}
