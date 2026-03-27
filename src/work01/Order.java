package work01;

public class Order {
	private String customerName;
	private String itemName;
	private int quantity;
	private int unityPrice;
	
	Order(String customerName, String itemName, int quantity, int unityPrice){
		this.customerName = customerName;
		this.itemName = itemName;
		this.quantity = quantity;
		this.unityPrice = unityPrice;
	}
	
	void showInfo() {
		System.out.println("顧客名：" + customerName);
		System.out.println("商品名：" + itemName);
		System.out.println("数量：" + quantity);
		System.out.println("単価：" + unityPrice);
	}
	
	int getSubtotal() {
		return quantity * unityPrice;
	}
	
	String getShippingType() {
		if(getSubtotal() >= 10000) {
			return "送料無料";
		} else {
			return "送料あり";
		}
	}
}
