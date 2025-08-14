package chapter03;

/*
 * do while문
 * a~z알파벳 소문자 출력 
 * */
public class DoWhileSample {
public static void main(String[] args) {
	char c= 'a';
	
	do {
		//a~z까지 출력
		System.out.println(c);
		
//		┌─ 유니코드 변환해서 1증가한 유니코드가 정수에 더해서 c로 받으면 오류
//		c+1 = 문자 + 정수 = 정수
//		ㄴ유니코드 변환해서 1증가한 유니코드가 문자로 변환해서 변수 c에저장
		
		c=(char)(c+1); 
//		c+=1; 가능
//		c++;
	} while (c<='z');
}
}
