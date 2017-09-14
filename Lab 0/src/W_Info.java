/*
 * CS-250, Fall 2017, Lab 0
 * 
 * Matthew Hickey
 * 
 */

public class W_Info {
	private double lowTemp, highTemp;
	
	public W_Info (double lowTemp, double highTemp) {
		this.lowTemp = lowTemp;
		this.highTemp = highTemp;
	}
	
	public double getHighTemp() {
		return highTemp;
	}
	
	public double getLowTemp() {
		return lowTemp;
	}
}
