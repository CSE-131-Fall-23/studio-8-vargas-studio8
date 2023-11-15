package studio8;

import java.util.Scanner;

public class Question {
	private String prompt;
	private String answer;
	private int points;
	private int pointValue;
	
	public Question(String prompt, String answer, int points) {
		this.prompt = prompt;
		this.answer = answer;
		this.pointValue = points;
		this.points = 0;
	}
	
	public void displayPrompt() {
		System.out.println(this.prompt + " (" + this.pointValue + " points)");
	}
	
	public int checkAnswer(String givenAnswer) {
		if(answer.equals(givenAnswer)) { //String comparison
			this.points += this.pointValue;
			System.out.println(this.pointValue + " points earned");
			return this.points;
		} else {
			System.out.println("0 points earned");
			return this.points;
		}
	}
	
	public int getPoints() {
		return this.pointValue;
	}
	
	public String getAnswer() {
		return this.answer;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Question q = new Question("What number studio is this?", "8", 2);
		for (int i = 0; i < 5; i++) {
			q.displayPrompt();
			System.out.println(q.checkAnswer(in.next()) + " points total");
		}
		in.close();
	}
}
