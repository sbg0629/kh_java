package Chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:\\temp\\text.txt");
		int readByte;
		byte[] readBytes = new byte[3];
		String data = "";
	
		
		while (true) {
//			readByte = is.read();  //byte 단위로 읽는다(정수로 받음) ex>호미
			readByte = is.read(readBytes);//3byte 단위로 읽는다 (정수로 받음) ex>삽  
			
			if(readByte == -1) {
				break;
			}
	
			//문자 3개를 형변환하면서 오루 ex>aaa -> char
//			System.out.print((char)readByte);
			System.out.println("@#readbyte =>" +readByte);
			//readByte 를 0인덱스에서 readByte 길이만큼 읽는다.
			data += new String(readBytes,0,readByte);
		}
		System.out.println(data);
		
		
		is.close();
	}
}
