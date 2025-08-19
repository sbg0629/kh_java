package Chapter04;

public class Book {
	//4.멤버 저장
	String title; //멤버변수 (필드) // "어린왕자"
	String author;//멤버 변수 (필드) //"생뗴쥐베리"
	
	//2."어린왕자", "생텍쥐베리" 2개를 매개변수로 받는다
	public Book(String t,String a) {
		//3.매개변수를 멤버로 저장
		title= t;
		author = a;
		
	}
	public Book(String t) {
		title= t;
		author = "작자미상";
	}
	public static void main(String[] args) {
//		기본 생성자를 자동으로 만들어서 호출(컴파일러)
//		new Book(); //생성자가 하나라도 존재하면 자동으로 기본 생성자를 만들지 못해서 오류
		//1.매개변수 가지고 생성자 호출
		Book littlePrince = new Book("어린왕자", "생텍쥐베리");
		System.out.println(littlePrince.title+" "+littlePrince.author);		
		Book loveStory = new Book("춘향전");
		System.out.println(loveStory.title+" "+loveStory.author);
		
		
}
}
