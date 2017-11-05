
package ProjectGUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Ryan Norton
 * IntermediateJavaII - IP3
 * 
 * Reader Class
 */
/*This works well, but you will have a hard time reading this FILE for phase 3.  You should consider simplifying the output format so you can read it easier!*/
public class salesRepFileReader {
    
    public static void main(String args []) throws IOException{
        
        salesRepFileReader salesreader = new salesRepFileReader();
        List<salesRep> reps = salesreader.readSalesRep("Sales_Reps.txt");
        System.out.println(reps);

    }

    public List<salesRep> readSalesRep(String filename) throws IOException {
        
        File f = new File(filename);
        FileReader reader = new FileReader(f);
        BufferedReader breader = new BufferedReader(reader);
        
        List<salesRep> reps = new ArrayList<salesRep>();
        
        String line = breader.readLine();
        while (line !=null)
        {
            salesRep s = null;
            try{
                s = parseLine(line);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            
            if (s == null)
            {
                System.out.println("Bad format in row number: "+line);
            }else
            {
                reps.add(s);
            }
            line = breader.readLine();
        }
        return reps;
    }

    private salesRep parseLine(String line) {
      
        String  idNumber;
        String  firstName;
        String  lastName;
        String  officeSupplies;
        String  books;
        String  paper;
        String  totalSold;
        String  districtSelect;
        String  contactSelect;
        
        StringTokenizer st = new StringTokenizer(line, ",");
        idNumber        = st.nextToken().trim();
        firstName       = st.nextToken().trim();
        lastName        = st.nextToken().trim();
        officeSupplies  = st.nextToken().trim();
        books           = st.nextToken().trim();
        paper           = st.nextToken().trim();
        totalSold       = st.nextToken().trim();
        districtSelect  = st.nextToken().trim();
        contactSelect   = st.nextToken().trim();
        if (idNumber.length() == 0)
        {
            return null;
        }
        if (firstName.length() == 0)
        {
            return null;
        }
        if (lastName.length() == 0)
        {
            return null;
        }
        if (officeSupplies.length() == 0)
        {
            return null;
        }
        if (books.length() == 0)
        {
            return null;
        }
        if (paper.length() == 0)
        {
            return null;
        }
        if (totalSold.length() == 0)
        {
            return null;
        }
        if (districtSelect.length() == 0)
        {
            return null;
        }
        if (contactSelect.length() == 0)
        {
            return null;
        }
        
        salesRep s = new salesRep();
        
        s.setIdNumber(idNumber);
        s.setSalesRepFirstName(firstName);
        s.setSalesRepLastName(lastName);
        s.setOfficeSupplies(officeSupplies);
        s.setBooks(books);
        s.setPaper(paper);
        s.setTotalSold(totalSold);
        s.setDistrictSelect(districtSelect);
        s.setContactSelect(contactSelect);
        return s;
    }
    
}
