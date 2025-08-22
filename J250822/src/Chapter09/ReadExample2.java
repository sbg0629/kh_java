package Chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
	//throws exception 파일이 없을 경우 예외 처리
	public static void main(String[] args) throws Exception {
		//inputsteam 바이트 단위 입력을 위한 최상위 스트링 클래스
		//fileinputstream 바이트 단위 입력을 위한 하위 스트림 클래스
		InputStream is = new FileInputStream("C:\\temp\\text.txt"); //업캐스팅.
		int readByte;
		
		
		while ((readByte = is.read()) != -1) {
			System.out.print((char)readByte);
		}
		/*
		while (true) {
			readByte = is.read(); //byte 단위로 읽는다 (정수로 받음)
			//파일 끝에는 -1이 존재 (프로그래밍 언어 동일) : EOF(end of file).
			if(readByte == -1) {
				break;
			}
//			aaa:91
//			bb:98
//			c:99
//			13:엔터
//			10:첫번째 열
//			System.out.print(readByte);
			System.out.print((char)readByte);
		}
		*/
		
		
		is.close();
	}
}
