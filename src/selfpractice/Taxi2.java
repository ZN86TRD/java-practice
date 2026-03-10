package selfpractice;

public class Taxi2 extends Car2 {
	private int price;
	
	public Taxi2(int no) {
		this(no, 0);
	}
	
	public Taxi2(int no, int price) {
		super(no);
		this.price = price;
	}
	
	public void start() {
		this.price = 420;
	}
	
	public void run() {
		this.price += 80;
	}
	
	public void display() {
		super.display();
		System.out.println("料金は" + this.price + "円です");
	}
}
