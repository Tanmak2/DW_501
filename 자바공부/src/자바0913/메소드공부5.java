package 자바0913;

public class 메소드공부5 {

	public static int getSum(int x, int y) {
		return x + y;
	}
	
	public static boolean isLogin(boolean isLogin) {
		return isLogin;
	}
	
	public static void main(String[] args) {
		int result = getSum(10,10);
		System.out.println(result);
		boolean isResult = isLogin(true);
		System.out.println(isResult);
	}

}
