package exercises;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise5 {

    public static void useExercise5()
    {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter input:");
        String input = userInput.nextLine();
        HashMap<String, String> morse = new HashMap<>(); // morse alphabet

        morse.put("A", ".-");
        morse.put("B", "-...");
        morse.put("C", "-.-.");
        morse.put("D", "-..");
        morse.put("E", ".");
        morse.put("F", "..-.");
        morse.put("G", "--.");
        morse.put("H", "....");
        morse.put("I", "..");
        morse.put("J", ".---");
        morse.put("K", "-.-");
        morse.put("L", ".-..");
        morse.put("M", "--");
        morse.put("N", "-.");
        morse.put("O", "---");
        morse.put("P", ".--.");
        morse.put("Q", "--.-");
        morse.put("R", ".-.");
        morse.put("S", "...");
        morse.put("T", "-");
        morse.put("U", "..-");
        morse.put("V", "...-");
        morse.put("W", ".--");
        morse.put("X", "-..-");
        morse.put("Y", "-.--");
        morse.put("Z", "--..");
        morse.put("1", ".----");
        morse.put("2", "..---");
        morse.put("3", "...--");
        morse.put("4", "....-");
        morse.put("5", ".....");
        morse.put("6", "-....");
        morse.put("7", "--...");
        morse.put("8", "---..");
        morse.put("9", "----.");
        morse.put("0", "-----");
        morse.put("*", "*");

        input = input.toUpperCase(); // turns input into capital letters for easier convertion

        StringBuilder morseOutput = new StringBuilder(); // new string builder for making translation printable

        String[] words = input.split("\\s+"); // creates new array that splits input into words
        for (String word : words) { // enhanced for loop, running the loop until there is no more Strings in the array words
            char[] wordLetters = word.toCharArray(); // turns the words into an array containing the individual characters
            for (int i = 0; i < wordLetters.length; i++) { // for loop runs the loop the same amount of times as there are characters in the wordLetters array
                char currentLetter = wordLetters[i]; // sets a new variable char to the letter in the current loops index

                String morseTranslation = morse.get(String.valueOf(currentLetter)); //new String that fetches the translated value of the current character key.

                morseOutput.append(morseTranslation).append(" ");// appends all the translated strings of the current word and adds whitespace between every letter
            }
            morseOutput.append("/"); // appends all the translated words into the complete translated sentence and adds a / between every word.
        }
        System.out.println("\n" + morseOutput.toString()); // outputs the translated input
    }

}
