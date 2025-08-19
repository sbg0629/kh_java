package Chapter04;

public class Book2 {
	String title; //멤버변수 (필드) // "어린왕자"
	String author;//멤버 변수 (필드) //"생뗴쥐베리"
	
	public Book2(String title,String a) {
		System.out.println("생성자 1 호출됨");
		this.title= title;
		author = a;
		
	}
	public Book2(String title) {
		this(title,"작자미상"); //오류가 뜨면 첫 문장으로 와야함. 
		System.out.println("생성자 2 호출됨");
//		title= t;
//		author = "작자미상";
	}
	
	public Book2() {
		this("", "");
		System.out.println("생성자 3 호출됨");
	}

	void show() {
		System.out.println(title + " " + author);
	}
	public static void main(String[] args) {
//		Book2 littlePrince = new Book2("어린왕자", "생텍쥐베리");
//		System.out.println(littlePrince.title+" "+littlePrince.author);		
		
//		Book2 loveStory = new Book2("춘향전");
		Book2 emptyBook = new Book2();
//		System.out.println(loveStory.title+" "+loveStory.author);
		
//		littlePrince.show();
		emptyBook.show();
		
		
}
}
