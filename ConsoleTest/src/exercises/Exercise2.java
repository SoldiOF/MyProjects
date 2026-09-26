package exercises;

import java.util.Scanner;

public class Exercise2 {

    public static void useExercise2()
    {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter input:");
        String input = userInput.nextLine();
        String originalInput = input;
        input = input.replaceAll(" ", "");//remove whitespaces
        int amountCharacters = input.length();//
        System.out.println("(" + originalInput + ") " + "contains " + amountCharacters + " characters!");
    }

}
