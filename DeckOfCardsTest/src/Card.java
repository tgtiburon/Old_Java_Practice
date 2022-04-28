/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tony
 */
public class Card

{
    private String face; // Face of card "Ace", "King" etc.
    private String suit; // suit of card
public Card(String cardFace, String cardSuit)
    {

    face = cardFace;  // initialize face of card
    suit = cardSuit; // initialize suit of card

}// end of method Card
    public String toString()
    {
        return face + " of " + suit;
    }// end method to string



}// end of class Card
