package selfpractice;

public class PartsSample {
	public static void main(String[]args) {

	Parts p1 = new Parts();
	p1.setData("松井");
	p1.setScore(80, 90);
	p1.display();
	
	Parts p2 = new Parts();
	p2.setData("松井", 100, 90);
	p2.display();
	}
}
