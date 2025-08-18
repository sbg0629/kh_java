package chapter03_1;

/*
 * 배열 리턴(메소드 이용)
 * */
public class ReturnArray {
	//makeArray(): 메소드
	//int[]:반환(리턴) 타입(리턴을 안하면 오류)
	
	//리턴 타입에 배열크기를 표시하면 오류
//	static int[4] makeArray(){}
	
	static int[] makeArray(){
		int temp [] = new int[4];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i; //0 1 2 3
		}
		
		//리턴 타입과 반환되는 값의 타입이 일치해야함.
//		return 0;
		
//		리턴할 때 [] 을 추가하면 오류
//		return temp[];
		
		return temp;
	}
	
public static void main(String[] args) {
	int intArray[];
	//메소드 호출
 	intArray = makeArray();//temp 배열 받음//0 1 2 3
 	
 	for (int i = 0; i < intArray.length; i++) {
		System.out.print(intArray[i] + " ");
	}
}
}
