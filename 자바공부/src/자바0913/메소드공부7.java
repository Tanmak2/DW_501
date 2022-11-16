package 자바0913;

public class 메소드공부7 {
	
	public static int 돈을인출하다(int 돈, String 계좌) {
		if(계좌.equals("카카오뱅크")) {
			return 돈;
		}
		if(계좌.equals("농협")) {
			return 돈;
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(돈을인출하다(3000, "카카오뱅크"));
		
	}

}
