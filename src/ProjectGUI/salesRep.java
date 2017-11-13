
package ProjectGUI;

/**
 *Ryan Norton
 * Intermediate Java II - Unit 5 IP
 * Instructor - Anthony Lowe
 * November 7, 2017
 * 
 * 
 */

//Sales  Representative Class

public class salesRep {

    private String idNumber;
    private String salesRepFirstName;
    private String salesRepLastName;
    private String officeSupplies;
    private String books;
    private String paper;
    private String districtSelect;
    private String contactSelect;
   
    
    //id GetSet
    public String getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    
    //First Name GetSet
    public String getSalesRepFirstName() {
        return salesRepFirstName;
    }
    public void setSalesRepFirstName(String salesRepFirstName) {
        this.salesRepFirstName = salesRepFirstName;
    }
    
    //Last Name GetSet
    public String getSalesRepLastName() {
        return salesRepLastName;
    }
    public void setSalesRepLastName(String salesRepLastName) {
        this.salesRepLastName = salesRepLastName;
    }
    
    //Office Supplies GetSet
    public String getOfficeSupplies() {
        return officeSupplies;
    }
    public void setOfficeSupplies(String officeSupplies) {
        this.officeSupplies = officeSupplies;
    }
    
    //Books GetSet
    public String getBooks() {
        return books;
    }
    public void setBooks(String books) {
        this.books = books;
    }
    
    //Paper GetSet
    public String getPaper() {
        return paper;
    }
    public void setPaper(String paper) {
        this.paper = paper;
    }
        
    //District GetSet
    public String getDistrictSelect() {
        return districtSelect;
    }
    public void setDistrictSelect(String districtSelect) {
        this.districtSelect = districtSelect;
    }
    
    //Contact GetSet
    public String getContactSelect() {
        return contactSelect;
    }
    public void setContactSelect(String contactSelect) {
        this.contactSelect = contactSelect;
    }

    @Override
    public String toString() {
        return "SALES REP{ ID=" +idNumber 
                +"\nFIRSTNAME="+ salesRepFirstName
                +"\nLASTNAME="+ salesRepLastName 
                +"\n SUPPLIES="+ officeSupplies 
                +"\n BOOKS="+ books 
                +"\n PAPER="+ paper  
                +"\n DISTRICT="+ districtSelect 
               +"\n CONTACT="+ contactSelect +'}'
                +"\n------------------------";
    }



   


}