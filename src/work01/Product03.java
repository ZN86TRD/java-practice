package work01;

public class Product03 {
	private String code;
	private String name;
	private int price;
	private int stock;
	
	public Product03(String code, String name, int price, int stock) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getCode() {
		return code;
	}
	
	public int getStock() {
		return stock;
	}
	
	public boolean isLowStock() {
		return stock <= 3;
	}
	
	public void addStock(int quantity) {
		stock += quantity;
	}
	
	public boolean removeStock(int quantity) {
		if(quantity <= stock) {
			stock -= quantity;
			return true;
		}
		return false;
	}
	
	public void showInfo() {
		System.out.println("商品コード：" + code);
		System.out.println("商品名：" + name);
		System.out.println("価格：" + price + "円");
		System.out.println("在庫数：" + stock + "個");
	}
}
