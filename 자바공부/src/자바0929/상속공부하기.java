package 자바0929;

class 부모님{
	
	public void 아들아공부해야지() {
		System.out.println("아들아 공부해라!");
	}
	
	public void 아들아밥먹자() {
		System.out.println("아들아 밥먹자");
	}
}

class 자식 extends 부모님{
	@Override
	public void 아들아공부해야지() {
		System.out.println("공부 하겠습니다!");
	}
	@Override
	public void 아들아밥먹자() {
		System.out.println("싫어요 게임할래요!");
	}
}



public class 상속공부하기 {

	public static void main(String[] args) {
		자식 x  = new 자식();
		x.아들아공부해야지();
		x.아들아밥먹자();
	}

}
