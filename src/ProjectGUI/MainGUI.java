
package ProjectGUI;


import java.util.List;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *Ryan Norton
 * Intermediate Java II - Unit 1 IP
 * Instructor Anthony Lowe
 * October 14, 2017
 */
public class MainGUI extends javax.swing.JFrame {

//Creates form MainGUI
    public MainGUI() {
        initComponents();
        
        //error Messages hidden until 
        //needed in validation
        idERROR.setVisible(false);
        firstNameERROR.setVisible(false);
        lastNameERROR.setVisible(false);
        officeSuppliesERROR.setVisible(false);
        booksERROR.setVisible(false);
        paperERROR.setVisible(false);
        districtERROR.setVisible(false);
        contactERROR.setVisible(false);
        enterConfirmLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        districtButtonGroup = new javax.swing.ButtonGroup();
        contactButtonGroup = new javax.swing.ButtonGroup();
        salesRepLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        totalSoldLabel = new javax.swing.JLabel();
        officeSuppliesLabel = new javax.swing.JLabel();
        paperLabel = new javax.swing.JLabel();
        booksLabel = new javax.swing.JLabel();
        booksTextField = new javax.swing.JTextField();
        paperTextField = new javax.swing.JTextField();
        officeSuppliesTextField = new javax.swing.JTextField();
        DistrictLabel = new javax.swing.JLabel();
        contactPreferenceLabel = new javax.swing.JLabel();
        northRadioButton = new javax.swing.JRadioButton();
        eastRadioButton = new javax.swing.JRadioButton();
        southRadioButton = new javax.swing.JRadioButton();
        westRadioButton = new javax.swing.JRadioButton();
        exitButton = new javax.swing.JButton();
        enterButton = new javax.swing.JButton();
        phoneRadioButton = new javax.swing.JRadioButton();
        emailRadioButton = new javax.swing.JRadioButton();
        visitRadioButton = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        idERROR = new javax.swing.JLabel();
        firstNameERROR = new javax.swing.JLabel();
        lastNameERROR = new javax.swing.JLabel();
        officeSuppliesERROR = new javax.swing.JLabel();
        booksERROR = new javax.swing.JLabel();
        paperERROR = new javax.swing.JLabel();
        districtERROR = new javax.swing.JLabel();
        contactERROR = new javax.swing.JLabel();
        enterConfirmLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesRepOutput = new javax.swing.JTextArea();
        showButton = new javax.swing.JButton();
        evaluateButton = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(50, 50, 50, 50));

        salesRepLabel.setText("Sales Rep");

        idLabel.setText("ID");

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        totalSoldLabel.setText("Total Sold");

        officeSuppliesLabel.setText("Office Supplies");

        paperLabel.setText("Paper");

        booksLabel.setText("Books");

        DistrictLabel.setText("District");

        contactPreferenceLabel.setText("ContactPreference");

        districtButtonGroup.add(northRadioButton);
        northRadioButton.setText("North");

        districtButtonGroup.add(eastRadioButton);
        eastRadioButton.setText("East");

        districtButtonGroup.add(southRadioButton);
        southRadioButton.setText("South");

        districtButtonGroup.add(westRadioButton);
        westRadioButton.setText("West");

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        contactButtonGroup.add(phoneRadioButton);
        phoneRadioButton.setText("Phone");

        contactButtonGroup.add(emailRadioButton);
        emailRadioButton.setText("Email");

        contactButtonGroup.add(visitRadioButton);
        visitRadioButton.setText("Visit");

        idERROR.setForeground(new java.awt.Color(255, 0, 0));
        idERROR.setText("ID must be given as an integer.");

        firstNameERROR.setForeground(new java.awt.Color(255, 0, 0));
        firstNameERROR.setText("First name is required.");

        lastNameERROR.setForeground(new java.awt.Color(255, 0, 0));
        lastNameERROR.setText("Last name is required.");

        officeSuppliesERROR.setForeground(new java.awt.Color(255, 0, 0));
        officeSuppliesERROR.setText("You must provide the amount sold as an integer.");

        booksERROR.setForeground(new java.awt.Color(255, 0, 0));
        booksERROR.setText("You must provide the amount sold as an integer.");

        paperERROR.setForeground(new java.awt.Color(255, 0, 0));
        paperERROR.setText("You must provide the amount sold as an integer.");

        districtERROR.setForeground(new java.awt.Color(255, 0, 0));
        districtERROR.setText("A district must be selected.");

        contactERROR.setForeground(new java.awt.Color(255, 0, 0));
        contactERROR.setText("Please choose a contact method.");

