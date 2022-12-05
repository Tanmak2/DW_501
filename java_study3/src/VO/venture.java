package VO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class venture implements Comparable{
	private int seq;
	private String company;
	private String addr;
	private String category;
	private String business_name;
	private String product;
	
	public venture() {}
	
	
	
	public venture(int seq, String company, String addr, String category, String business_name, String product) {
		this.seq = seq;
		this.company = company;
		this.addr = addr;
		this.category = category;
		this.business_name = business_name;
		this.product = product;
	}
	
	@Override
	public boolean equals(Object obj) {
		venture tmp = (venture)obj;
		if(this.addr.equals(tmp.addr))
			return true;
		return false;
	}
	
	@Override
	public int compareTo(Object o) {
		return this.company.compareTo(((venture)o).company);
	}
	
	@Override
	public int hashCode() {
		return this.addr.hashCode();
	}
	
	@Override
	public String toString() {
		return seq+" "+company+" "+addr+" "+category+" "+business_name+" "+product;
	}
	
}