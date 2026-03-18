package selfpractice;

public class Dog001 extends Animal01 {
	public Dog001(String name) {
		super(name);
	}
	
	@Override
	public void sound() {
		System.out.println(name + "はワンワンと鳴きます");
	}
}
