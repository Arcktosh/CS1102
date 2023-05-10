import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {

	public MultipleChoiceQuestion(String query, // variable 1
			String a, // variable 2
			String b, // variable 3
			String c, // variable 4
			String d, // variable 5
			String e, // variable 6
			String answer // variable 7
	) {
		question = query + "\n";
		question += "A. " + a + "\n";
		question += "B. " + b + "\n";
		question += "C. " + c + "\n";
		question += "D. " + d + "\n";
		question += "E. " + e + "\n";
		correctAnswer = answer.toUpperCase();
	}

	String ask() {
		String answer = "";
		while (true) {
			answer = JOptionPane.showInputDialog(question); // Ask the question using "JOptionPane.showInputDialog".
			answer = answer.toUpperCase(); // Allow the user to provide a lower-case answer, and convert it to upper
											// case.
			if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")
					|| answer.equals("E")) {
				// Ask the user the question repeatedly until the user provides a valid answer:
				// "A", "B", "C", "D", or "E".
				return answer; // returns a valid answer in upper case
			} else {
				// Display a response for invalid answers
				JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
			}
		}
	}
}