
public class ScoreArray {
	public static void main(String[]args) {
		int [] data = new int [4];
		
		data[0] = 90;
		data[1] = 80;
		data[2] = 100;
		data[3] = 90;
		
		System.out.println((data.length-3) + "人目は" + data[0] + "点");
		System.out.println((data.length-2) + "人目は" + data[1] + "点");
		System.out.println((data.length-1) + "人目は" + data[2] + "点");
		System.out.println((data.length) + "人目は" + data[3] + "点");
	}
}
