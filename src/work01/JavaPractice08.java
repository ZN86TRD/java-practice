package work01;

import java.util.Scanner;

public class JavaPractice08 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		ProductManager03 manager = new ProductManager03();
		
		manager.addProduct(new Product03("p001", "ノートPC", 120000, 5));
		manager.addProduct(new Product03("p002", "マウス", 3000, 10));
		manager.addProduct(new Product03("p003", "キーボード", 8000, 2));
		
		boolean running = true;
		
		while(running) {
			System.out.println();
			System.out.println("---- 在庫管理メニュー ----");
			System.out.println("1. 商品一覧を表示");
			System.out.println("2. 商品コードで検索");
			System.out.println("3. 入庫する");
			System.out.println("4. 出庫する");
			System.out.println("5. 在庫少なめ商品を表示");
			System.out.println("0. 終了");
			System.out.println("番号を入力してください");
			
			int menu = scanner.nextInt();
			scanner.nextInt();
			
			if(menu == 1) {
				manager.showAllProducts();
			}else if(menu == 2) {
				
			}
		}
	}
}
