package Chapter09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
public static void main(String[] args) throws Exception {
	OutputStream os = new FileOutputStream("C:/temp/test3.txt");	
	byte [] data = "ABC".getBytes();	
		os.write(data);
		
//	for (int i = 0; i < data.length; i++) {
//		os.write(data[i]);
//	}
	os.close();
}

}
