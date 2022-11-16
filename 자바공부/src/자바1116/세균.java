package 자바1116;

public class 세균 {
	public static void main(String[] args) {
		/*
		 * 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 새균의 마리수 n과 경과한 t가 매개변수로 주어질 때 t시간 후
		 * 새균의 수를 구하는 로직을 구현하시오.
		 */
		int n = 2;
		int t = 10;
		final int doubleN = 2;
		
		for(int i=0; i<t; i++) {
			n *= doubleN;
		}
		
		System.out.println(t+"시간 후 세균 수 : "+n);
	}
}
