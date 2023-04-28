package Guro_04_28;

public class IfNested_p8 {

	public static void main(String[] args) {
		int score = 86;
		
		if (score >= 90) {
			System.out.print("A");
			if (score >= 95) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		} else {
			System.out.print("B");
			if (score >= 85) {
				System.out.print("+");
			} else {
				System.out.print("-");
			}
		}
	}

}
