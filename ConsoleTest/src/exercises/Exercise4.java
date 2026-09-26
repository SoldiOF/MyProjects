package exercises;

import java.util.Scanner;

public class Exercise4 {

    public static void useExercise4()
    {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter input:");
        String input = userInput.nextLine();
        char[] sentenceLetters = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(sentenceLetters[input.length() - 1 - i]);
        }
        input = sb.toString();
        System.out.println("reverse: " + input);
    }

}
