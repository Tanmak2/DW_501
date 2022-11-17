package house;

public class tv extends house_item{
	public int inch;
	
	public tv() {}
	public tv(String brand, int price, int inch) {
		super(brand,price);
		this.inch = inch;
	}
	
	public void buy() {
		System.out.println("TV를 구매하였습니다.");
	}
}
