package work01;

import java.util.Scanner;

public class JavaPractice06 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		Product01[]products = new Product01[10];
		int count = 3;
		
		products[0] = new Product01("p001", "ノートPC", 120000, 5);
		products[1] = new Product01("p002", "マウス", 3000, 0);
		products[2] = new Product01("p003", "キーボード", 8000, 2);
		
		boolean running = true;
		
		while (running) {
			System.out.println();
			System.out.println("----在庫管理メニュー----");
			System.out.println("1.商品一覧");
			System.out.println("2.商品を追加");
			System.out.println("3.在庫切れ商品を表示");
			System.out.println("4.合計在庫数を表示");
			System.out.println("5.商品コードで検索");
			System.out.println("0.終了");
			System.out.println("メニュー番号を入力してください");
			
			int menu = scanner.nextInt();
			scanner.nextLine();
			
			if(menu == 1) {
				System.out.println();
				System.out.println("----商品一覧----");
				
				if(count == 0) {
					System.out.println("商品が登録されていません");
				} else {
					for (int i = 0; i < count; i++) {
						products[i].showInfo();
						System.out.println("---------------------");
					}
				}
			} else if (menu == 2) {
				if (count >= products.length) {
					System.out.println("これ以上商品を追加できません");
				} else {
					System.out.println("商品コードを入力してください");
					String code = scanner.nextLine();
					
					System.out.println("商品名を入力してください");
					String name = scanner.nextLine();
					
					System.out.println("価格を入力してください");
					int price = scanner.nextInt();
					
					System.out.println("在庫数を入力してください");
					int stock = scanner.nextInt();
					scanner.nextLine();
					
					products[count] = new Product01(code, name, price, stock);
					count++;
					
					System.out.println("商品を追加しました");
				}
			} else if(menu == 3) {
				System.out.println();
				System.out.println("----在庫切れ----");
				
				boolean found = false;
				
				for(int i = 0; i < count; i++) {
					if(products[i].isOutOfStock()) {
						products[i].showInfo();
						System.out.println("------------------------");
						found = true;
					}
				}
				
				if(!found) {
					System.out.println("在庫切れの商品はありません");
				}
			} else if(menu == 4) {
				int totalStock = 0;
				
				for (int i = 0; i < count; i++) {
					totalStock += products[i].getStock();
				}
				
				System.out.println("合計在庫数：" + totalStock + "個です");
			} else if(menu == 5) {
				System.out.println("検索する商品コードを入力してください："	);
				String searchCode = scanner.nextLine();
				
				Product01 foundProduct = null;
				
				for(int i = 0; i < count; i++) {
					if(products[i].getCode().equals(searchCode)) {
						foundProduct = products[i];
						break;
					}
				}
				
				if(foundProduct != null) {
					System.out.println("商品が見つかりました");
					foundProduct.showInfo();
				} else {
					System.out.println("該当する商品は見つかりませんでした"	);
				}
			} else if(menu == 0) {
				running = false;
				System.out.println("終了します");
			} else {
				System.out.println("正しい番号を入力してください");
			}
		}
	}
}
