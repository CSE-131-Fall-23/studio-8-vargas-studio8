package studio8;

import java.util.Scanner;

public class MultipleChoiceQuestion extends Question {
	
	private String[] options;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
		options = choices;
	}
	
	public String[] getChoices() {
		return options;
	}
	
	public void displayPrompt() {
		super.displayPrompt();
		for (int i = 0; i < options.length; i++) {
			System.out.println((i+1) + ": " + options[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		for (int i = 0; i < 5; i++) {
			multipleChoice.displayPrompt();
			System.out.println(multipleChoice.checkAnswer(in.next()) + " points total");
		}
	}

}
