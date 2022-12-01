/* @formatter:off
 *
 * Dave Rosenberg
 * Comp 2000 - Data Structures
 * Lab: List application - card game
 * Fall, 2022
 * 
 * Usage restrictions:
 * 
 * You may use this code for exploration, experimentation, and furthering your
 * learning for this course. You may not use this code for any other
 * assignments, in my course or elsewhere, without explicit permission, in
 * advance, from myself (and the instructor of any other course).
 * 
 * Further, you may not post (including in a public repository such as on github)
 * nor otherwise share this code with anyone other than current students in my 
 * sections of this course. Violation of these usage restrictions will be considered 
 * a violation of the Wentworth Institute of Technology Academic Honesty Policy.
 *
 * Do not remove this notice.
 *
 * @formatter:on
 */

package edu.wit.scds.ds.list.app;

import java.util.ArrayList ;
import java.util.List ;
import java.util.Collections ;

/**
 * Representation of a deck of cards
 *
 * @author Your Name
 *
 * @version 1.0.0 2022-11-15 Initial implementation
 *
 */
public class Deck extends Pile
	{
	// TODO implement this
	ArrayList<Card> deck = new ArrayList<Card>(112);
	
	public Deck()
	    {
	    final Suit[] suits = Suit.values() ;
        final Rank[] ranks = Rank.values() ;


        // generate a deck of cards
        
        for ( final Suit suit : suits )
            {

            for ( final Rank rank : ranks )
                {

                // build a card
                final Card newCard = new Card( suit, rank ) ;
                System.out.printf( " %s", newCard ) ;
                
                if( !(rank == rank.DRAW4 && suit != suit.MULTI) && !(rank == rank.MULTICOLOR && suit != suit.MULTI) && !(suit == suit.MULTI && ((rank != rank.DRAW4) && (rank != rank.MULTICOLOR)) )) 
                    {
                    if( rank == rank.DRAW4 || rank == rank.MULTICOLOR)
                        {
                    deck.add( newCard ) ;
                    deck.add( newCard ) ;
                        }
                    deck.add( newCard ) ;
                    deck.add( newCard ) ;
                    }
               
                }

            }
	    }
	
	public void shuffleDeck()
	    {
	    Collections.shuffle( deck );
	    }
	
	public Card getCard() 
	    {
	
	    return deck.get( 0 ) ;
	
	    }
	
	public Card removeCard()
	    {
            return deck.get( 0 ) ;
	
	    }
	/**
     * (optional) test driver
     * 
     * @param args
     *     -unused-
     */
	public static void main( String[] args )
		{
        // OPTIONAL for testing and debugging

		
		}	// end main()

	}	// end class Deck