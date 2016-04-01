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
	
		ArrayList<String> students = tm.getStudents();
		System.out.println("Student List :"+students);
		
		for(String student: students) {
			System.out.println("Student Name :"+student);
		}

		
	}
	public void printMessage(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 80)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	
	public void printScores(int score) {
		System.out.println("Score::"+score);
	}
	public ArrayList<String> getStudents(){
		ArrayList<String> students  = new ArrayList<String>();
		scores.add("test1");
		scores.add("test2");
		scores.add("test3");
		scores.add("test4");
		return scores;
	}
	public ArrayList<Integer> getScore(){
		ArrayList<Integer> scores  = new ArrayList<Integer>();
		System.out.println("Get Individual scores");
		scores.add(70);
		scores.add(60);
		scores.add(30);
		scores.add(90);
		return scores;
	}
	
}