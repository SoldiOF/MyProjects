package exercises;

import java.util.Scanner;

public class Exercise3 {

    public static void useExercise3()
        {
            Scanner userInput = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter input:");
            String input = userInput.nextLine();
            input = input.replaceAll(" ", "");//remove whitespaces
            input = input.replaceAll("", "@");
            int newAmountCharacters = input.length();//
            input = input.substring(1, newAmountCharacters - 1);
            System.out.println(input + "\n");
        }

}
