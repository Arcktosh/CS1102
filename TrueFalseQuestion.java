import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {

	@Override
	String ask() {
		String answer = "";
		while (true) {
			answer = JOptionPane.showInputDialog(question); // Ask the question using "JOptionPane.showInputDialog".
			answer = answer.toUpperCase(); // Allow the user to provide a lower-case answer, and convert it to upper
											// case.

			// valid answers are: "f", "false", "False", "FALSE", "n", "no", "No", "NO",
			// "t", "true", "T", "True", "TRUE", "y", "yes", "Y", "Yes", "YES".
			if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) {
				return answer = "FALSE"; // convert answer to FALSE
			} else if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
				return answer = "TRUE"; // convert answer to TRUE
			} else {
				// Display a response for invalid answers
				JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE");
			}
		}
	}

	public TrueFalseQuestion(String question, String answer) {
		super.question = "TRUE or FALSE: " + question;
		if (answer.equals("TRUE") || answer.equals("FALSE")) {
			super.correctAnswer = answer;
		} else {
			throw new IllegalArgumentException("Answer must be either TRUE or FALSE.");
		}
	}

}
