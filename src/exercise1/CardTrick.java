package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Ty Butler Jan 26, 2024
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Random rnd = new Random();
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(rnd.nextInt(1,10));
            // 
            card.setSuit(Card.SUITS[rnd.nextInt(0,3)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand[i] = card;
            System.out.println(card.getValue());
            System.out.println(card.getSuit());
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
               // declare variables
        int value, suit;
        
        // get scanner for input
        Scanner scanner = new Scanner(System.in);
        // get numbers from user
        System.out.println("Enter a Card Value: ");
        value = scanner.nextInt();
        System.out.println("Enter a suit (0=hearts,1=diamonds,2=spades,3=clubs: ");
        suit = scanner.nextInt();
        Card usercard = new Card();
        usercard.setValue(value);
        usercard.setSuit(Card.SUITS[suit]);
        
        for (int i = 0; i < hand.length; i++) {
            if(hand[i].getSuit() == usercard.getSuit() && hand[i].getValue() == usercard.getValue()){
                printInfo();
            }
        }
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
