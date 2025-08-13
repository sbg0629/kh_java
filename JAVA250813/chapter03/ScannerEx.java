package chapter03;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		//객체 생성 
//		system.in:매개변수(인자,파라미터,argument)
//		new Scanner(System.in);
		//scaaner은 참조(reference)변수
		//Scanner 객체를 생성하고 , Scanner 클래스 타입의 scanner참조 변수가 가리킴
		
		// 안닫으면 ->resource leak:'scanner'is never close
		Scanner scanner = new Scanner(System.in);
		//scanner : 객체
		//next(): 문자열 입력 받는 메소드
		String name = scanner.next();
		System.out.println("이름은:" + name);
		//입력 받을 때 스페이스나 탭으로 구분해서 토근단위로 받음
		String city = scanner.next();
		System.out.println("도시는:" + city);
		
		int age = scanner.nextInt();
		System.out.println("나이는:" + age +" 살");
		
		double weight = scanner.nextDouble();
		System.out.println("체중는:" + weight+" kg");
		
		boolean single = scanner.nextBoolean();
		System.out.println("독신여부: "+single + "입니다");
				
//		close():scanner 객체 종료 자원 반납
		//=> 메모리를 더 사용할 수 있고, 안하면 garbage collector가 자동으로 정리함
		scanner.close(); 
	}
}
