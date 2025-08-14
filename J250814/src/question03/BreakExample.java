package question03;

import java.util.Scanner;

public class BreakExample {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
	
	while (true) { //무한루프 실행
		System.out.println("exit을 입력하면 종료합니다.");		
		String a = scanner.next();
	if(a.equals("exit")) {
		System.out.println("종료합니다.");				
		break; //반목문 종료
	}
}
}
}