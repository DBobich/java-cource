public class SpinWords {

	public static void main(String[] args) {
		String p1 = "scisors";
		String p2 = "scisors";
		System.out.println(rps(p1, p2));
	}

	public static String rps(String p1, String p2) {
		String str;
		if ((p1 == "scisors" & p2 == "scisors") || (p1 == "paper" & p2 == "paper") || (p1 == "rock" & p2 == "rock")) {
			str = "Draw";
		} else if ((p1 == "scisors" & p2 == "rock") || (p1 == "paper" & p2 == "scissors")
				|| (p1 == "rock" & p2 == "paper")) {
			str = "win 2";
		} else
			str = "win 1";
		return str;
	}
}