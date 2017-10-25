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
 *
 * @author ryanalena
 */
public class MainWriteFile {
  
 public void writeSalesRep(salesRep s) throws IOException{
     
     File txtWriter = new File ("Sales_Reps.txt");
     BufferedWriter out = new BufferedWriter(new FileWriter(txtWriter, true));
 }
    
}
