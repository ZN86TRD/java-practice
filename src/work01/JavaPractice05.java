package work01;

public class JavaPractice05 {
	public static void main(String[]args) {
		Order o1 = new Order("田中", "ノートPC", 1, 120000);
		Order o2 = new Order("佐藤", "マウス", 2, 3000);
		Order o3 = new Order("鈴木", "キーボード", 1, 8000);
		
		Order[]orders = {o1, o2, o3};
		
		int totalSales = 0;
		
		System.out.println("---注文一覧---");
		
		for(int i = 0; i < orders.length; i++) {
			orders[i].showInfo();
			System.out.println("小計：" + orders[i].getSubtotal() + "円");
			System.out.println("送料区分：" + orders[i].getShippingType());
			System.out.println("----------------------");
			
			totalSales += orders[i].getSubtotal();
			
		}
		
		System.out.println();
		System.out.println("総売上高：" + totalSales + "円");
	}
}
