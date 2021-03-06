package Lab3A;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryGui extends JFrame {
	
	BinaryListener binaryListener;
	
	
	JButton btnAdd = new JButton("+");
	JButton btnSubtract = new JButton("-");
	JButton btnMultiply = new JButton("*");
	JButton btnDivide = new JButton("/");
	JTextField input1 = new JTextField(10);
	JTextField input2 = new JTextField(10);
	JLabel output = new JLabel("-----");

	JPanel panel = new JPanel();
	
	public BinaryGui() {
		this.setSize(270, 300);
		this.setTitle("Binary Calculator");
		
		Container container = this.getContentPane();
		
		panel.add(btnAdd);
		panel.add(btnSubtract);
		panel.add(btnMultiply);
		panel.add(btnDivide);
		panel.add(input1);
		panel.add(input2);
		panel.add(output);
		
		container.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setListener(BinaryListener binaryListener) {
		this.binaryListener = binaryListener;
		btnAdd.addActionListener(binaryListener);
		btnSubtract.addActionListener(binaryListener);
		btnMultiply.addActionListener(binaryListener);
		btnDivide.addActionListener(binaryListener);
	}
}
