import java.awt.*;
import javax.swing.*;

public abstract class Question {
	static int nQuestions = 0; // class variables for the number of questions
	static int nCorrect = 0; // class variables for number of correct answers
	QuestionDialog question; // instance variables for the question QuestionDialog
	String correctAnswer; // instance variables for the correct-answer String
	
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1)); // Gives a single-column grid layout
		this.question.add(new JLabel(" "+question+" ",JLabel.CENTER)); // Add a text label using the constructor's String parameter
	}
	
	String ask() { // ask method
		question.setVisible(true); // Makes the instance variable "question" visible 
		return question.answer; // Returns the value "question.answer"
	}
	
	void initQuestionDialog() { // initQuestionDialog method
		this.question.setModal(true); // Makes instance variable "question" modal
		this.question.pack(); // Sets its size with "pack"
		this.question.setLocationRelativeTo(null); // positions it in the center of the screen
	}
	
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
}
