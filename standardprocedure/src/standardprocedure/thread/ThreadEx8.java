package standardprocedure.thread;

// 쓰레드 우선순위
// main method 는 우선순위 5
// 그러므로 main method 에서 생성하는 쓰레드는 우선순위가 자동적으로 5
public class ThreadEx8 {
	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		
		th2.setPriority(7);;
		
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		th1.start();
		th2.start();
	}
}

class ThreadEx8_1 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 300; i ++) {
			System.out.print("-");
			for (int x = 0; x < 10000000; x++);	// 작업지연 for문
		}
	}
}

class ThreadEx8_2 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
			for (int x = 0; x < 10000000; x++);
		}
	}
}