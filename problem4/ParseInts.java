package problem4;

import java.util.Scanner;

public class ParseInts {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		try {
			while (true) {
				System.out.println();
				// Prompt the user to enter a line of integers
				System.out.print("Enter a line of integers (or press Enter to quit): ");
				String line = scan.nextLine();

				// exit loop if the user presses Enter without any input
				if (line.isEmpty()) {
					break;
				}
			
				// Reset the sum
				sum = 0;

				// Create a Scanner object to parse the input line
				Scanner scanLine = new Scanner(line);

				// Sum the integers
				while (scanLine.hasNext()) {
					try {
						sum += Integer.parseInt(scanLine.next());
					} catch (NumberFormatException e) {
						// Ignore non-integer values
					}
				}
				// Close the Scanner objects
				scanLine.close();
				
				// Display the sum
				System.out.println("The sum of the integers on the line is " + sum);
				System.out.println();
			}	
		} finally {
			// Close the Scanner object
			scan.close();
		}
	}	
}
