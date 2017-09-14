/*
 * The setup for lab 3A
 * 
 */

package Lab3A;

public class App3A {

	public static void main(String[] args) {
		MyGui gui = new MyGui();
		Listener listener = new Listener();
		
		gui.setListener(listener);
		listener.setGUi(gui);
	}
}
