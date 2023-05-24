import javax.swing.JOptionPane;

public abstract class Question5 {
	static int nQuestions = 0; // class variables for the number of questions
	static int nCorrect = 0; // class variables for number of correct answers
	String question; // instance variables for the question String
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

	abstract String ask();

	public Question5() {	
		
	}
}
