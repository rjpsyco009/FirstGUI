
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
    public void writePerson(salesRep s) throws IOException{
        File testWriter = new File ("people.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(testWriter, true));
        
        out.write(s.getSalesRepFirstName());
        out.write(", ");
        out.write(s.getSalesRepLastName());
        out.write(", ");
        out.write("" + s.getIdNumber());
        out.write(", ");
        out.write("" + s.getDistrictSelect());
        out.write(", ");
        out.write("" + s.getContactSelect());
        out.newLine();
        out.close();        
    }
}
