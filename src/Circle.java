
public class Circle {
	public static void main(String[]args) {
		int radius = 10;
		double pi = 3.141592;
		double area;
		
		area = radius * radius * pi;
		
		area = (int)(area * 100);
		area = area / 100;
		
		System.out.println("半径:" + radius);
		System.out.println("面積:" + area);
	}
}
