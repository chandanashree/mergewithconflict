import java.util.ArrayList;

public class TheMotivator {
	public static void main(String[] args) {
		System.out.println("Start Process");
		TheMotivator tm = new TheMotivator();
		ArrayList<Integer> scores = tm.createScore();
		System.out.println("Get Scores :"+scores);
		
		for(Integer score: scores) {
			System.out.println("Score::"+score);
			tm.printMessage(score);
		}		
	
		ArrayList<String> students = tm.getStudents();
		System.out.println("Student List :"+students);
		
		for(String student: students) {
			System.out.println("Student Name :"+student);
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
			System.out.println("That's good ");
		else if (score > 70)
			System.out.println("That's better ");
		else
			System.out.println("Well, what can I say?");
	}
	
	public void printScores(int score) {
		System.out.println("Score::"+score);
	}

	public ArrayList<String> getStudents(){
		ArrayList<String> students  = new ArrayList<String>();
		students.add("test1");
		students.add("test2");
		students.add("test3");
		students.add("test4");
		return students;
	}
	public ArrayList<Integer> createScore(){
		ArrayList<Integer> scores  = new ArrayList<Integer>();
		System.out.println("Get Individual scores");
		scores.add(70);
		scores.add(60);
		scores.add(70);
		scores.add(80);
		scores.add(90);
		return scores;
	}	
}