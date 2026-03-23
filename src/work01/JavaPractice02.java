package work01;

public class JavaPractice02 {
	public static void main(String[]args) {
		String[]items = {"リンゴ", "オレンジ", "バナナ"};
		int[]prices = {120, 80, 150};
		int[]quantities = {2, 3, 1};
		
		int total = 0;
		
		System.out.println("---購入一覧---");
		
		for(int i = 0; i < items.length; i++) {
			int subtotal = prices[i] * quantities[i];
			total += subtotal;
			
			System.out.println(items[i] + "単価：" + prices[i] + "円 x " + quantities[i] + "個 =" + subtotal +"円");
		}
		
		System.out.println();
		System.out.println("合計金額：" + total + "円");
		
		if(total >= 500) {
			System.out.println("500円以上なので送料無料です");
		} else {
			System.out.println("500円未満なので送料がかかります");
		}
	}
}
