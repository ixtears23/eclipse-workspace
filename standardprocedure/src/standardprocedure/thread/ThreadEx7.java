package standardprocedure.thread;

import javax.swing.JOptionPane;

// 두개의 쓰레드로 두개의 작업 실행
public class ThreadEx7 {
	public static void main(String[] args) {
		ThreadEx7_1 th1 = new ThreadEx7_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
	
	static class ThreadEx7_1 extends Thread {
		
		@Override
		public void run() {
			for(int i = 10; i > 0; i--) {
				System.out.println(i);
				try {
					sleep(1000);
				} catch (Exception e) {
					
				}
			}
		}
	}

}
