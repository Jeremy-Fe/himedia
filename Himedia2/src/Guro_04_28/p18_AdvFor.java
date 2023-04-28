package Guro_04_28;

public class p18_AdvFor {

	public static void main(String[] args) {
		// 향상 반복문 : 처음부터 끝까지 전부 순회를 돌 때 사용
		int[] score = {9, 7, 8, 6, 8};
		
		int sum = 0;
		for(int s : score) {
			sum += s;
		}
		
		System.out.println("sum : " + sum);
		
		
//		----------------------------------------------------------------
		int[] scores = {9, 7, 8, 6, 8};
		
		int sum2 = 0;
		//    초기값 : i = 1,  i+=2 2씩 증가(짝수만 더하기)
		for(int i = 0; i < scores.length; i++) {
			sum2 += scores[i];
		}
		
		System.out.println("sum2 : " + sum2);
	}

}
