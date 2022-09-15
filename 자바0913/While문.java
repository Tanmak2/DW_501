package 자바0913;

public class While문 {

	public static void main(String[] args) {
//		int count = 0;
//		while(true) {
//			++count;
//			System.out.println("안녕?");
//			if(count == 20) {
//				break;
//			}
//		}
		int i = 0;
		int sum = 0;
		while(true) {
			i++;
			sum += i;
			if(i == 10) {
				System.out.println("합은 => "+sum);
				break;
			}
		}
		

	}

}
