package work01;

import javax.naming.directory.SearchResult;

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
	
	public SearchResult findProductByCode(String code) {
		//  4/2ここまで
	}
}
