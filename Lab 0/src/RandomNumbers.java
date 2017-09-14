import java.util.Random;

/*
 * CS-250, Fall 2017, Lab 0
 * 
 * Part A
 * 
 * Matthew Hickey
 * 
 * 
a) Creates an integer array of size 50.
b) Store random numbers in the range -250 to 250.
c) Outputs the values neatly formatted in 5 columns.
d) Outputs the average of the values in the array.
e) Selects, and prints out, the largest number.
f) Outputs the reverse of the largest: Ex. If the largest is 125, it prints 521.
 * 
 */

public class RandomNumbers {
	

	public static void main(String[] args) {
		
		Random rand = new Random(); //Create random number generator
		
		int[] numbers = new int[50]; //Create int array of size 50
		
		for (int i = 0; i < 50; i++) {
			numbers[i] = rand.nextInt(500) - 250; // Assign random number betweet -250 and 250 for each index in the array
		}
		
		for (int i = 0; i < 50; i++) { // Print the numbers out and every 5 create a new line
			if (i % 5 == 0 && i != 1) {
				System.out.println();
			}
			
			System.out.format("    %4d  ",(numbers[i]));
		}
		
		int sum = 0;
		
		for (int i = 0; i < 50; i++) {
			sum += numbers[i];
		}
		
		float average = ((float)sum / 50); //Add the numbers and divide by how many there are for the average
		
		System.out.format("\n\nAverage: %5.2f", average);
		
		int largest = -251; //create int with value lower the possible, replace if compared number is larger
		
		for (int i = 0; i < 50; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		
		System.out.println("\n\nLargest: " + largest);
		
		String largestStr = String.valueOf(largest); //convert the value to a string and reverse it with a StringBuffer
		
		String reversed = new StringBuffer(largestStr).reverse().toString();
		
		System.out.println("\nReversed: " + reversed);
		
		
		
		
		
	}
}
