package Chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample12 {
public static void main(String[] args) throws Exception {

	Writer writer = new FileWriter("C:\\temp\\output13.txt"); //업캐스팅
	
	char [] date = "홍길동3".toCharArray();
//	writer.write(date);
	writer.write(date, 1, 2);//인덱스 1부터 2자를 읽어서 파일에 저장.
	writer.close();
	}
	
}