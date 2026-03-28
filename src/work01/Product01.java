package work01;

public class Product01 {
	private String code;
	private String name;
	private int price;
	private int stock;
	
	Product01(String code, String name, int price, int stock){
		this.code = code;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	void showInfo() {
		System.out.println("商品コード：" + code);
		System.out.println("商品名：" + name);
		System.out.println("価格：" + price);
		System.out.println("在庫数：" + stock);
		System.out.println("在庫状態：" + getStockStatus());
	}
	
	String getCode() {
		return code;
	}
	
	int getStock() {
		return stock;
	}
	
	boolean isOutOfStock() {
		return stock == 0;
	}
	
	String getStockStatus() {
		if(stock == 0) {
			return "在庫切れ";
		} else if (stock <= 3) {
			return "残りわずか";
		} else {
			return "在庫あり";
		}
	}
}
