
package javacore;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {

        // Text to be written into the file
        String text = "Peter Piper picked a peck of pickled peppers\n"
                + "A peck of pickled peppers Peter Piper picked\n"
                + "If Peter Piper picked a peck of pickled peppers\n"
                + "Where's the peck of pickled peppers Peter Piper picked?";

        try {
            // Create the file and write the text
            FileWriter fw = new FileWriter("sample.txt");
            fw.write(text);
            fw.close();

            // Open the file for reading
            FileReader fr = new FileReader("sample.txt");

            int ch;
            String content = "";

            // Read the file character by character
            while ((ch = fr.read()) != -1) {
                content = content + (char) ch;
            }

            // Close the file
            fr.close();

            // Initialize pattern counters
            int peCount = 0;
            int piCount = 0;

            // Check every two-character pattern
            for (int i = 0; i < content.length() - 1; i++) {

                // Extract two consecutive characters
                String pattern = content.substring(i, i + 2);

                // Count occurrences of "pe"
                if (pattern.equalsIgnoreCase("pe")) {
                    peCount++;
                }

                // Count occurrences of "pi"
                if (pattern.equalsIgnoreCase("pi")) {
                    piCount++;
                }
            }

            // Display the frequency counts
            System.out.println("'pe' - no of occurrences - " + peCount);
            System.out.println("'pi' - no of occurrences - " + piCount);

        } catch (IOException e) {
            // Handle file-related errors
            System.out.println("File error: " + e.getMessage());
        }
    }
}
