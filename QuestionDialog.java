import java.awt.event.*;
import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener { // QuestionDialog with a class that extends "JDialog" and implements "ActionListener"
	String answer;
	
	public void actionPerformed(ActionEvent e) { // "actionPerformed" method  and then calls the inherited "dispose" method
		answer = e.getActionCommand(); // uses "ActionEvent" parameter to set the instance variable "answer"
		dispose(); // Calls the inherited "dispose" method
	}
}
