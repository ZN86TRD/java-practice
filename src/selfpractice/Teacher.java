package selfpractice;

public class Teacher extends Person10{
	String subject;
	
	public Teacher(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	
	@Override
	public void work() {
		System.out.println(name + "は" + subject + "を教えます");
	}
	
	public void teach() {
		System.out.println(name + "は" + subject + "の授業をしています");
	}
}
