package work01;

public class JavaPractice07 {
	public static void main(String[]args) {
		Product02 p1 = new Product02("ノートPC", 120000, 1);
		Product02 p2 = new Product02("マウス", 3000, 2);
		
		Discount discount1 = new NoDiscount02();
		Discount discount2 = new RateDiscount02(10);
		
		Order02 order1 = new Order02(p1, discount1);
		Order02 order2 = new Order02(p2, discount2);
		
		System.out.println("--- 注文１ ---");
		order1.showOrderSummary();
		
		System.out.println();
		
		System.out.println("--- 注文2 ---");
		order2.showOrderSummary();
	}
}
