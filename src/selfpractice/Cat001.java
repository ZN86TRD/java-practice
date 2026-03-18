package selfpractice;

public class Cat001 extends Animal01 {
	public Cat001(String name) {
		super(name);
	}
	
	@Override
	public void sound() {
		System.out.println(name + "はニャーニャーと鳴きます");
	}
}
