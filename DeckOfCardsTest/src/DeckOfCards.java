
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public class DeckOfCards
{
    private Card[] deck; // array of card objects
    private int currentCard; // indect of next card to be dealth
    private static final int  NUMBER_OF_CARDS = 52; // total number of cards

    private static final Random randomNumbers = new Random();

    // constructor fills deck of cards
    public DeckOfCards()
    {
        String[] faces = { " Ace", "Deuce", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card [ NUMBER_OF_CARDS]; // create an array of card objects

        currentCard = 0; //set current card so first dealt is deck[0]

        // populate the deck with Card Objects
        for (int count = 0; count < deck.length; count++)
            deck[count] = new Card(faces[count %13], suits[count/13]);
    }// end DeckOfCards

    // shuffle deck of ccards with one pass algorithm
    public void shuffle()
    {
        // after shuffling, dealing should  start at deck [0] again
        currentCard = 0 ; // reinitialize currentCard

        // for each card pick another random card and swap them
        for (int first = 0; first <deck.length; first++)
        {
            // select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

      

        // swap current card with randomly selected one
        Card temp = deck[first];
        deck[first] = deck[second];
        deck[second]= temp;

    } // end for

        
    }// end method shuffle

    // deal one card
    public Card dealCard()
    {
        // determine whether cards remain to be dealth
        if (currentCard < deck.length)
            return deck[currentCard++];// return current card in array
        else
            return null; // return null to inicate all cards dealth
    }// end method dealCard()




}// end class DeckOfCards
