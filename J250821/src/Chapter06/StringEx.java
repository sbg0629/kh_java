package Chapter06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");//heap 메모리 저장.
		String b = new String(",C++ ");
		
		//lenght 는 문자열 길이.
		System.out.println(a.length()); //C# 의 길이는 3 (스페이스 포함)
		//contains: 문자열 포함 여부
		System.out.println(a.contains("#")); //true
		System.out.println(a.contains("+"));
		
		a = a.concat(b); //concat():문자열 연결
		System.out.println(a); //c#, c++(새로운 문자열을 a가 가르킴)
		
		a = a.trim();// 양옆 앞뒤 공백을 제거
		System.out.println(a); //C#,C++ 
		
		a = a.replace("C#","Java"); //replace():문자열 대체
		System.out.println(a);//java,c++
		
		String s [] = a.split(","); //분리시킨다 , 기준으로
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열"+i+":"+s[i]);
		}
		
		a = a.substring(5);//substring():인덱스 값으로 시작하는 문자열
		System.out.println(a); 
		
		char c = a.charAt(2);
		System.out.println(c); //c++ 에 2번째 0,1,2 = +
	}
}
