package work01;

public class JavaPractice03 {
	public static void main(String[]args) {
		Employee e1 = new Employee("田中", "営業部", 3, 280000);
		Employee e2 = new Employee("高橋", "営業部", 1, 250000);
		Employee e3 = new Employee("山田", "営業部", 5, 300000);
		
		Employee[]employee = {e1, e2, e3};
		
		System.out.println("---社員一覧---");
		
		for(int i = 0; i < employee.length; i++) {
			employee[i].showInfo();
			System.out.println("-----------------");
		}
		
		System.out.println();
		System.out.println("---判定結果---");
		
		for(int i = 0; i < employee.length; i++) {
			System.out.println(employee[i].getName() + " : " + employee[i].getLevel());
		}
	}
}
