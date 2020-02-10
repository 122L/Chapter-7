package exercises;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        String words;
        String ay = "ay";

        Scanner input = new Scanner(System.in);

        System.out.println("Insert words >>> ");
        words = input.nextLine();

        for(int i = 0; i < words.length(); i++) {
            if(words.substring(i) == "a" || words.substring(i) == "e" || words.substring(i) == "i" || words.substring(i) == "o" || words.substring(i) == "u") {

            }
        }
    }
}
