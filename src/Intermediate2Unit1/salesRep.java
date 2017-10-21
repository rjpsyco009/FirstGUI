
package Intermediate2Unit1;

/**
 *
 *salesRep class
 */
public class salesRep {
    private String salesRepFirstName;
    private String salesRepLastName;
    private String idNumber;
    private String districtSelect;
    private String contactSelect;

    

    public String getSalesRepFirstName() {
        return salesRepFirstName;
    }
    public void setSalesRepFirstName(String salesRepFirstName) {
        this.salesRepFirstName = salesRepFirstName;
    }
    
    public String getSalesRepLastName() {
        return salesRepLastName;
    }
    public void setSalesRepLastName(String salesRepLastName) {
        this.salesRepLastName = salesRepLastName;
    }

    public String getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public String getDistrictSelect() {
        return districtSelect;
    }
    public void setDistrictSelect(String districtSelect) {
        this.districtSelect = districtSelect;
    }

    public String getContactSelect() {
        return contactSelect;
    }
    public void setContactSelect(String contactSelect) {
        this.contactSelect = contactSelect;
    }
}
