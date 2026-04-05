package work01;

public class ProductManager03 {
	private Product03[]products;
	private int count;
	
	public ProductManager03() {
		products = new Product03[20];
		count = 0;
	}
	
	public void addProduct(Product03 product) {
		if(count < products.length) {
			products[count] = product;
			count++;
		} else {
			System.out.println("これ以上商品を追加できません。");
		}
	}
	
	public void showAllProducts() {
		if(count == 0) {
			System.out.println("商品がありません");
			return;
		}
		
		System.out.println("---- 商品一覧 ----");
		
		for(int i = 0; i < count; i++) {
			products[i].showInfo();
			System.out.println("----------------------");
		}
	}
	
	public SearchResult03 findProductByCode(String code) {
		for(int i = 0; i < count; i++) {
			if(products[i].getCode().equals(code)) {
				return new SearchResult03(true, products[i]);
			}
		}
		return new SearchResult03(false, null);
	}
	
	public boolean stockIn(String code, int quantity) {
		SearchResult03 result = findProductByCode(code);
		
		if(result.isFound()) {
			result.getProduct().addStock(quantity);
			return true;
		}
		
		return false;
	}
	
	public int stockOut(String code, int quantity) {
		SearchResult03 result = findProductByCode(code);
		
		if(!result.isFound()) {
			return 0;
		}
		
		boolean success = result.getProduct().removeStock(quantity);
		
		if(success) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public void showLowStockProducts() {
		boolean found = false;
		
		System.out.println("---- 在庫少なめ商品 ----");
		
		for(int i = 0; i < count; i++) {
			if(products[i].isLowStock()) {
				products[i].showInfo();
				System.out.println("------------------------");
				found = true;
			}
		}
		
		if(!found) {
			System.out.println("在庫少なめの商品はありません");
		}
	}
}
