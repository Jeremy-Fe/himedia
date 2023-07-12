package ingang;

public class Pseudo_code {
	public static void main(String[] args) {
		int[] arr = new int[]{4, 5, 6, 10, 8, 9};
		
		int tmp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > tmp) {
				tmp = arr[i];
			}
		}
		System.out.println(tmp);
	}
}
