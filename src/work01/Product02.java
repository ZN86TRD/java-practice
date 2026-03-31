package work01;

public class Product02 {
	private String name;
	private int price;
	private int quantity;
	
	Product02(String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	int getQuantity() {
		return quantity;
	}
	
	int getSubtotal() {
		return price * quantity;
	}
}