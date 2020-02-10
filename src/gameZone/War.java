package gameZone;

public class War {
    public static void main(String[] args) {
        final int CARDS_IN_SUIT = 13;
        int myValue;
        int yourValue;
        int mySuit;
        int yourSuit;

        String[] mySuits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] yourSuits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        yourValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        mySuit = ((char)(Math.random() * 100) % 4);
        yourSuit = ((char)(Math.random() * 100) % 4);

        if()
    }
}
