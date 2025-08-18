package question04_1;

public class print2DArray {
public static void main(String[] args) {
	int n [][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
	
	
	 for(int i=0; i<n.length; i++) { //5행
		
         for(int j=0; j<n[i].length; j++) {
        	 //n[i][j] = 2차원 배열출력
             System.out.print(n[i][j] + " ");
          }
          System.out.println();
	}
}
}
