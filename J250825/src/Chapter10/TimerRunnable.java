package Chapter10;

//Runnable 인터페이스 상속 받아서 구현.
public class TimerRunnable implements Runnable{

	int n = 0;
	public void run() {
		while(true){
			System.out.println(n);
			n++;
			try {
				//TimerThread에 sleep은 threa에서 바로 상속 받아서 되지만 이건 아님.
				Thread.sleep(1000);//1초마다 실행
			}catch(Exception e) {
//				printStackTrace 메소드로 예외처리 기본 메시지 출력
				e.printStackTrace();
			}
		}
	}

}
