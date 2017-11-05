
package ProjectGUI;

/**
 *
 *salesRep class
 */
public class salesRep {

    private String idNumber;
    private String salesRepFirstName;
    private String salesRepLastName;
    private String officeSupplies;
    private String books;
    private String paper;
    private String totalSold;
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
    
    //Total Sold GetSet

    public String getTotalSold() {
        return totalSold;
    }
    public void setTotalSold(String totalSold) {
        this.totalSold = totalSold;
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
        return "SALES REP{ " +idNumber 
                +"\n "+ salesRepFirstName
                +"\n "+ salesRepLastName 
                +"\n "+ officeSupplies 
                +"\n "+ books 
                +"\n "+ paper  
                +"\n "+ totalSold
                +"\n "+ districtSelect 
               +"\n "+ contactSelect +'}'
                +"\n------------------------";
    }



   


}