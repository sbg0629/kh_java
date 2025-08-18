package chapter03_1;

public class EX3_6 {
public static void main(String[] args) {
	int [] arr = {88,76,92,68,55,48,82};
	int sum = 0;
	
//	System.out.println(arr.length); //7
	
//	arr.length : 7이니깐 index6까지 반복(7번)
	for (int i = 0; i < arr.length; i++) {
//		arr[0]~arr[6]반복
		sum += arr[i];//배열 원소 값
		
		
	}
	System.out.println("총합은 ? "+sum);
}
}
