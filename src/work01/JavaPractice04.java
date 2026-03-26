package work01;

public class JavaPractice04 {
	public static void main(String[]args) {
		Product p1 = new Product("p001", "ノートPC", 2, 120000);
		Product p2 = new Product("p002", "マウス", 15, 3500);
		Product p3 = new Product("p003", "キーボード", 0, 5000);
		
		Product[]products = {p1,p2,p3};
		
		System.out.println("---在庫一覧---");
		
		for(int i = 0; i < products.length; i++) {
			products[i].showInfo();
			System.out.println("----------------------");
		}
		
		System.out.println();
		System.out.println("---在庫状態---");
		
		for(int i = 0; i < products.length; i++) {
			System.out.println(products[i].getName() + " : " +products[i].getStockStatus());
		}
	}
}
