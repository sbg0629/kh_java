package question03;

public class doWhileTest {
public static void main(String[] args) {
	int i =0;
	int sum =0;
	do {
		sum+=i;
		i+=2;
	}while (i<=99);
	System.out.println(sum);
	
	
//	do {
//		if(i>99) {
//			break;
//		}
//		sum+=i;
//		i+=2;
//	}while (true);
//	System.out.println(sum);
	
}
}

