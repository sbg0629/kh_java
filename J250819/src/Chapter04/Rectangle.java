package Chapter04;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	private int getArea() {
		return width*height;
	}
public static void main(String[] args) {
//	new Rectangle(); //구성: 멤버3개 (멤버변수[필드]2개 +멤버 함수 [메소드]1개)
	//┌─new연산자로 Rectangle 객체를 생성하면서 , Rectangle 클래스 타읩의 참조변수 rect가 가리킴
	Rectangle rect = new Rectangle(); 
	Scanner scanner = new Scanner(System.in);
	System.out.println(">>");
	
	//객체의 멤버변수로 접근해서 스캐너에서 입력받은 정수가 저장
	rect.width = scanner.nextInt();
	//객체의 멤버변수로 접근해서 스캐너에서 입력받은 정수가 저장
	rect.height = scanner.nextInt();
	
//	double area = rect.getArea();
//	System.out.println("사각형의 면적은 "+area);
	System.out.println("사각형의 면적은 "+rect.getArea());
	
	scanner.close();
}
}
