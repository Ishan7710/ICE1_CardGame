package card;
import java.util.Random;

public class CardTrick {

    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final int HAND_SIZE = 7;

    public static void main(String[] args) {
        Random rand = new Random();

        Card[] hand = new Card[HAND_SIZE];
        for (int i = 0; i < HAND_SIZE; i++) {
            Card c = new Card();
            c.setValue(1 + rand.nextInt(13));
            c.setSuit(SUITS[rand.nextInt(SUITS.length)]);
            hand[i] = c;
        }

        for (Card c : hand) {
            System.out.println(c.getSuit() + " " + c.getValue());
        }

        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Spades");

        boolean found = false;
        for (Card c : hand) {
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Winner! The lucky card (" 
                + luckyCard.getSuit() + " " + luckyCard.getValue() + ") is in the hand.");
        } else {
            System.out.println("Not this time. The lucky card (" 
                + luckyCard.getSuit() + " " + luckyCard.getValue() + ") is NOT in the hand.");
        }
    }
}
