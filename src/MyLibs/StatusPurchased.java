package MyLibs;
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

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
    @Override
    public String toString() {
        return statusName;
    }
}
