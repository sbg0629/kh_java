package Chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample14 {
public static void main(String[] args) throws Exception {

	Writer writer = new FileWriter("C:\\temp\\output14.txt"); //업캐스팅
	
// char [] date = "홍길동".toCharArray();
	String date ="안녕 자바 프로그램";
//	writer.write(date);
	writer.write(date,3,2);
	writer.close();
	}
	
}