        enterConfirmLabel.setForeground(new java.awt.Color(0, 153, 51));
        enterConfirmLabel.setText("Saved to File!");

        salesRepOutput.setEditable(false);
        salesRepOutput.setColumns(20);
        salesRepOutput.setRows(5);
        jScrollPane1.setViewportView(salesRepOutput);

        showButton.setText("Show");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });

        evaluateButton.setText("Evaluate");
        evaluateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(contactPreferenceLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(phoneRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(emailRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(visitRadioButton)))
                            .addComponent(contactERROR))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(enterButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterConfirmLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(evaluateButton)
                                    .addComponent(showButton))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(officeSuppliesLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(paperLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(booksLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(salesRepLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firstNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(totalSoldLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(booksTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paperTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(officeSuppliesTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idERROR)
                                    .addComponent(firstNameERROR)
                                    .addComponent(booksERROR)
                                    .addComponent(paperERROR)
                                    .addComponent(officeSuppliesERROR)
                                    .addComponent(lastNameERROR)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DistrictLabel)
                                        .addGap(43, 43, 43)
                                        .addComponent(districtERROR))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(northRadioButton)
                                            .addComponent(eastRadioButton))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(southRadioButton)
                                            .addComponent(westRadioButton)))))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                                .addComponent(jSeparator3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {firstNameField, idField, lastNameField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salesRepLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idERROR))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameERROR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lastNameERROR))
                            .addComponent(lastNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(totalSoldLabel)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(officeSuppliesLabel)
                            .addComponent(officeSuppliesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(officeSuppliesERROR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(booksLabel)
                            .addComponent(booksTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(booksERROR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paperLabel)
                            .addComponent(paperTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paperERROR))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DistrictLabel)
                            .addComponent(districtERROR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(northRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eastRadioButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(southRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(westRadioButton)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contactPreferenceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneRadioButton)
                            .addComponent(emailRadioButton)
                            .addComponent(visitRadioButton)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(contactERROR))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(evaluateButton)
                            .addGap(2, 2, 2)
                            .addComponent(showButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(exitButton)
                                .addComponent(enterButton)
                                .addComponent(enterConfirmLabel)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed
//EXIT button action
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed
//SHOW button action
    private void showButtonActionPerformed(java.awt.event.ActionEvent evt){
        salesRepOutput.setText("");
        salesRepFileReader filereader = new salesRepFileReader();
        try
        {
            List<salesRep> reps = filereader.readSalesRep("Sales_Reps.txt");
            for (salesRep s : reps)
            {
                salesRepOutput.append(s.toString());
                salesRepOutput.append("\n");
            }
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(this, "Error in opening File");
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void evaluateButtonActionPerformed(java.awt.event.ActionEvent evt){
//        salesRepOutput.setText("");
//            salesRepFileReader reader = new salesRepFileReader();
//            try
//            {
//                List<salesRep> reps = reader.readReps("Sales_Reps.txt");
//                bonusReps breps = new bonusReps;
//                salesRepOutput.append(breps.findBonus(reps).toString();
//            } catch (IOException ex){
//                JOptionPane.showMessageDialog(this, "File ERROR");
//            }
    }
//ENTER button actions
    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
            boolean IDinfoProvided;
            boolean FNinfoProvided;
            boolean LNinfoProvided;
            boolean OSinfoProvided;
            boolean BinfoProvided;
            boolean PinfoProvided;
            boolean DinfoProvided;
            boolean CinfoProvided;
            
            salesRep s = new salesRep();
    //##############Sales Rep######################

    //ID field validation
            String repID= idField.getText();
        //ignore any non-number input
            repID= repID.replaceAll("[^\\d.]", "");

        //validate user input
            if(repID.trim().length()==0){
                    idERROR.setVisible(true);
                    idERROR.setText("You must provide an ID as INTEGER.");
                    IDinfoProvided = false;
                    enterConfirmLabel.setVisible(false);
            }else{
        //add to object
                s.setIdNumber(repID.trim());
                
                idERROR.setVisible(false);
                IDinfoProvided=true;
                 }

        //basic input - First Name Verification
            String firstName=firstNameField.getText();
        //ignore any number input
            firstName = firstName.replaceAll("\\d","");

            if (firstName.trim().length()==0){
                firstNameERROR.setVisible(true);
                enterConfirmLabel.setVisible(false);
                firstNameERROR.setText("You must provide a first name. Numbers are ignored!");
                FNinfoProvided = false;
            }else{
                firstNameERROR.setVisible(false);
        //added to object
                s.setSalesRepFirstName(firstName.trim());

                FNinfoProvided = true;
            }        

    //basic input - Last Name verification
            String lastName=lastNameField.getText();
        //ignore any numbers input
            lastName= lastName.replaceAll("\\d","");

            if (lastName.trim().length()==0 || lastName.equals(firstName)){
                lastNameERROR.setVisible(true);
                enterConfirmLabel.setVisible(false);
                lastNameERROR.setText("You must provide a different last name! Numbers are ignored!");
                LNinfoProvided = false;
            }else {

                lastNameERROR.setVisible(false);
        //assigned to salesRep object
                s.setSalesRepLastName(lastName.trim());
                LNinfoProvided = true;
            }


    //################## Total Sold##########################
    //basic input - Office Supplies
        String officeTotal= officeSuppliesTextField.getText();

            if(officeTotal.trim().length()==0){
                    officeSuppliesERROR.setVisible(true);
                    enterConfirmLabel.setVisible(false);
                    officeSuppliesERROR.setText("Please provide the amount of OS sold in a decimal");
                    OSinfoProvided = false;
            }else{
                officeSuppliesERROR.setVisible(false);
                OSinfoProvided=true;
            //set to object
            s.setOfficeSupplies(officeTotal.trim());
                 }
            //Validate int datatype
            try{
                double id = Double.parseDouble(officeTotal);
                s.setOfficeSupplies(officeTotal.trim());
            }catch(NumberFormatException e){
                officeSuppliesERROR.setVisible(true);
                enterConfirmLabel.setVisible(false);
                officeSuppliesERROR.setText("Please provide the amount of OS sold in a decimal");
                OSinfoProvided = false;
            }
    //basic input - Books
        String booksTotal= booksTextField.getText();

            if(booksTotal.trim().length()==0){
                    booksERROR.setVisible(true);
                    enterConfirmLabel.setVisible(false);
                    booksERROR.setText("Please provide the amount of books sold in a decimal");
                    BinfoProvided = false;
            }else{
                s.setBooks(booksTotal.trim());
                booksERROR.setVisible(false);
                BinfoProvided=true;
                 }
            //Validate int datatype
            try{
                double id = Double.parseDouble(booksTotal);
                s.setBooks(booksTotal.trim());
            }catch(NumberFormatException e){
                booksERROR.setVisible(true);
                enterConfirmLabel.setVisible(false);
                booksERROR.setText("Please provide the amount of books sold in a decimal");
                BinfoProvided = false;
            }
    //basic input - Paper
        String paperTotal= paperTextField.getText();
            //validate input of data
            if(paperTotal.trim().length()==0){
                    paperERROR.setVisible(true);
                    enterConfirmLabel.setVisible(false);
                    paperERROR.setText("Please provide the amount of paper sold in a decimal");
                    PinfoProvided = false;
            }else{
                s.setPaper(paperTotal.trim());
                paperERROR.setVisible(false);
                PinfoProvided=true;
                 }

            try{//Validate int datatype
                double id = Double.parseDouble(paperTotal);
                 s.setPaper(paperTotal.trim());
            }catch(NumberFormatException e){
                paperERROR.setVisible(true);
                enterConfirmLabel.setVisible(false);
                paperERROR.setText("Please provide the amount of paper sold in a decimal");
                PinfoProvided = false;
            }
            



    //##############RADIO BUTTONS######################
        String districtSelect = new String();

            if (northRadioButton.isSelected())
            {   districtSelect= "NORTH";
                districtSelect.toString();
                districtERROR.setVisible(false);
                s.setDistrictSelect(districtSelect);
                DinfoProvided=true;
        //if North is selected
            }else if (eastRadioButton.isSelected()){
                districtSelect= "EAST";
                districtSelect.toString();
                s.setDistrictSelect(districtSelect);
                districtERROR.setVisible(false);

                DinfoProvided=true;
        //if South is selected
            }else if(southRadioButton.isSelected()){
                districtSelect= "SOUTH";
                districtSelect.toString();
                s.setDistrictSelect(districtSelect);
                districtERROR.setVisible(false);

                DinfoProvided=true;
        //if west is selected
            }else if(westRadioButton.isSelected()){
                districtSelect= "WEST";
                districtSelect.toString();
                s.setDistrictSelect(districtSelect);
                districtERROR.setVisible(false);

                DinfoProvided=true;
        //if no region is selected    
            }else{   
            districtERROR.setVisible(true);
            enterConfirmLabel.setVisible(false);
            districtERROR.setText("Please choose a district!");   
            DinfoProvided = false;
            }

            
    //###################Contact Select#######################
            String contactSelect = new String();
        //if Phone is selected
            if (phoneRadioButton.isSelected())
            {   contactSelect= "Phone";
                contactSelect.toString();
                s.setContactSelect(contactSelect);
                contactERROR.setVisible(false);
                CinfoProvided=true;
    //if email is selected  
            }else if (emailRadioButton.isSelected()){
                contactSelect= "Email";
                contactSelect.toString();
                s.setContactSelect(contactSelect);
                contactERROR.setVisible(false);
                CinfoProvided=true;
    //if a Visit is chosen
            }else if(visitRadioButton.isSelected()){
                contactSelect= "Visit";
                contactSelect.toString();
                s.setContactSelect(contactSelect);
                contactERROR.setVisible(false);
                CinfoProvided=true;

            //if no region is selected    
            }else{   
            contactERROR.setVisible(true);
            enterConfirmLabel.setVisible(false);
            contactERROR.setText("Please choose Contact Preference!"); 
            CinfoProvided = false;
            } 
           
    //verify completion of all fields
            if (IDinfoProvided && FNinfoProvided && LNinfoProvided &&
                OSinfoProvided && BinfoProvided && PinfoProvided && 
                DinfoProvided && CinfoProvided)
            {
        //##########totalSold######################
            String totalSold;
            int totalInt; int officeInt; int booksInt; int paperInt;
            
            officeInt = Integer.parseInt(officeTotal);
            booksInt =Integer.parseInt(booksTotal);
            paperInt = Integer.parseInt(paperTotal);
            totalInt=officeInt + booksInt + paperInt;
            
            totalSold = Integer.toString(totalInt);
            s.setTotalSold(totalSold);
            
        //write user input to Sales_Reps.txt
                try { 
                    salesRepFileWriter RFW = new salesRepFileWriter();
                    RFW.writeRep(s);
                    enterConfirmLabel.setVisible(true);
                    
                    idField.setText("");
                    firstNameField.setText("");
                    lastNameField.setText("");
                    officeSuppliesTextField.setText("");
                    booksTextField.setText("");
                    paperTextField.setText("");
                    districtButtonGroup.clearSelection();
                    contactButtonGroup.clearSelection();

                    } catch (IOException ex){
                        JOptionPane.showMessageDialog(this, "File Error");
                        Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

        }else{ IDinfoProvided   =false; idERROR.setVisible(true);
                FNinfoProvided  =false; firstNameERROR.setVisible(true);
                LNinfoProvided  =false; lastNameERROR.setVisible(true);
                OSinfoProvided  =false; officeSuppliesERROR.setVisible(true);
                BinfoProvided   =false; booksERROR.setVisible(true);
                PinfoProvided   =false; paperERROR.setVisible(true);
                DinfoProvided   =false; districtERROR.setVisible(true);
                CinfoProvided   =false; contactERROR.setVisible(true);
                
            } 
    }//GEN-LAST:event_enterButtonActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DistrictLabel;
    private javax.swing.JLabel booksERROR;
    private javax.swing.JLabel booksLabel;
    private javax.swing.JTextField booksTextField;
    private javax.swing.ButtonGroup contactButtonGroup;
    private javax.swing.JLabel contactERROR;
    private javax.swing.JLabel contactPreferenceLabel;
    private javax.swing.ButtonGroup districtButtonGroup;
    private javax.swing.JLabel districtERROR;
    private javax.swing.JRadioButton eastRadioButton;
    private javax.swing.JRadioButton emailRadioButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel enterConfirmLabel;
    private javax.swing.JButton evaluateButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel firstNameERROR;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel idERROR;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lastNameERROR;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JRadioButton northRadioButton;
    private javax.swing.JLabel officeSuppliesERROR;
    private javax.swing.JLabel officeSuppliesLabel;
    private javax.swing.JTextField officeSuppliesTextField;
    private javax.swing.JLabel paperERROR;
    private javax.swing.JLabel paperLabel;
    private javax.swing.JTextField paperTextField;
    private javax.swing.JRadioButton phoneRadioButton;
    private javax.swing.JLabel salesRepLabel;
    private javax.swing.JTextArea salesRepOutput;
    private javax.swing.JButton showButton;
    private javax.swing.JRadioButton southRadioButton;
    private javax.swing.JLabel totalSoldLabel;
    private javax.swing.JRadioButton visitRadioButton;
    private javax.swing.JRadioButton westRadioButton;
    // End of variables declaration//GEN-END:variables
}
