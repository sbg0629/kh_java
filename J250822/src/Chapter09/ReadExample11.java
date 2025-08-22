package Chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample11 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:\\temp\\text.txt"); //업캐스팅
		int readByte;
		char[] cbuf = new char[2]; 
		String date ="";
		
		while (true) {
//			readByte = reader.read();//한개의 문자 단위로 읽는다   ex 호미
			readByte = reader.read(cbuf);//두개의 문자 단위로 읽는다 ex 삽  
			if(readByte == -1) {
				break;
			}
//			System.out.print((char)readByte);
			//2개의 문자로 0번째 인덱스 부터 readData 만큼 읽어서 data문자열에 누적
//			data += new String(cbuf,0,readDate);
		}
		reader.close();
	
	}
}
