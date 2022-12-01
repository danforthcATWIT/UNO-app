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

package edu.wit.scds.ds.list.app ;

import java.util.ArrayList ;
import java.util.List ;

/**
 * Representation of a hand of cards
 *
 * @author Your Name
 *
 * @version 1.0.0 2022-11-15 Initial implementation
 */
public class Hand extends Pile
    {
    // TODO implement this
    
    protected List<Card> hand ; 
    
   public Hand()
       {
       hand = new ArrayList<Card>(7) ;
       }
   
   public List<Card> getHand()
       {
       return hand ;
       }
   
   public void addCard( Card pickUp)
       {
       hand.add( pickUp ) ;
       }
   
   public Card removeCard( Card putDown)
       {
       hand.remove( putDown ) ;
       return putDown ;
       }

    /**
     * (optional) test driver
     *
     * @param args
     *     -unused-
     */
    public static void main( final String[] args )
        {
        // OPTIONAL for testing and debugging

        }	// end main()

    }	// end class Hand