package work01;

public class Employee {
	private String name;
	private String department;
	private int years;
	private int salary;
	
	Employee(String name, String department, int years, int salary){
		this.name = name;
		this.department = department;
		this.years = years;
		this.salary = salary;
	}
	
	void showInfo() {
		System.out.println("名前：" + name);
		System.out.println("部署：" + department);
		System.out.println("勤続年数：" + years);
		System.out.println("月給：" + salary);
	}
	
	String getName() {
		return name;
	}
	
	String getLevel() {
		if(years >= 5) {
			return "ベテラン";
		} else if(years >= 2) {
			return "中堅";
		} else {
			return "新人";
		}
	}
}