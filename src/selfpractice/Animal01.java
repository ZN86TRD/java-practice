package selfpractice;

abstract class Animal01 {
	String name;
	
	public Animal01(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println("名前：" + name + "です");
	}
	
	public abstract void sound();
}
