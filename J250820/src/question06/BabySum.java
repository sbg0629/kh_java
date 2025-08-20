package question06;


public class BabySum {
public static void main(String[] args) {
	int[][] Baby = new int [120][5];
	int sum=0;
	
	//i = 120 (개월)
	for (int i = 0; i < Baby.length; i++) {
		//나라 5개 반복
		for (int j = 0; j < Baby[i].length; j++) {
			Baby[i][j] = (i+1)*100+j+1;
			sum += Baby[i][j]; 
		}
	}
	System.out.println("10년간 신생아수는"+sum);
}
}
