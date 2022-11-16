package 자바0927;

class A{
	int value = 100;
	
	public void 확인하기() {
		int x = 50;
		System.out.println("A클래스에 있는 메소드 입니다.");
		System.out.println(value);
	}
}

class B{
	
	public void 확인하기() {
		System.out.println("B클래스에 있는 메소드 입니다.");
	}
}

class C{
	String str;
	int value;
	
	public static boolean 메소드만들기() {
		return true;
	}
	
	public static int 메소드만들기(double x, double y) {
		return 0;
	}
	
}

public class Home {

	public static void main(String[] args) {
		A a클래스 = new A();
		a클래스.확인하기();
		B b클래스 = new B();
		b클래스.확인하기();

	}

}
