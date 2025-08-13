package chapter03;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//┌─오류: 실수는 기본이 double
//		float var1 = 3.14;
		float var1 = 3.14f;
		float var2 = 3.14F;
		double var3 = 3.14;
		
		//값을 저장시 오류 발생하지 않고 , 출력시 잘림.
		float var4 =0.1234567890123456789F;
		//소수점 자리수는 double > float
		double var5 =0.1234567890123456789;
		
		double var6 = 3e6;
		float var7 = 3e6f; 
		float var8 = 2e-3f;
		double var9 = 2e-3f;
		
		System.out.println("var 1 ="+var1);
		System.out.println("var 2 ="+var2);
		System.out.println("var 3 ="+var3);
		System.out.println("var 4 = " + var4);
		System.out.println("var 5 = " + var5);
		System.out.println("var 6 = " + var6);
		System.out.println("var 7 = " + var7);
		System.out.println("var 8 = " + var8);
		System.out.println("var 9 = " + var9);
	}
}