package chapter02;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour =3 ;
		int minute = 5;
		System.out.println(hour+minute); //정수
		//+할때 문자열이 하나라도 있으면 문자열이 된다.
		System.out.println(hour+"시간"+minute+"분"); //문자열
		
		int total = hour*60+minute;
//		System.out.println(total); 
		System.out.println("총"+total+"분"); 
		
	}

}
