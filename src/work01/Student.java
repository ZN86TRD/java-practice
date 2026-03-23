package work01;

public class Student {
	String name;
	int score;
	int age;
	
	public void ShowInfo() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
		System.out.println("点数：" + score);
		
		if(score >= 80) {
			System.out.println("評価：優");
		} else if (score >= 60) {
			System.out.println("評価：良");
		} else {
			System.out.println("評価：再挑戦");
		}
		
		if(age >= 20) {
			System.out.println("区分：成人");
		} else {
			System.out.println("区分：未成年");
		}
	}
	
	public void Separator() {
		System.out.println("-------------------");
	}
}

//test