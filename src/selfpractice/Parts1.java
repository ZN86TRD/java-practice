package selfpractice;

public class Parts1 {
	private String name;
	static int counter;
	
	Parts1(String n){
		name = n;
		counter++;
		System.out.println(name + "さんを追加しました。");
	}
	
	static void display() {
		System.out.println(counter + "人です");
	}
}
