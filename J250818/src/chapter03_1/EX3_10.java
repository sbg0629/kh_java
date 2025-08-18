package chapter03_1;

/*
 * 4년 전체 평점(평균 학점)의 평균 구하기
 * 2차원 배열 이용해서 원소로 초기화
 * 1행1열부터 4행2열 까지 
 * lenght 필드 이용(행/열 크기)
 * */

public class EX3_10 {
	public static void main(String[] args) {
		double sum = 0;
		
		// 만점 기준은 4.5
		//2차원 배열 4행 2열
		double score[][] = {{3.3,3.4} //1행 1열,2열
							,{3.5,3.6} // 2행 1열 2열
							,{3.7,4.0}//3행 1열 2열
							,{4.1,4.2}};//4행 1열 2열
		
		for (int i = 0; i < score.length; i++) {
//			System.out.println(score.length); //4행
			
			for (int j = 0; j < score[i].length; j++) { //score[i].length 은 2 (열의크기)
				
//				double의 이중 배열 점수 합계 누적
				//반복이 끝나면 전체 8학기 의 총 평점의 합계가 누적됌.
				sum += score[i][j]; //배열 인덱스 0.0~3.1 까지 배열 원소를 sum에 누적
			}
			
		}
		int n = score.length; //4행의 크기
		int m = score[0].length; //2(열의 크기)
		
		System.out.println(n);
		System.out.println(m);
		
		System.out.println("4년 전체 평점 평균은 "+sum/(n*m)); //(n*m) 4행x2행 = 8(학기)
		
	}
}
