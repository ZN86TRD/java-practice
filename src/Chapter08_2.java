
public class Chapter08_2 {
	public static void main(String [] args) {
		String day = "SunDay";
		
		switch(day) {
		case "SunDay":
			System.out.println("日曜日です");
			break;
		case "MonDay":
			System.out.println("月曜日です");
			break;
		case "TuesDay":
			System.out.println("火曜日です");
			break;
		case "WednseDay":
			System.out.println("水曜日です");
			break;
		case "ThursDay":
			System.out.println("木曜日です");
			break;
		case "FriDay":
			System.out.println("金曜日です");
			break;
		case "SaturDay":
			System.out.println("土曜日です");
			break;
		default:
			System.out.println("曜日ではありません");
		}
	}
}
