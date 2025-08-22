package Chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample13 {
public static void main(String[] args) throws Exception {

	Writer writer = new FileWriter("C:\\temp\\output12.txt"); //업캐스팅
	
	char [] date = "홍길동".toCharArray();
	writer.write(date);
	
//	for (int i = 0; i < date.length; i++) {
//			writer.write(date[i]);
//		}
	writer.close();
	}
	
}
