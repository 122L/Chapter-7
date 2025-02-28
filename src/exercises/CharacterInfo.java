package exercises;

import java.util.Scanner;

public class CharacterInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char aChar;
        System.out.println("Please enter a character meaning only a letter or number or space > ");
        aChar = input.nextLine().charAt(0);
        System.out.println("The character is " + aChar);

        if(Character.isUpperCase(aChar)) {
            System.out.println(aChar + " is uppercase");
        }
        else {
            System.out.println(aChar + " is not uppercase");
        }
        if(Character.isLowerCase(aChar)) {
            System.out.println(aChar + "is lowercase");
        }
        else {
            System.out.println(aChar + " is not lowercase");
        }

        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);

        if(Character.isLetter(aChar)) {
            System.out.println(aChar + " is a letter or digit.");
        }
        else {
            System.out.println(aChar + " is neither a letter nor a digit");
        }
        if(Character.isWhitespace(aChar)) {

            System.out.println(aChar + " is white space");
        }
        else {
            System.out.println(aChar + " is not white space");
        }
    }
}
