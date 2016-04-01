
public class TheMotivator {
	public static void main(String[] args) {
		System.out.println("Start");
		TheMotivator tm = new TheMotivator();
		tm.printMessage(60);
	}
	public void printMessage(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
}