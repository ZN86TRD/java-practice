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
				System.out.print("検索する商品コードを入力してください：");
				String code = scanner.nextLine();
				
				SearchResult03 result = manager.findProductByCode(code);
				
				if(result.isFound()) {
					System.out.println("商品が見つかりました");
					result.getProduct().showInfo();
				} else {
					System.out.println("商品が見つかりませんでした");
				}
			} else if(menu == 3) {
				System.out.println("入庫する商品コードを入力してください：");
				String code = scanner.nextLine();
				
				System.out.println("入庫数を入力してください：");
				int quantity = scanner.nextInt();
				scanner.nextLine();
				
				boolean success = manager.stockIn(code, quantity);
				
				if(success) {
					System.out.println("入庫しました。");
				} else {
					System.out.println("商品コードが見つかりませんでした。");
				}
			} else if(menu == 4) {
				System.out.println("出庫する商品コードを入力してください：");
				String code = scanner.nextLine();
				
				System.out.println("出庫数を入力してください：");
				int quantity = scanner.nextInt();
				scanner.nextLine();
				
				int result = manager.stockOut(code, quantity);
				
				if(result == 1) {
					System.out.println("出庫しました。");
				} else if(result == -1) {
					System.out.println("在庫が足りません。");
				} else {
					System.out.println("商品コードが見つかりませんでした。");
				}
			} else if(menu == 5) {
				manager.showLowStockProducts();
			} else if(menu == 0) {
				running = false;
				System.out.println("終了します。");
			}else {
				System.out.println("正しい番号を入力してください。");
			}
		}
		scanner.close();
	}
}
