package selfpractice;

public class Student10 extends Person10{
	int stuNo;
	
	public Student10(String name, int stuNo) {
		super(name);
		this.stuNo = stuNo;
	}
	
	@Override
	public void work() {
		System.out.println( name + "は勉強します。");
	}
	
	public void study() {
		System.out.println(name + "は学籍番号" + stuNo + "で学習中です。");
	}
}

