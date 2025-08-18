package chapter03_1;

/*
 * 문자열에서 r 알파벳 갯수를 구하기
 * 알파벳 대/소문자 상관없음
 * toCharArray()메소드 이용
 * */
public class EX3_8 {
public static void main(String[] args) {
	int count = 0;
	String str ="Programming is fun! Right?";
	
	//toCharArray(): 문자열에서 문자 하나씩 가지고 옴(p~?)
	char[] charrArr = str.toCharArray();
	
	//Programming is fun! Right? 문자열 크기 만큼 반복
	for (int i = 0; i < charrArr.length; i++) {
		if(charrArr[i]=='R'||charrArr[i] == 'r') {
			count ++;			
		}
	}
	System.out.println("=>R(r)의 갯수 : " + count);
}
}
