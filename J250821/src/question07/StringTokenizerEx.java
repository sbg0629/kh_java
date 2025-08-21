package question07;

//StringTokenizer 문자열 분리하기
//StringTokenizer 클래스는 문자열을 구분자로 이용하여 분리 할 때 사용 할 수 있다.
import java.util.StringTokenizer;

public class StringTokenizerEx {
public static void main(String[] args) {

	StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
	
	while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
	}
			
	
	
	
//	String s = "홍길동/장화/홍련/콩쥐/팥쥐";
//	String[] a = s.split("/");
//	
//	
//	for(String d:a) {
//		System.out.println(d);
//	}
}
}
