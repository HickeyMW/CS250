/*
 * The listener
 * 
 */
package Lab3A;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Listener implements ActionListener{
	
	MyGui myGui;

	public void setGUi(MyGui gui) {
		
		myGui = gui;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		JButton clicked = (JButton)arg0.getSource();
		
		String text = clicked.getText();
		
		if (text == "Natural Log") {
			System.out.println("calculating natural log");
			int input = Integer.parseInt(myGui.input.getText());
			double outputvalue = Math.log(input);
			String outputString = String.format("The natural log of %d = %.2f", input, outputvalue);
			myGui.output.setText(outputString);
		} else if (text == "Base 2 Log") {
			int input = Integer.parseInt(myGui.input.getText());
			double outputvalue = Math.log(input)/Math.log(2);
			String outputString = String.format("The base 2 log of %d = %.2f", input, outputvalue);
			myGui.output.setText(outputString);
		} else if (text == "Base 10 Log") {
			int input = Integer.parseInt(myGui.input.getText());
			double outputvalue = Math.log10(input);
			String outputString = String.format("The base 10 log of %d = %.2f", input, outputvalue);
			myGui.output.setText(outputString);
		} else if (text == "Square Root") {
			int input = Integer.parseInt(myGui.input.getText());
			double outputvalue = Math.sqrt(input);
			String outputString = String.format("The square root of %d = %.2f", input, outputvalue);
			myGui.output.setText(outputString);
		} else if (text == "Square") {
			int input = Integer.parseInt(myGui.input.getText());
			double outputvalue = input*input;
			String outputString = String.format("The square of %d = %.2f", input, outputvalue);
			myGui.output.setText(outputString);
		} else if (text == "Cube Root") {
			int input = Integer.parseInt(myGui.input.getText());
			double outputvalue = Math.cbrt(input);
			String outputString = String.format("The cube root of %d = %.2f", input, outputvalue);
			myGui.output.setText(outputString);
		} else if (text == "Cube") {
			int input = Integer.parseInt(myGui.input.getText());
			double outputvalue = input*input*input;
			String outputString = String.format("The natural log of %d = %.2f", input, outputvalue);
			myGui.output.setText(outputString);
		}
		
	}

}
