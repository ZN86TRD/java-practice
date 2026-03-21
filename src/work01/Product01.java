package work01;

public class Product01 {
	private String name;
	private int price;
	private int stock;
	
	public Product01(String name, int price, int stock){
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public void display() {
		System.out.println("商品名：" + name + " | 価格：" + price + "円 | 在庫：" + stock + "個");
	}
	
	public boolean purchase(int quantity) {
		if (quantity <= 0) {
			System.out.println("購入数量は1以上を指定してください");
			return false;
		}
		if (stock >= quantity) {
			stock -= quantity;
			System.out.println(name + "を" + quantity + "個購入しました。残り在庫：" + stock + "個");
			return true;
		} else {
			System.out.println("在庫が不足しています。在庫数：" + stock + "個");
		}
	}
	
	public int getPriceWithTax() {
		return (int)(price * 1.1);
	}
}
