import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Matthew Hickey
 * 
 * 
 * Application that uses long numbers
 * 
 * 
 */
public class LongNumberApp {

	public static int size = -1;

	public static void main(String[] args) throws FileNotFoundException {

		Scanner dataFile = new Scanner(new File("numbers.dat"));
		
		size = dataFile.nextInt();
		
		LongNumber[] numbers = new LongNumber[size]; // creating an array of LongNumber
		
		for (int i = 0; i < size; i++) {
			numbers[i] = new LongNumber(dataFile.next());
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i].toString());
		}
		
String menu = "Please choose an option\n";
		
		menu += "1. Displaying properties of a number\n";
		menu += "2. Adding numbers\n";
		menu += "3. Subtracting numbers\n";
		menu += "4. Multiplying numbers\n";
		menu += "5. Exit\n";
		int choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		String numberOptions = "";
		
		int firstChoice;
		int secondChoice;
		LongNumber answer;
		
		for (int i = 0; i < size; i++) {
			numberOptions += String.format((i + 1) + ". %30s\n", numbers[i].getNumber());
			//numberOptions += (i + 1) + ". " + numbers[i].getNumber() + "\n";
		}
		switch(choice) {
		case 1:
			int selectedNum = Integer.parseInt(JOptionPane.showInputDialog("Select a number to display the properties of\n" + numberOptions));
			if (isChoiceValid(selectedNum)) {
				JOptionPane.showMessageDialog(null, "The number is " + numbers[selectedNum - 1].getNumber() +
						"\nIt has " + numbers[selectedNum - 1].getSize() + " digits and the sum of the digits is " + numbers[selectedNum - 1].getSumOfDigits());
			} else {
				JOptionPane.showMessageDialog(null, "Invalid option");				
			}
			break;
		case 2:
			firstChoice = Integer.parseInt(JOptionPane.showInputDialog("Selet the first number to add\n" + numberOptions));
			if (isChoiceValid(firstChoice)) {
				secondChoice = Integer.parseInt(JOptionPane.showInputDialog("Selet the second number to add\n" + numberOptions));
				if (isChoiceValid(secondChoice)) {
					answer = LongNumber.add(numbers[firstChoice-1].getNumber(), numbers[secondChoice-1].getNumber());
					JOptionPane.showMessageDialog(null, "The sum of the numbers is " + answer.getNumber());
				} else {
					JOptionPane.showMessageDialog(null, "Invalid option");	
				}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid option");	
			}
			
			break;
		case 3:
			firstChoice = Integer.parseInt(JOptionPane.showInputDialog("Selet the first number\n" + numberOptions));
			if (isChoiceValid(firstChoice)) {
				secondChoice = Integer.parseInt(JOptionPane.showInputDialog("Selet the second number to subtract\n" + numberOptions));
				if (isChoiceValid(secondChoice)) {
					answer = LongNumber.subtract(numbers[firstChoice-1].getNumber(), numbers[secondChoice-1].getNumber());
					JOptionPane.showMessageDialog(null, "The result is " + answer.getNumber());
				} else {
					JOptionPane.showMessageDialog(null, "Invalid option");	
				}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid option");	
			}
			break;
		case 4:
			firstChoice = Integer.parseInt(JOptionPane.showInputDialog("Selet the first number to multiply\n" + numberOptions));
			if (isChoiceValid(firstChoice)) {
				secondChoice = Integer.parseInt(JOptionPane.showInputDialog("Selet the second number to multiply\n" + numberOptions));
				if (isChoiceValid(secondChoice)) {
					answer = LongNumber.multiply(numbers[firstChoice-1].getNumber(), numbers[secondChoice-1].getNumber());
					JOptionPane.showMessageDialog(null, "The result is " + answer.getNumber());
				} else {
					JOptionPane.showMessageDialog(null, "Invalid option");	
				}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid option");	
			}
			break;
		case 5:
			break;
		default: JOptionPane.showMessageDialog(null, "Invalid option");
			break;
		}

	}
	
	public static boolean isChoiceValid(int choice) {
		if (choice < 1 || choice > size) {
			return false;
		}
		return true;
	}
	
	

}
