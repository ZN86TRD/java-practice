package selfpractice;

public class Parts {
	private String name;
	private int mathscore;
	private int engscore;
	
	
	Parts(String n) {
		name = n;
	}
	
	public void display() {
		System.out.println("名前：" + name);
	}
	
	public void display2() {
		System.out.println("名前：" + name + ", " + "英語：" + engscore + ", " + "数学：" + mathscore);
	}
	
	Parts(String n, int ms, int es) {
		name = n;
		mathscore = ms;
		engscore = es;
	}
}
