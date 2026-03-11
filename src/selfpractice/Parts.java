package selfpractice;

public class Parts {
	private String name;
	private int mathscore;
	private int engscore;
	
	public void setData(String n) {
		name = n;
	}
	
	public void setScore(int ms, int es) {
		mathscore = ms;
		engscore = es;
	}
	
	public void setData(String n, int ms, int es) {
		name = n;
		mathscore = ms;
		engscore = es;
	}
	
	public void display() {
		System.out.println(name + "さんの点数");
		System.out.println("数学：" + mathscore);
		System.out.println("英語：" + engscore);
	}
}
