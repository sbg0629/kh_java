package Chapter12;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraysTest {
	public static void main(String[] args) {
		String[] a = {"a","b","c","d"};
		int[] b = {1,5,5,7,3,3,42,6,8,45323,4,63,2,1};
		System.out.println(a);//배열객체 출력
		System.out.println(Arrays.asList(a));//List로  변환 해서 나옴
		List<String> list = Arrays.asList(a);
		System.out.println("@# list.get(0) - > " + list.get(0));
		
		Arrays.sort(b, 4, 14);//인덱스 정렬(4~13) 인덱스 4부터 정렬을 시작.
		System.out.println(Arrays.toString(b));//String으로
		
		Arrays.sort(b);//오름차순 정렬
		System.out.println(Arrays.toString(b));//String으로
		
		Arrays.sort(a,Collections.reverseOrder());//문자열 배열을 내림차순
		System.out.println(Arrays.toString(a));//String으로 역 방향
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));//그냥 a,b,c,d 출력.
		
		Arrays.sort(a,2,4,Collections.reverseOrder()); //인덱스 2~4 바꿈
//		[a, b, d, c]
		System.out.println(Arrays.toString(a));//그냥 a,b,c,d 출력.
		
		String[] cc = {"11","12","13","23","53","223","145","53"};
		Arrays.sort(cc,Collections.reverseOrder());
		//[53, 53, 23, 223, 145, 13, 12, 11]  223보다 53이 더 먼저 나옴
		System.out.println(Arrays.toString(cc));
		
//		int[] c = Arrays.copyOf(b, b.length); //배열객체를 복사.
//		System.out.println(Arrays.toString(c))//배열을복사한다
		
		String [] d = Arrays.copyOf(a,3); //a를 크기가 3인 만큼 복사
		System.out.println(Arrays.toString(d));//배열을복사한다
		System.out.println(Arrays.toString(a));//배열을복사한다
		
	}
}
