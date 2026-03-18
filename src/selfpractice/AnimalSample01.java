package selfpractice;

public class AnimalSample01 {
	public static void main(String[]args) {
		Animal01 a1 = new Dog001("ポチ");
		Animal01 a2 = new Cat001("タマ");
		
		a1.introduce();
		a1.sound();
		
		a2.introduce();
		a2.sound();
	}
}
