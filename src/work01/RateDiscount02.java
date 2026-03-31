package work01;

public class RateDiscount02 implements Discount {
	private int rate;
	
	public RateDiscount02(int rate){
		this.rate = rate;
	}
	
	public int applyDiscount(int amount) {
		return amount - (amount * rate / 100);
	}
	
	public String getDiscountName() {
		return rate + "%割引";
	}
}
