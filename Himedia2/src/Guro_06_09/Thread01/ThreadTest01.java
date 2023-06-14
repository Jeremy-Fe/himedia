package Guro_06_09.Thread01;

public class ThreadTest01 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("thread");
			try { // 쓰레드는 try - catch 문 안에서만 사용할 수 있음.
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
		}
	}
}
