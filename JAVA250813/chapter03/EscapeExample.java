package chapter03;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("번호 이름 직업");
//		print: 엔터 적용 안됨
		System.out.print("번호\t 이름\t 직업\n");// \t : tep키 \n : 엔터 (다음 행)
		
		System.out.print("번호 이름 직업");
		System.out.println(); //엔터 
		System.out.print("번호 이름 직업");
		System.out.println(); //엔터 
		
//		System.out.print("우리는 "개발자" 입니다."); //큰 따옴표 출력하려고 함 근데 오류 나옴
		System.out.print("우리는 \"개발자\" 입니다.");
		
		System.out.println("봄여름가을겨울");
		System.out.println("봄\\여름\\가을\\겨울"); // \\두개씩 넣으면 1개 출력 됌
	}
}
