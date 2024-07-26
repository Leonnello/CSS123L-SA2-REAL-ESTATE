package MyLibs;

public class StatusForSale implements Status {
    private Date startSaleDate;
    private String statusName = "For Sale";


    public Date getStartSaleDate() {
        return startSaleDate;
    }

    public void setStartSaleDate(Date startSaleDate) {
        this.startSaleDate = startSaleDate;
    }

    @Override
    public String toString() {
        return statusName; 
    }
}