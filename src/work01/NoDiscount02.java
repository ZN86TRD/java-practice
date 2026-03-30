package work01;

class NoDiscount02 implements Discount {
	public int applyDiscount(int amount) {
		return amount;
	}
	
	public String getDiscountName() {
		return "割引なし";
	}
}
