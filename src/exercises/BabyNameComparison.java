package exercises;

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        String bn1;
        String bn2;
        String bn3;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first baby name >>> ");
        bn1 = input.nextLine();

        System.out.println("Please enter your second baby name >>> ");
        bn2 = input.nextLine();

        System.out.println("Please enter your third baby name >>> ");
        bn3 = input.nextLine();

        System.out.println("Possible name combinations: ");
        System.out.println(bn1 + " " + bn2);
        System.out.println(bn1 + " " + bn3);
        System.out.println(bn2 + " " + bn1);
        System.out.println(bn2 + " " + bn3);
        System.out.println(bn3 + " " + bn1);
        System.out.println(bn3 + " " + bn2);
    }
}
