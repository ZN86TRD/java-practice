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

class Student10 extends Person10{
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

class Teacher extends Person10{
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


public class Main{
	public static void main(String[]args) {
		Person10 p1 = new Student10("佐藤", 101);
		Person10 p2 = new Teacher("田中", "数学");
		
		p1.introduce();
		p1.work();
		
		p2.introduce();
		p2.work();
		
		Person10[]people = new Person10[2];
		people[0] = p1;
		people[1] = p2;
		
		for(Person10 p : people) {
			p.work();
		}
		
		if(p1 instanceof Student10) {
			Student10 s = (Student10) p1;
			s.study();
		}
	}
}