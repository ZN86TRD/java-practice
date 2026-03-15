package selfpractice;

public class PsnSample{
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
