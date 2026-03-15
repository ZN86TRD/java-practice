package selfpractice;

abstract class Person10 {
	String name;
	
	public Person10(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println("名前は" + name + "です。");
	}

	public abstract void work();
}