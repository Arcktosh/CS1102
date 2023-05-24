import javax.swing.*;

public class TrueFalseQuestion extends Question {

	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}

	public TrueFalseQuestion(String question, String answer) {
		super(question);
		JPanel buttons = new JPanel();
		addButton(buttons,"TRUE");
		addButton(buttons,"FALSE");
		this.question.add(buttons);
		initQuestionDialog();
		
		if (answer.equals("TRUE") || answer.equals("FALSE")) {
			super.correctAnswer = answer;
		} else {
			throw new IllegalArgumentException("Answer must be either TRUE or FALSE.");
		}
	}

}
