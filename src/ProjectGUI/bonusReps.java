
package ProjectGUI;

import java.util.ArrayList;
import java.util.List;

/**
 *Ryan Norton
 * Intermediate Java II - Unit 5 IP
 * Instructor - Anthony Lowe
 * November 7, 2017
 * 
 * 
 */


//find any salesReps with a total sales of $8,000 or more
    //add Office Supplies, books, and paper.
        
public class bonusReps {
    public List <salesRep> findBonus(List<salesRep> reps){
        
        List<salesRep> stars = new ArrayList();
        for (salesRep s: reps)
        {
           int os=Integer.parseInt(s.getOfficeSupplies());
           int books=Integer.parseInt(s.getBooks());
           int paper =Integer.parseInt(s.getPaper());
           
           
           int total = os+books+paper;
           if (total >= 8000)
            {
               stars.add(s);
       
            }
        } 
            return stars;
        }
        
}
    

