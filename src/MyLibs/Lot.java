package MyLibs;

public interface Lot {
    public String getLotNumber();
    public void setLotNumber(String lotNumber);
    public Block getBlockNum();
    public void setBlockNum(Block block);
    public double getLotSize();
    public void setLotSize(double lotSize);
    public double getLotPrice();
    public void setLotPrice(double lotPrice);
    public Status getLotStatus();
    public void setLotStatus(Status lotStatus);
}
