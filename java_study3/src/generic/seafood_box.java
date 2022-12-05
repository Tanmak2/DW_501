package generic;

public class seafood_box<T extends seafood> {

	T box_item;
	
	public void setBox(T box) {
		this.box_item=box;
	}
	public void sellBox() {
		System.out.println("해산물 박스를 판매했습니다");
	}
}
