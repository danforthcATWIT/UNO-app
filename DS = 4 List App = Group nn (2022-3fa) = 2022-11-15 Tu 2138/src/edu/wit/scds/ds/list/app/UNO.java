
package edu.wit.scds.ds.list.app;


/**
 * 
 * 
 * @author connellj2
 * @version 1.0.0 2022-11-30 Initial implementation
 *
 */
public class UNO
    {

    /**
     * 
     * 
     * @param args
     */

    public static void main( String[] args )
        {
        // TODO Auto-generated method stub
        Deck deck = new Deck() ;
        
        Hand player1Hand = new Hand() ;
        Hand player2Hand = new Hand() ;
        Hand player3Hand = new Hand() ;
        
        Pile pile = new Pile() ;
        
        Player player1 = new Player() ;
        Player player2 = new Player() ;
        Player player3 = new Player() ;
        
       deck.shuffleDeck() ;
        
       player1Hand.addCard() ;
        }

    }
   // end class UNO