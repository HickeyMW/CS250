import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorPanel extends JPanel {

	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField inputField;
	
	public CalculatorPanel() {
		inputLabel = new JLabel("Enter Number:");
	    outputLabel = new JLabel("Result: ");
	    resultLabel = new JLabel("---");
	    
	    inputField = new JTextField(5);
	    inputField.addActionListener(new CalcListener());
	    
	    add(inputLabel);
	    add(inputField);
	    add(outputLabel);
	    add(resultLabel);
	    
	    setPreferredSize(new Dimension(300, 75));
	}
	
    
    private class CalcListener implements ActionListener
    {
       //--------------------------------------------------------------
       //  Performs the conversion when the enter key is pressed in
       //  the text field.
       //--------------------------------------------------------------
       public void actionPerformed(ActionEvent event)
       {
          double input, output;

          String text = inputField.getText(); // get info from textfield

          input = Double.parseDouble (text); //convert to number
          
          output = Math.log(input);
          resultLabel.setText(Double.toString(output)); //display result of calculation
       }
    }
}
