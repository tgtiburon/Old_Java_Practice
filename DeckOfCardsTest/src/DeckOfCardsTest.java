/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Tony
 */
public class DeckOfCardsTest {

    /**
     * @param args the command line arguments
     */


    //execute application
    public static void main(String[] args) {
        // TODO code application logic here
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place in random order
        
        // print all 52 cards
        for (int i = 1; i <= 52 ; i++)
        {
            
            //deal and display card
            System.out.printf("%-19s",myDeckOfCards.dealCard());
            
            if (i%4 == 0 ) // newline every 4 cards
                System.out.println();
            
        }// end for
        
        
        
        
        






    }// end main

}// end CardShuffleTest
