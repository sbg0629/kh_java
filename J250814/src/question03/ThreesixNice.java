package question03;

import java.util.Scanner;

public class ThreesixNice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("10~99정수를 입력하세요>>");
		int num = scanner.nextInt();
		
		int a = num/10; //십의 자리 수
		int b = num%10; //1의 자리 수
		int cnt=0;

		if(num <10) { //num이 1의 자리인 경우
			if (b%3 == 0 )
				cnt++;
		}

		else {  //num이 10의 자리인 경우
			if(a %3 == 0) { //10의 자리수가 3으로 나뉠 때
				cnt++;
			}
			if(b%3 == 0 && b!=0 ){//1의 자리수가 3으로 나뉠 때 뒷자리가 0이면 카운트 되기 떄문에 0 != 넣어줘야함
				cnt++;
			}
		}

		switch(cnt) {
		case 0:
			System.out.println("박수 없음");
			break;
		case 1:
			System.out.println("박수짝");
			break;
		case 2:
			System.out.println("박수짝짝");
			break;	
			
		
	}
		scanner.close();
}
}