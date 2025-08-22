package question08;

import java.util.Arrays;
import java.util.Iterator;

class ArrayUtil{
	public static int[] concat(int[] a, int[] b){
		int c[] = new int [a.length+b.length]; //이정도 길이의 c배열 생성
		for(int i=0;i<a.length;i++){ //배열 a 모든 요소를 c에 복사
			c[i]=a[i];
		}
		for(int i=a.length;i<b.length+a.length;i++){
			c[i]=b[i-a.length]; //c 뒷부분 복사.
		}
		return c;


		
	}
	
	public static void print(int[]a) {
//		System.out.println(Arrays.toString(a));
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.print("]");
	}
}

public class StaticEx {
	public static void main(String[] args) {
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100,77};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
