package work01;

public class JavaStuPractice01 {
	public static void main(String[]args) {
		Student s1 = new Student();
		s1.name = "田中";
		s1.score = 78;
		s1.age = 20;
		
		
		Student s2 = new Student();
		s2.name = "高橋";
		s2.score = 92;
		s2.age = 19;
		
		
		Student s3 = new Student();
		s3.name = "齋藤";
		s3.score = 55;
		s3.age = 21;
		
		s1.ShowInfo();
		s1.Separator();
		
		s2.ShowInfo();
		s2.Separator();
		
		s3.ShowInfo();
		s3.Separator();
	}
}
