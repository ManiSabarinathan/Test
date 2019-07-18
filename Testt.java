public class Testt {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Java");
		String s2 = "Love";
		s1.append(s2);
		System.out.println("==> " + s1);
		System.out.println("=====> " + s1.substring(4));
		System.out.println("s1 after substring :: " + s1);
		int foundAt = s1.indexOf(s2);
		System.out.println(foundAt);
		int cardVal=6;
		switch (cardVal) {
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("Hit");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Double");
			break;
		case 15:
		case 16:
			System.out.println("Surrender");
			break;
		default:
			System.out.println("Stand");
		}

	}
}
