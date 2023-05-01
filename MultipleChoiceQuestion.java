import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {

	static int nQuestions = 0;
	static int nCorrect = 0; 
	
	String question;
	String correctAnswer; 
	
	public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		question = query+"\n";
		question += "A. "+a+"\n";
		question += "B. "+b+"\n"; 
		question += "C. "+c+"\n"; 
		question += "D. "+d+"\n"; 
		question += "E. "+e+"\n"; 
		correctAnswer = answer.toUpperCase();
		
	}
	
	String ask() {
	    String answer = "";
	    while (true) {
	      answer = JOptionPane.showInputDialog(question); // Ask the question using "JOptionPane.showInputDialog".
	      answer = answer.toUpperCase(); // Allow the user to provide a lower-case answer, and convert it to upper case.

	      if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
	        // Ask the user the question repeatedly until the user provides a valid answer: "A", "B", "C", "D", or "E".
	        return answer;
	      } else {
	        // Display a response for invalid answers
	        JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
	      }
	    }
	  }
	
	void check() {
	    nQuestions++;
	    String answer = ask();
	    if (answer.equals(correctAnswer)) {
	      nCorrect++;
	      JOptionPane.showMessageDialog(null, "Correct!");
	    } else {
	      JOptionPane.showMessageDialog(null, "Incorrect. \r\n" +
	        "The correct answer is " + correctAnswer);
	    }
	  }

	void showResults() {
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
	}
	
	public static void main(String[] args) {
		
	}

}
