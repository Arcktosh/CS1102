import java.awt.*;
import javax.swing.*;

public abstract class Question {
	static int nQuestions = 0; // class variables for the number of questions
	static int nCorrect = 0; // class variables for number of correct answers
	QuestionDialog question; // instance variables for the question String
	String correctAnswer; // instance variables for the correct-answer String

	void check() {
		nQuestions++;
		String answer = ask();
		if (answer.equals(correctAnswer)) {
			nCorrect++;
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect. \r\n" + "The correct answer is " + correctAnswer);
		}
	}

	static void showResults() { // display the number of questions and the number of correct answers using the
								// class member variables
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
	}

	String ask() {
		question.setVisible(true);
		return question.answer;
	}
	
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel(" "+question+" ",JLabel.CENTER));
	}
	
	void initQuestionDialog() {
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}

	public Question() {	
		
	}
}
