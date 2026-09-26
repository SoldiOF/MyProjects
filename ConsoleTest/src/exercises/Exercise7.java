package exercises;

import java.util.Scanner;
public class Exercise7 {

    public static void useExercise7()
    {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter input:");
        String input = userInput.nextLine();
        input = input.replaceAll(" ", "");//remove whitespaces
        char[] sentenceLetters = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(sentenceLetters[input.length() - 1 - i]);
        }
        String reverseInput = sb.toString();

        System.out.println("Palimdrone: " + input+reverseInput);
    }

}
