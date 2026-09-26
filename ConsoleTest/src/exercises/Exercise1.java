package exercises;

import java.util.Scanner;

public class Exercise1 {

    public static void useExercise1()
    {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter input:"); // output user prompt
        String input = userInput.nextLine(); // Scan user input and turn it into a String called "input"
        System.out.println("<" + input + ">");
    }

}
