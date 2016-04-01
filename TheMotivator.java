import java.util.ArrayList;

public class TheMotivator {
	public static void main(String[] args) {
		System.out.println("Start Process");
		TheMotivator tm = new TheMotivator();
		ArrayList<Integer> scores = tm.getScore();
		System.out.println("Get Scores :"+scores);
		
		for(Integer score: scores) {
			tm.printMessage(score);
		}		
		
		System.out.println("End Process");
	}
	public void printMessage(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 85)
			System.out.println("That's great");
		else if (score > 80)
			System.out.println("That's better ");
		else
			System.out.println("Well, what can I say?");
	}
	
	public ArrayList<Integer> getScore(){
		ArrayList<Integer> scores  = new ArrayList<Integer>();
		scores.add(60);
		scores.add(70);
		scores.add(80);
		scores.add(90);
		return scores;
	}	
}