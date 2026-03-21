package work01;

public class JavaPractice01 {
	
	public static void printSeparator() {
		System.out.println("--------------------------------------------------");
	}
	
	public static void greet(String name) {
		System.out.println("こんにちは、" + name + "さん！");
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int max(int a, int b, int c) {
		if(a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else {
			return c;
		}
	}
	
	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
	
	public static int sumArray(int[] arr) {
		int total = 0;
		for (int num : arr) {
			total += num;
		}
		return total;
	}
	
	public static int maxInArray(int[]arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void printReverse(int[]arr) {
		System.out.println("逆順：");
		for ( int i = arr.length -1; i >= 0; i--) {
			System.out.println(arr[1]);
			if (i > 0) System.out.println(", ");
		}
		System.out.println();
	}
	
	public static void main(String[]args) {
		int age = 25;
		double height = 170.5;
		boolean isStudent = true;
		char grade = 'A';
		String name = "田中太郎";
		
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
		System.out.println("身長：" + height);
		System.out.println("学生：" + isStudent);
		System.out.println("成績：" + grade);
		
		printSeparator();
		
		int x = 10;
		int y = 3;
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x % y = " + (x % y));
		
		printSeparator();
		
		int intVal = 7;
		double doubleVal = (double) intVal / 2;
		
		System.out.println("7 / 2 (int)   = " + (intVal / 2));
		System.out.println("7 / 2 (double) = " + doubleVal);
		
		printSeparator();
		
		System.out.println("===== セクション2: 制御構文 =====");
		
		int score = 75;
		System.out.println("スコア：" + score);
		
		if (score >= 90) {
			System.out.println("評価：Ｓ");
		} else if (score >= 70) {
			System.out.println("評価：A");
		} else if (score >= 50) {
			System.out.println("評価：B");
		} else {
			System.out.println("評価：C");
		}
		
		printSeparator();
		
		int dayNum = 3;
		String dayName;
		
		switch (dayNum) {
		case 1:
			dayName = "月曜日";
			break;
		case 2:
			dayName = "火曜日";
			break;
		case 3:
			dayName = "水曜日";
			break;
		case 4:
			dayName = "木曜日";
			break;
		case 5:
			dayName = "金曜日";
			break;
		case 6:
			dayName = "土曜日";
			break;
		case 7:
			dayName = "日曜日";
			break;
		}
		
		System.out.println("曜日番号" + dayNum + "は" + dayName);
	
	printSeparator();
	
	}
	
	System.out.println("1から5の合計");
	int sum = 0;
	for (int i = 1; i <= 5; i++) {
		sum += i;
		System.out.println("i = " + i + "→ 合計=" + sum);
	}
	
	printSeparator();
	
	System.out.println("3の倍数(30まで)：");
	int num = 3;
	while(num <= 30) {
		System.out.print(num + " ");
		num += 3;
	}
	System.out.println();
	
	printSeparator();
	
	System.out.println("1～10のうち偶数のみ(6でbreak)：");
	for (int i = 1; i <= 10; i++) {
		if(i == 6) {
			System.out.println(" " + i + " でbreak!");
			break;
		}
		if( i % 2 != 0) {
			continue;
		}
		System.out.println(" " + i);
	
	printSeparator();
	}
	
	System.out.println("===== セクション3: メソッド =====");
	
	greet("山田");
	System.out.println("3 + 7 =" + add(3,7));
	System.out.pritnln("最大値(4, 9, 2) = " + max(4, 9, 2));
	System.out.println("5の階乗 = " + factorial(5));
	
	printSeparator();
	
	System.out.pritnln("===== セクション4: 配列 =====");
	
	int[]numbers = {10, 30, 50, 20, 40};
	System.out.print("配列：");
	for(int n: numbers) {
		System.out.print(n + " ");
	}
	System.out.println();
	
	System.out.println("合計：" + sumArray(numbers));
	System.out.println("最大値：" + maxInArray);
	printReverse();
	
	int[][]matrix = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
	};
	
	System.out.println("3x3 行列：");
	for(int row = 0; row < matrix.length; row++) {
		System.out.println(" ");
		for(int col = 0; col < matrix[row].length; col++) {
			System.out.println("%3d", matrix[row][row]);
		}
		System.out.println();
	}
	
	printSeparator();
	
	System.out.pritnln("===== セクション5: クラスとオブジェクト =====");
	
	Product01 apple = new Product01("りんご", 150, 10);
	Product01 laptop = new Product01("ノートPC", 89800, 3);
	
	apple.display();
	laptop.display();
	
	printSeparator();
	
	apple.purchase(3);
	apple.purchase(9);
	laptop.purchase(2);
	
	printSeparator();
	
	System.out.println(apple.name + "税込価格" + apple.getPriceWithTax() + "円");
	System.out.println(laptop.name + "税込価格" + laptop.getPriceWithTax() + "円");
	
	printSeparator();
	
}
