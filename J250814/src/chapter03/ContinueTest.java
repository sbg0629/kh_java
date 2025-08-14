package chapter03;

/*
 * 문자열에서 특정 문자를 찾는다.
 * 찾은 갯수를 출력
 * ex > life is cool (l >2)
 * */
public class ContinueTest {
	public static void main(String[] args) {
		int count = 0;
		String s = "no news is good news";
		
		//length()문자열 크기를 구하는 메소드
		//스페이스 포함 20자
		//문자열 크기 20번 반복
		for (int i = 0; i < s.length(); i++) {
//			charAt(0):첫번째 문자
//			System.out.println(s.charAt(0));
			System.out.println(s.charAt(i));
			
//			if (s.charAt(i)=='n') {
//				count++;
//			}
//			n이 아니면 스킵
			if (s.charAt(i) !='n') {
				continue;
			}
			count++;
		}
		System.out.println("문장에서 발견한 n값은 " + count);
	}

}
