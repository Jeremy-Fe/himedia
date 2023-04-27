package Guro_04_27;

public class OperratorExample_2 {
	public static void main(String[] args) {
		int x = 5;
		int y = 8;
		int result1 = ++x + 10; // ++x : 연산을 시작하기 전에 1 을 더해준다
		int result2 = y++ + 10; // y++ : 연산이 끝난 후 1 을 더해준다.
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(result1);
		System.out.println(result2);
	}

}
