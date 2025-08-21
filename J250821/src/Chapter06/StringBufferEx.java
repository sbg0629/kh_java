package Chapter06;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb); //This
		
		//문자열 추가
		sb.append(" is pencil"); //append : 문자열을 연결 (추가 되면서 수정됨)
		System.out.println(sb); //This is pencil

		//문자열 삽입
		sb.insert(7, " my"); //7번째 인덱스에 my를 넣겠다.
		System.out.println(sb); //This is my pencil
		
		//replace 문자열 대체
		sb.replace(8, 10, "your"); //my 대신 your 로 변경
		System.out.println(sb);  //This is your pencil
		
		//delete():문자열 삭제
		sb.delete(8, 13);//This is pencil
		System.out.println(sb);  
		
		//setLength():문자열 길이 수정.
		sb.setLength(4); //This
		System.out.println(sb);  
		
	}
}
