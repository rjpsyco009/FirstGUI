
package ProjectGUI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *Ryan Norton
 * Intermediate Java II - Unit 5 IP
 * Instructor - Anthony Lowe
 * November 7, 2017
 * 
 * 
 */

//takes sales reps objects and writes to Sales_Rep.txt file
//executed once enter Button is selected

public class salesRepFileWriter{
    public void writeRep(salesRep s) throws IOException{
        File testWriter = new File ("Sales_Reps.txt");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(testWriter, true))) {
            out.write(s.getIdNumber());
            out.write("|");
            out.write(s.getSalesRepFirstName());
            out.write("|");
            out.write(s.getSalesRepLastName());
            out.write("|");           
            out.write( s.getOfficeSupplies());
            out.write("|");
            out.write(s.getBooks());
            out.write("|");            
            out.write(s.getPaper());
            out.write("|");
            out.write(s.getDistrictSelect());
            out.write("|");
            out.write(s.getContactSelect());
            out.newLine();
            out.close();
        }        
    }
}
