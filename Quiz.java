import javax.swing.JOptionPane;

public class Quiz {

  static int nQuestions = 0;
  static int nCorrect = 0;

  static String ask(String question) {
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

  static void check(String question, String correctAnswer) {
    nQuestions++;
    String answer = ask(question);
    if (answer.equals(correctAnswer)) {
      nCorrect++;
      JOptionPane.showMessageDialog(null, "Correct!");
    } else {
      JOptionPane.showMessageDialog(null, "Incorrect. \r\n" +
        "The correct answer is " + correctAnswer);
    }
  }

  public static void main(String[] args) {

    // Question 1
    String question = "What word is spelled incorrectly in every single dictionary?\n";
    question += "A. mississippi\n";
    question += "B. incorrectly\n";
    question += "C. jewelry\n";
    question += "D. acquiesce\n";
    question += "E. mischievous\n";
    // ask(question); // Call the "ask" method with your question String as the argument (actual parameter)
    check(question, "B");
    // Question 2    
    question = "What country has the highest life expectancy?\n";
    question += "A. United States of America\n";
    question += "B. Hong Kong\n";
    question += "C. United Kingdom\n";
    question += "D. Spain\n";
    question += "E. Tanzania\n";
    check(question, "B");
    // Question 3
    question = "What is the most common surname in the United States?\n";
    question += "A. Venus\n";
    question += "B. Anderson\n";
    question += "C. Smith\n";
    question += "D. Wilson\n";
    question += "E. Jones\n";
    check(question, "C");

    JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
  }
}