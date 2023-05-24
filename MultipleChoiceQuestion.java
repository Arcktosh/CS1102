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
		super(query); // constructor that calls its superclass constructor with its first parameter
		addChoice("A",a); // Calls "addChoice" using its next five parameters (a,b,c,d,e)
		addChoice("B",b);
		addChoice("C",c);
		addChoice("D",d);
		addChoice("E",e);
		initQuestionDialog(); // Calls "initQuestionDialog"
		correctAnswer = answer.toUpperCase(); // Initializes the instance variable "correctAnswer" with the last parameter "answer"
	}
	
	void addChoice(String name, String label) { // "addChoice" method
		JPanel choice = new JPanel(new BorderLayout()); // Creates a panel with a border layout
		JButton button = new JButton(name); // Creates a button using its first String parameter "name"
		button.addActionListener(question); // Adds the instance variable "question" as a listener for the button
		choice.add(button,BorderLayout.WEST); // Adds the button to the left side of the panel
		choice.add(new JLabel(label+"",JLabel.LEFT),BorderLayout.CENTER); // Adds a label to the center of the panel using its second String parameter "label"
		question.add(choice); // Adds the panel to the instance variable "question"
	}	
}