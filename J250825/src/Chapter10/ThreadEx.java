package Chapter10;

class ThreadEx1 extends Thread{

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i: "+i);
		}
	}
}

class ThreadEx2 implements Runnable{

	public void run() {
	for (int j = 0; j < 5; j++) {
			System.out.println("j : "+j);
		}	
	}
}
public class ThreadEx {
	public static void main(String[] args) {
	//스레드 객체 생성
		ThreadEx1 t1 = new ThreadEx1();
		//1번방식
//		Thread t2 = new Thread(new ThreadEx2());
		//2번 방식
	    Runnable r = new ThreadEx2(); //업 캐스팅
	    Thread t2 =  new Thread(r);
	    
		t1.start();
		t2.start();
		
	}
}
