package selfpractice;

public class StuSample5 {
	public static void main(String[]args) {
		Student5 stu1 = new Student5("松井", 1);
		Person5 psn = stu1;
		psn.display();
		// psn.chgStuNo(1001);
		
		/* 補足：instanceofキーワード
		   オブジェクトのクラスを特定する
		   対象オブジェクト instanceof クラス名 */
		
		if(psn instanceof Student5) {
			Student5 stu2 = (Student5)psn;
			stu2.chgStuNo(1001);
			stu2.display();
		}
	}
}
