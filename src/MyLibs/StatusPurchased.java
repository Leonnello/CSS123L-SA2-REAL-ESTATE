package MyLibs;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StatusPurchased implements Status {
    private String purchaserName;
    private Date purchaseDate;
    private String statusName = "Purchased";

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }
        public String formatDate() { 
        DateFormat dateOutput = new SimpleDateFormat("yyyy-MM-dd");
        return dateOutput.format(purchaseDate);
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
    @Override
    public String toString() {
        return statusName;
    }
}
