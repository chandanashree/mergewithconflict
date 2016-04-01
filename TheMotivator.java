import java.util.ArrayList;

public class TheMotivator {
	public static void main(String[] args) {
		System.out.println("Start");
		TheMotivator tm = new TheMotivator();
		tm.printMessage(60);
		System.out.println("Get Scores :");
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
	
	public ArrayList<Integer> createScore(){
		ArrayList<Integer> scores  = new ArrayList<Integer>();
		scores.add(40);
		scores.add(50);
		scores.add(60);
		scores.add(80);
		System.out.println("print scores"+scores);
		return scores;
	}
	
}