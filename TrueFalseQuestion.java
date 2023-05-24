import javax.swing.*;

public class TrueFalseQuestion extends Question { // "TrueFalseQuestion" class 

	void addButton(JPanel buttons, String label) { // "addButton" method
		JButton button = new JButton(label); // Constructs a button using its String parameter
		button.addActionListener(question); // Adds the instance variable "question" as a listener for that button
		buttons.add(button); // Adds the button to its "JPanel" parameter
	}

	public TrueFalseQuestion(String question, String answer) {
		super(question); // constructor that calls its superclass constructor with its first String parameter
		JPanel buttons = new JPanel();
		addButton(buttons,"TRUE"); // calls "addButton" to add "TRUE"
		addButton(buttons,"FALSE"); // calls "addButton" to add "FALSE" 
		this.question.add(buttons); // Adds the panel to the instance variable "question"
		initQuestionDialog(); // Calls "initQuestionDialog"
		
		if (answer.equals("TRUE") || answer.equals("FALSE")) {
			super.correctAnswer = answer; // Initializes the instance variable "correctAnswer" with its second String parameter "answer"
		} else {
			throw new IllegalArgumentException("Answer must be either TRUE or FALSE.");
		}
	}

}
