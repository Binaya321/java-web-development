import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:  ");
        String phrase = input.nextLine();
//        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] phraseArray = phrase.toLowerCase().toCharArray();
        HashMap<Character, Integer> charCounts = new HashMap<>();
        System.out.println(phraseArray);

        for (char character : phraseArray) {
//            if (Character.isLetter(character)) {
                if (charCounts.containsKey(character)
            ) {
                    charCounts.put(character, charCounts.get(character) + 1);
                } else {
                    charCounts.put(character, 1);
//                }
            }
        }
        System.out.println(charCounts);

    }
    }
