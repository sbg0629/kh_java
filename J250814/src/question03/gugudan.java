package question03;

public class gugudan {
	public static void main(String[] args) {
		int i;
		int j;
		
		for (i=1;i<=9;i++) {
			for(j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+'\t');
			}
//			단이 끝날 때 마다 엔터
			System.out.println();
		}
	}

}
