
package ProjectGUI;

import java.util.List;

/**
 *
 * @author ryanalena
 */
public class bonusReps {
    public salesRep findBonus(List<salesRep> reps){
        //find any entries with a total sales of $8,000 or more
        //save them to Stars.txt for bonuses
        //how, Tony? how? I know I need a loop, but my brain just can't do it.
        //HALP
        salesRep sales = null;
        for (salesRep s: reps)
        {
            if (sales == null)
            {
                sales = s;
                continue;
            }
            int total = Integer.parseInt(s.getTotalSold());
            if(total >= 8000){
                System.out.println("huzzah!");
                
            } 
            return total;
        }
        
}
    

