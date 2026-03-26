package work01;

public class Product {
	private String code;
	private String name;
	private int stock;
	private int price;
	
	Product(String code, String name, int stock, int price){
		this.code = code;
		this.name = name;
		this.stock = stock;
		this.price = price;
	}
	
	void showInfo() {
		System.out.println("商品コード：" + code);
		System.out.println("商品名：" + name);
		System.out.println("在庫数：" + stock);
		System.out.println("価格：" + price);
	}
	
	String getName() {
		return name;
	}
	
	String getStockStatus() {
		if(stock == 0) {
			return "在庫切れ";
		} else if(stock <= 3) {
			return "残り僅か";
		} else {
			return "在庫あり";
		}
	}
}
