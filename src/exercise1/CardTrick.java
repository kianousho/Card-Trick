package exercise1;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Card[] hand = new Card[7];
//        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int) ((Math.random() * 13) + 1));
            card.setSuit(suits[(int) (Math.random() * 4)]);
            hand[i] = card;
        }

//        System.out.println("Generated hand:");
//        for (Card card : hand) {
//            System.out.println(card.getValue() + " of " + card.getSuit());
 
        // Ask the user for Card value and suit, create their card, and search the hand
        System.out.println("Enter the card value (1-10 or 11 for Jack, 12 for Queen, etc.):");
        int numValue = input.nextInt();
        String fValue;
        if (numValue >= 1 && numValue <= 10) {
            fValue = String.valueOf(numValue);
        } else {
            switch (numValue) {
                case 11:
                    fValue = "Jack";
                    break;
                case 12:
                    fValue = "Queen";
                    break;
                case 13:
                    fValue = "King";
                    break;
                default:
                    fValue = "Invalid card value";
                    break;
            }
        }

        System.out.println("Enter the suit (Spades, Hearts, Diamonds, Clubs):");
        String suit = input.next();   
         boolean foundMatch = false;

        for(int i = 0; i < hand.length; i++) {
            if (hand[i].getValue() == numValue && hand[i].getSuit().equalsIgnoreCase(suit)) {
                foundMatch = true;
                break;
            }
        }

        if (foundMatch) {
            printInfo();
        } else {
            System.out.println("Better luck next time!");
        }
    }


    /**
     * @author Kianoush Heidari June 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Kianoush, but my friends call me kia");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- learn JavaScript");
        System.out.println("-- expand my problem solving abilities");
	System.out.println("-- being actice on gitHub and make many projects as i can");	

        System.out.println("My hobbies:");
        System.out.println("-- Gaming");
        System.out.println("-- Cooking");
        System.out.println("-- Watching Series");
        System.out.println("-- walking");

        System.out.println();
        
    
    }
}

