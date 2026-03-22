package work01;

public class JavaPractice01 {
	public static void main(String[]args) {
		String[]names = {"田中", "佐藤", "鈴木", "高橋"};
		int[]scores = {85, 62, 91, 48};
		
		int sum = 0;
		int max = scores[0];
		int min = scores[0];
		
		System.out.println("---成績一覧---");
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " : " + scores[i] + "点");
			
			sum += scores[i];
			
			if(scores[i] > max) {
				max = scores[i];
			}
			
			if(scores[i] < min) {
				min = scores[i];
			}
		}
		
		double average = (double)sum / scores.length;
		
		System.out.println();
		System.out.println("---集計結果---");
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + average);
		System.out.println("最高得点：" + max);
		System.out.println("最低点：" + min);
		
		System.out.println();
		System.out.println("---判定---");
		
		for(int i = 0; i < names.length; i++) {
			if(scores[i] >= 80) {
				System.out.println(names[i] + "さんは優秀です");
			} else if(scores[i] >= 60) {
				System.out.println(names[i] + "さんは合格です");
			} else {
				System.out.println(names[i] + "さんは再挑戦です");
			}
		}
	}
}
