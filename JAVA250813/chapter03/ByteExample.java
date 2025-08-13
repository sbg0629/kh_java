package chapter03;

public class ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;
		
		//기본 int 타입
//		범위 벗어나서 오류
//		byte 는 1바이트 범위는 -128~127 
//		byte var1 = -129;
		
		byte var2 = 0;
		
		byte var3 =127;
		
//		byte var4 =128; //범위 벗어나서 오류
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
}
