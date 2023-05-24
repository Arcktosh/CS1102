import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {

	public MultipleChoiceQuestion(String query, // variable 1
			String a, // variable 2
			String b, // variable 3
			String c, // variable 4
			String d, // variable 5
			String e, // variable 6
			String answer // variable 7
	) {
		super(query);
		addChoice("A",a);
		addChoice("B",b);
		addChoice("C",c);
		addChoice("D",d);
		addChoice("E",e);
		initQuestionDialog();
		correctAnswer = answer.toUpperCase();
	}
	void addChoice(String name, String label) {
		JPanel choice = new JPanel(new BorderLayout());
		JButton button = new JButton(name);
		button.addActionListener(question);
		choice.add(button,BorderLayout.WEST);
		choice.add(new JLabel(label+"",JLabel.LEFT),BorderLayout.CENTER);
		question.add(choice);
	}
	
}