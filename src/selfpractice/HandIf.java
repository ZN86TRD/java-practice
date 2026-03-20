package selfpractice;

public class HandIf {
	public static void main(String[]args) {
		String player = "グー";
		String enemy = "チョキ";
		
		if(player.equals(enemy)) {
			System.out.println("あいこ");
		} else if(
				(player.equals("グー") && enemy.equals("チョキ")) ||
				(player.equals("グー") && enemy.equals("チョキ")) ||
				(player.equals("グー") && enemy.equals("チョキ"))
			) {
				System.out.println("勝ち");
			} else {
				System.out.println("負け");
			}
	}
}
