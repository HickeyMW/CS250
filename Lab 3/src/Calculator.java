import javax.swing.JFrame;

public class Calculator {

	// -----------------------------------------------------------------
	// Creates and displays the calculator GUI.
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator"); // create window with title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		CalculatorPanel panel = new CalculatorPanel(); // create panel

		frame.getContentPane().add(panel); // add panel to the window
		frame.pack();
		frame.setVisible(true);
	}
}
