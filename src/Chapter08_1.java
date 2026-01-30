
public class Chapter08_1 {
	public static void main(String[]args) {
		int num = 14;
		if (num <= 5) {
			System.out.println("とても近いです");
		} else if (num > 5 && num < 10) {
			System.out.println("近いです");
		} else if (num > 10 && num < 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
	}
}
