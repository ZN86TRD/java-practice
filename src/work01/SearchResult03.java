package work01;

public class SearchResult03 {
	private boolean found;
	private Product03 product;
	
	public SearchResult03(boolean found, Product03 product) {
		this.found = found;
		this.product = product;
	}
	
	public boolean isFound() {
		return found;
	}
	
	public Product03 getProduct() {
		return product;
	}
}
