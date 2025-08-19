package Chapter04;

public class ArrayParameterEx {
	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++) {
			//공백을 쉼표로 바꾸는 메소드
			if (a[i] == ' ') {
				a[i] = ',';
			}
		}
	}
	static void replaceSpace2(char a[]) {
		for (int i = 0; i < a.length; i++) {
			//공백을 쉼표로 바꾸는 메소드
			if (a[i] == ',') {
				a[i] = ' ';
			}
		}
	}
	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			}
		System.out.println();
		}
	
	
	public static void main(String[] args) {
		char c [] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		replaceSpace2(c);
		printCharArray(c);
	}
}
