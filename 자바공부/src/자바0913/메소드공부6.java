package 자바0913;

public class 메소드공부6 {

	public static int getSum(int x, int y) {
		return x+y;
	}
	
	public static void print(String word) {
		System.out.println(word);
	}
	
	public static void main(String[] args) {
		int result = getSum(30,70);
		//result의 예상되는 값은? 100
		print("gd");
	}

}
