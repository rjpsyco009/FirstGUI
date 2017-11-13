/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

//Any bonusReps are written to Stars.txt

public class starFileWriter {

    public void writeStar(salesRep s) throws IOException{
        File testWriter = new File ("Stars.txt");
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
