package MyLibs;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StatusForSale implements Status {
    private Date startSaleDate;
    private String statusName = "For Sale";


    public Date getStartSaleDate() {
        return startSaleDate;
    }

    public String formatDate() { 
        DateFormat dateOutput = new SimpleDateFormat("yyyy-MM-dd");
        return dateOutput.format(startSaleDate);
    }

    public void setStartSaleDate(Date startSaleDate) {
        this.startSaleDate = startSaleDate;
    }

    @Override
    public String toString() {
        return statusName; 
    }
}