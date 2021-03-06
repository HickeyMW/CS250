/*
 * 
 *  Matthew Hickey
 * 
 * 
 */
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.applet.*;

public class HappyFace extends Applet
{     
	
	int[] data = {10, 20, 35, 20, 15};
	
	
    public void paint(Graphics g) 
    {   
    	this.setSize(350, 600);
    	
    	Scanner dataFile;
		try {
			dataFile = new Scanner(new File("input.dat"));
			int size = dataFile.nextInt();
			int[] numbers = new int[size];
			for (int i = 0; i < size; i++) {
				numbers[i] = dataFile.nextInt();
			}
	    	Font f = new Font("Helvetica", Font.BOLD,20);
	    	g.setFont(f);
	    	createPieChart(numbers, g);
	    	createHistogram(numbers, g);
	    	createLineChart(numbers, g);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    
    }
    
    public void createPieChart(int[] values, Graphics graphics) {
    	
    	float total = 0;
    	int startAngle = 0;
    	Random random = new Random(123162);
    	
    	graphics.setColor(Color.black);
    	graphics.drawString("Pie Chart", 55, 20);
    	
    	for (int i = 0; i < values.length; i++) {
			total += values[i];
		}
    	
    	for (int i = 0; i < values.length; i++) {
    		int r = random.nextInt(255);
    		int g = random.nextInt(255);
    		int b = random.nextInt(255);
			graphics.setColor(new Color(r,g,b));
			int arcAngle = (int)((values[i]/total)*360f);
			System.out.println(arcAngle);
			graphics.fillArc(25, 35, 150, 150, startAngle, arcAngle);
			startAngle += arcAngle;
		}
    }
    
    public void createHistogram(int[] values, Graphics graphics) {
    	
    	int highestValue = 0;
    	int x = 25;
    	Random random = new Random(123512);
    	
    	graphics.setColor(Color.black);
    	graphics.drawString("Histogram", 55, 230);
    	
    	for (int i = 0; i < values.length; i++) {
			if (values[i] > highestValue) {
				highestValue = values[i];
			}
		}
    	
    	for (int i = 0; i < values.length; i++) {
    		System.out.println("i: " + i + " value: " + values[i]);
    		int height = (values[i]*100)/highestValue;
    		int r = random.nextInt(255);
    		int g = random.nextInt(255);
    		int b = random.nextInt(255);
    		graphics.setColor(new Color(r,g,b));
    		graphics.fillRect(x, 350, 20, -height);
    		x += 30;
    		
    	}
    }
    
    public void createLineChart(int[] values, Graphics graphics) {
    	
    	int highestValue = 0;
    	int x = 40;
    	
    	graphics.setColor(Color.black);
    	graphics.drawString("Line Chart", 55, 400);
    	
    	for (int i = 0; i < values.length; i++) {
			if (values[i] > highestValue) {
				highestValue = values[i];
			}
		}
    	
    	int lastHeight = (values[0]*100)/highestValue;
    	
    	for (int i = 1; i < values.length; i++) {
    		int height = (values[i]*100)/highestValue;
    		if (height > lastHeight) {
    			graphics.setColor(Color.green);
			} else {
				graphics.setColor(Color.red);
			}
    		
    		graphics.drawLine(x, 530 - lastHeight, x + 30, 530 - height);
    		lastHeight = height;
    		x += 30;
    	}
    	
    }
    
    
}