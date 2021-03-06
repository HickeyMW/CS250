/*
 * This will display GUI for lab 3A
 * 
 * 
 */

package Lab3A;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyGui extends JFrame { // The MyGui object is a window (JFrame)

	Listener myListener;
	
	JButton nLogButton = new JButton("Natural Log");
	JButton b2LogButton = new JButton("Base 2 Log");
	JButton b10LogButton = new JButton("Base 10 Log");
	JButton sqrtButton = new JButton("Square Root");
	JButton sqButton = new JButton("Square");
	JButton cbrtButton = new JButton("Cube Root");
	JButton cbButton = new JButton("Cube");
	JTextField input = new JTextField(10);
	JLabel output = new JLabel("-----");
	
	JPanel panel = new JPanel();
	
	public MyGui() {
		this.setSize(300, 300);
		this.setTitle("Unary Calculator");
		
		Container container = this.getContentPane();
		
		panel.add(nLogButton);
		panel.add(b2LogButton);
		panel.add(b10LogButton);
		panel.add(sqrtButton);
		panel.add(sqButton);
		panel.add(cbrtButton);
		panel.add(cbButton);
		panel.add(input);
		panel.add(output);
		
		container.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void setListener(Listener listener) {
		
		myListener = listener;
		nLogButton.addActionListener(myListener);
		b2LogButton.addActionListener(myListener);
		b10LogButton.addActionListener(myListener);
		sqrtButton.addActionListener(myListener);
		sqButton.addActionListener(myListener);
		cbrtButton.addActionListener(myListener);
		cbButton.addActionListener(myListener);
	}

}
