package work01;

public class Order02 {
	private Product02 product;
	private Discount discount;
	
	Order02(Product02 product, Discount discount){
		this.product = product;
		this.discount = discount;
	}
	
	void showOrderSummary() {
		int subtotal = product.getSubtotal();
		int finalPrice = discount.applyDiscount(subtotal);
		
		System.out.println("商品名：" + product.getName());
		System.out.println("単価：" + product.getPrice());
		System.out.println("数量：" + product.getQuantity());
		System.out.println("小計：" + product.getSubtotal());
		System.out.println("割引方法：" + discount.getDiscountName());
		System.out.println("割引後金額：" + finalPrice + "円");
	}
}
