package Lab3A;

public class BinaryApp {

	public static void main(String[] args) {
		BinaryGui gui = new BinaryGui();
		BinaryListener listener = new BinaryListener();
		
		gui.setListener(listener);
		listener.setGui(gui);
	}
}
