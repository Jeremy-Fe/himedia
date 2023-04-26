package Guro_04_26;

public class VariavlesScopeExample {

	public static void main(String[] args) {
//		int v1 = 15;
//		if(v1 > 10) {
//			int v2 = v1 - 10;
//		}
//		
//		int v3 = v1 + v2 + 5;
//		:: int v2 가 if 내에서만 선언 돼서 if 문이 끝나고서 유효하지않음
//		:: 때문에 if 문 전에 int v2 = 0; 선언 
		int v1 = 15;
		int v2 = 0;
		if(v1 > 10) {
			v2 = v1 - 10;
		}
		
		int v3 = v1 + v2 + 5; // 노란색 줄은 경고. 실행에 문제는 없으나 문제가 있을 소지가 있음
	}

}
