package MyLibs;

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
    
    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
    }

    @Override
    public String toString() {
        return statusName;
    }

}
