package Guro_05_02;

public class p46_Array {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87, 91, 79, 85 };
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("sum : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.printf("%s%.2f","avg : ", avg);
	}
}
