package MyLibs;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StatusReserved implements Status {
    private String reserveeName;
    private Date reserveDate;
    private String statusName = "Reserved";

    public String getReserveeName() {
        return reserveeName;
    }
    
    public void setReserveeName(String reserveeName) {
        this.reserveeName = reserveeName;
    }
    
    public Date getReserveDate() {
        return reserveDate;
    }

    public String formatDate() { 
        DateFormat dateOutput = new SimpleDateFormat("yyyy-MM-dd");
        return dateOutput.format(reserveDate);
    }
    
    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
    }

    @Override
    public String toString() {
        return statusName;
    }

}
