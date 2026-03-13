package selfpractice;

public class Children extends Parents {
	private int bd;
	
	public void setBd(int nd) {
		bd = nd;
	}
	
	public void displayName() {
		System.out.println(getName());
		System.out.println("オーバーライド");
	}
	
	public void displayBd() {
		System.out.println(bd);
	}
}
