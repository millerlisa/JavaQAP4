package problem3;

import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        try {
            while (true) {
                System.out.println();
                // Prompt the user to enter a line of text
                System.out.print("Enter a word or phrase (or press Enter to quit): ");
                String word = scan.nextLine();

                // exit loop if the user presses Enter without any input
                if (word.isEmpty()) {
                    break;
                }
                
                int [] counts = new int[26];

                // Convert to Uppercase
                word = word.toUpperCase();

                for (int i = 0; i < word.length(); i++) {
                    try {
                        counts[word.charAt(i) - 'A']++;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Not a letter: " + word.charAt(i));
                    }
                }

                // Display the counts
                System.out.println();
                for (int i = 0; i < counts.length; i++) {
                    if (counts[i] > 0) {
                        System.out.println((char)('A' + i) + ": " + counts[i]);
                    }
                }
                System.out.println();
            }
        } finally {
            // Close the Scanner object
            scan.close();
        }
    }
}