import java.util.ArrayList;

public class TheMotivator {
	public static void main(String[] args) {
		System.out.println("Start");
		TheMotivator tm = new TheMotivator();
		ArrayList<Integer> scores = tm.createScore();
		System.out.println("Get Scores :"+scores);
		
		for(Integer score: scores) {
			System.out.println("Score::"+score);
			tm.printMessage(score);
		}		
		System.out.println("End");
	}
	public void printMessage(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 80)
			System.out.println("That's good ");
		else if (score > 70)
			System.out.println("That's better ");
		else
			System.out.println("Well, what can I say?");
	}
	
	public void printScores(int score) {
		System.out.println("Score::"+score);
	}
	public ArrayList<String> createScore(){
		ArrayList<String> scores  = new ArrayList<String>();
		System.out.println("Get Individual scores");
		scores.add(70);
		scores.add(60);
		scores.add(30);
		scores.add(90);
		return scores;
	}
	
}