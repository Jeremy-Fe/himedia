package Guro_06_09.Thread02;

public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { // 쓰레드는 try - catch 문 안에서만 사용할 수 있음.
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("똥");
			try { // 쓰레드는 try - catch 문 안에서만 사용할 수 있음.
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
