package question06;

import java.util.Scanner;

public class printAlphabet {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("소문자 알파벳을 하나 입력하시오 >>");
	
	String a = scanner.next(); //a에 문자열 읽기
	char c = a.charAt(0); //a의 첫번쨰 문자를 c에 입력
	
	//a 의 아스키코드는 97
//	for (int i ='a'; i <=c; i++) {//abc 계속 반복(c를 입력)

	for (int i =c; i <= 'a'; i--) {//abc 계속 반복(c를 입력)
		for (int j = 'a'; j <= i; j++) { //c까지만 반복
			
//		for (int j = 'a'; j <= c; j++) { //c까지만 반복
			System.out.print(j);			
		}
	}
	
	
	
	
	for (int i = 0; i <=c-'a' ; i++) { //아스키값을 뺀 값
		for (char j = 'a'; j <= c-i ; j++) {
			System.out.print(j);
		}
		System.out.println();
		scanner.close();
	}
}
}
