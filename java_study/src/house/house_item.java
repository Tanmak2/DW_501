package house;

public abstract class house_item {
	public String brand;
	public int price;
	
	public house_item() {}
	
	public house_item(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "브랜드 : "+brand+"\t금액 : "+price;
	}
	public abstract void buy();
}


/*
 * 추상클래스는 추상메서드를 가질수 있다.
 * 추상클래스는 객체 생성이 불가능하다.
 * 추상메서드는 상속이 된다.(자식클래스가 추상메서드를 가지게 된다.)
 * 
 * 추상화를 하는이유
 * 클래스의 중복성을 제거
 * 가독성 증가
 * 에러율 감소
 * 유지보수 시간 단축
 */
