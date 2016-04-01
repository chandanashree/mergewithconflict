import java.util.ArrayList;

public class TheMotivator {
	public static void main(String[] args) {
		System.out.println("Start");
		TheMotivator tm = new TheMotivator();
		ArrayList<Integer> scores = tm.getScore();
		System.out.println("Get Scores :"+scores);
		
		for(Integer score: scores) {
			tm.printMessage(score);
		}		
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
	
	public ArrayList<String> getScore(){
		ArrayList<String> scores  = new ArrayList<String>();
		System.out.println("Get Individual scores");
		scores.add(70);
		scores.add(60);
		scores.add(30);
		scores.add(90);
		return scores;
	}
	
}