package Chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample12 {
	public static void main(String[] args) throws Exception {
		//Reader : 문자 단위 입력을 위한 최상위 스트링 클래스
		//fileReader: 문자 단위 입력을 위한 하위 스트링 클래스
		Reader reader = new FileReader("C:\\temp\\text.txt"); //업캐스팅
		int readByte;
		
		
		while (true) {
			readByte = reader.read();//한개의 문자 단위로 읽는다  
			if(readByte == -1) {
				break;
			}
			System.out.print((char)readByte);
		}
		reader.close();
	
	}
}
