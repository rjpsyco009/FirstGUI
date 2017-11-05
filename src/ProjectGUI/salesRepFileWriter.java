
package ProjectGUI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author user
 */
public class salesRepFileWriter{
    public void writeRep(salesRep s) throws IOException{
        File testWriter = new File ("Sales_Reps.txt");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(testWriter, true))) {
            out.write( "ID:"+ s.getIdNumber());
            out.write(", ");
            out.write(" FirstName:"+s.getSalesRepFirstName());
            out.write(", ");
            out.write(" LastName:"+s.getSalesRepLastName());
            out.write(", ");           
            out.write(" OfficeSupplies:"+ s.getOfficeSupplies());
            out.write(", ");
            out.write(" Books:"+ s.getBooks());
            out.write(", ");            
            out.write(" Paper:"+s.getPaper());
            out.write(", ");
            out.write(" Total:"+s.getTotalSold());
            out.write(", ");
            out.write(" District:"+s.getDistrictSelect());
            out.write(", ");
            out.write(" Contact:"+s.getContactSelect());
            out.newLine();
            out.close();
        }        
    }
}
