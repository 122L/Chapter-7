package exercises;

import java.util.Scanner;

public class CountMovieSpaces {
    public static void main(String[] args) {
        String Quote;
        int numberOfSpace = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a movie quote >>> ");
        Quote = input.nextLine();

        for(int i = 0; i < Quote.length(); i++) {
            if (Quote.charAt(i) ==  ' ') {
                numberOfSpace++;
                ++i;

            }
        }
        System.out.println("Number of spaces >>> " + numberOfSpace);
    }
}
