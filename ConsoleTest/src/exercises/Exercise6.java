package exercises;

import java.util.Scanner;
import java.lang.String;

public class Exercise6 {

    public static void useExercise6()
   {
       Scanner userInput = new Scanner(System.in);  // Create a Scanner object
       System.out.println("Enter input:");
       String input = userInput.nextLine();
       if (input.contains("horse") || input.contains("saddle") || input.contains("spores")) {
           input = input.replaceAll("horse", "*****");
           input = input.replaceAll("saddle", "******");
           input = input.replaceAll("spores", "******");
           System.out.println(input);
       } else {
           System.out.println(input);
       }
   }

}
