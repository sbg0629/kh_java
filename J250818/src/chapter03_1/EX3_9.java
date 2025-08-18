package chapter03_1;

/*
 * 구구단 배열로 생성
 * 값을 넣어 본다 ex>2*7=14,9*4=36
 * */
public class EX3_9 {
public static void main(String[] args) {
	
	//정수 타입의 2차원 배열 선언(1차원은 열로 구성,1차원이 2개이상 가지고 행으로 구성)	
//	int[][] gugudan;
//	int[][] gugudan = new int[9][9]; //0~8까지
	int[][] gugudan = new int[10][10]; //0~9까지
	
//	1*1=1 ~ 9*9=81
	for (int i = 1; i <= 9; i++) {//행 기 준
		for (int j = 1; j <= 9; j++) {//열 기 준
			//비어 있는 원소 : [0][0],[0][1],[1][0]
			gugudan[i][j] = i*j;			
		}
	}
	System.out.println("2 X 7 = "+gugudan[2][7]);
	System.out.println("9 X 4 = "+gugudan[9][4]);
}
}
