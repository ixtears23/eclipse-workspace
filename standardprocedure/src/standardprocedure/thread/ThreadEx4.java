package standardprocedure.thread;


// 싱글쓰레드로 2개의 작업 수행
public class ThreadEx4 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println("소요시간1:" + (System.currentTimeMillis() - startTime));
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println("소요시간2:" + (System.currentTimeMillis() - startTime));
	}
}
