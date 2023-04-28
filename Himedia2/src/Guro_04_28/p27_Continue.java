package Guro_04_28;

public class p27_Continue {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			if (i % 2 != 0) 
				continue;
			// i % 2 != 0 : i 를 2 로 나누었을 때 나머지 값이 0이 아닐 경우 continue 한다. 
			// 결국 짝수는 계속 continue 할 것 이고 홀수는 break 먹을 것이다.
			
			System.out.println(i);
		}
	}

}
