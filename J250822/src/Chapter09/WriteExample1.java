package Chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {
public static void main(String[] args) throws Exception {
//	FileOutputStream: 바이트 단위 출력을 위한 하위 스트림 클래스
//	FileOutputStream : test.txt를 가지고 객체 생성한다.
	
//	OutputStream os = new FileOutputStream("C:\\temp\\test.txt"); //업캐스팅.
	//백슬래시 대신 슬래시 사용 가눙.
	OutputStream os = new FileOutputStream("C:/temp/test2.txt"); //업캐스팅. 
	//바이트 단위로 문자열을 읽는다.
	byte [] data = "ABC".getBytes();
	
	for (int i = 0; i < data.length; i++) {
		//FileOutputStream 객체에 바이트 배열 원소를 넣는다.
		os.write(data[i]);
	}
	os.close();
}

}
