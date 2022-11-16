package 자바0929;

class C{
	
	C(String 이름, int 나이){
		
	}
	C(){
		
	}
	
	
	private String 이름;
	private int 나이;
	
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	
	public String get이름() {
		return 이름;
	}
	
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	
	public int get나이() {
		return 나이;
	}
	
}


class B{
	B(int x, int y){
		System.out.println("B class : Hello World");
	}
}


class A{
	public void A클래스에있는메소드() {
		System.out.println("Hello World");
	}
	public int 메소드생성(int x) {
		return x;
	}
}


public class 클래스복습 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		aa aa = new aa();
		System.out.println(aa.solution(array, commands));
		A a = new A();
		a.A클래스에있는메소드();
		a.메소드생성(0);
		
		B b = new B(10, 20);
		
		C c = new C();
		c.set이름("홍길동");
		c.set나이(25);
		
		System.out.println("이름 : "+c.get이름());
		System.out.println("나이 : "+c.get나이());
		
		for (int i = 0; i<9; i++) {
			System.out.println(i);
			
		}
	}

}
