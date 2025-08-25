package Chapter12;

import java.util.Arrays;

public class ArraysTest2 {
	public static void main(String[] args) {
		int[] array = {9,4,5,6,2,1};
		printArray(array);
		System.out.println();
		Arrays.sort(array); //배열을 정렬 했다 / 오름차순정렬
		printArray(array);
		System.out.println();
		
		System.out.println(Arrays.binarySearch(array, 9)); //배열에서 key를 탐색한다 인덱스 반환 없으면 음수
		System.out.println(Arrays.binarySearch(array, -1)); 
		System.out.println(Arrays.binarySearch(array, 0)); 
		System.out.println(Arrays.binarySearch(array, 3)); 
		System.out.println(Arrays.binarySearch(array, 7)); 
		System.out.println(Arrays.binarySearch(array, 10)); 
		System.out.println(Arrays.binarySearch(array, 99)); //못 찾는 숫자는 랜덤으로 나옴. 음수로 
		Arrays.fill(array, 8); //배열을 8로 다 채움
		printArray(array);
	}
	//배열을 매개변수로 받아서 출력하는 메소드
	public static void printArray(int[] array) {
		System.out.print("[");
	for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+ " ");
	}	
	System.out.println("]");
	}
	
	
}
