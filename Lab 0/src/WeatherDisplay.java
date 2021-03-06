import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class WeatherDisplay {
	
	public static void main(String[] args) throws FileNotFoundException {
		W_Info[] dataValues;
		
		int size;
		
		Scanner dataFile = new Scanner(new File("W_Info.dat"));
		
		size = dataFile.nextInt();
		
		dataValues = new W_Info[size];
		
		for (int i = 0; i < size; i++) {
			double lowTemp = dataFile.nextDouble();
			double highTemp = dataFile.nextDouble();
			dataValues[i] = new W_Info(lowTemp, highTemp);
		}
		
		
		String menu = "Please choose an option\n";
		
		menu += "1. For printing the temperature\n";
		menu += "2. For printing the day with the highest temperature\n";
		menu += "3. For printing the day with the lowest temperature\n";
		menu += "4. For printing the average high and the average low\n";
		int choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
		
		switch (choice) {
		case 1:
			int day = Integer.parseInt(JOptionPane.showInputDialog("Type a value between 1 and " + size + " for the day of your choice"));
			if (day >= 1 && day <= size) {
				JOptionPane.showMessageDialog(null, "The high temp of the day was " + dataValues[day -1].getHighTemp() + 
						"\nThe low temp of the day was " + dataValues[day -1].getLowTemp());
				
			} else {
				JOptionPane.showMessageDialog(null,  "Wrong day");
			}
			break;
		case 2:
			int indexHighest = -1;
			for (int i = 0; i < size; i++) {
				if (indexHighest == -1 || (dataValues[i].getHighTemp() > dataValues[indexHighest].getHighTemp())) {
					indexHighest = i;
				}
			}
			JOptionPane.showMessageDialog(null, "The day with the highest temp was day " + (indexHighest + 1 ) + " with a high temp of " + dataValues[indexHighest].getHighTemp());
			break;
		case 3:
			int indexLowest = -1;
			for (int i = 0; i < size; i++) {
				if (indexLowest == -1 || (dataValues[i].getLowTemp() < dataValues[indexLowest].getLowTemp())) {
					indexLowest = i;
				}
			}
			JOptionPane.showMessageDialog(null, "The day with the lowest temp was day " + (indexLowest + 1 ) + " with a low temp of " + dataValues[indexLowest].getLowTemp());
			break;
		case 4:
			double sumHigh = 0;
			double sumLow = 0;
			for (int i = 0; i < size; i++) {
				sumHigh += dataValues[i].getHighTemp();
				sumLow += dataValues[i].getLowTemp();
			}
			double avgHigh = sumHigh / size;
			double avgLow = sumLow / size;
			JOptionPane.showMessageDialog(null, String.format("The average high was %3.2f and the average low was %3.2f", avgHigh, avgLow));
			break;
			
		default: JOptionPane.showMessageDialog(null, "Invalid option");
				
		}
	}

}
