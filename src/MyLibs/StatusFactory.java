package MyLibs;

public class StatusFactory {
    public Status createStatus(int comboIndex) {
        switch (comboIndex) {
            case 0: return new StatusForSale();
            case 1: return new StatusReserved();
            case 2: return new StatusPurchased();
            default: throw new IllegalArgumentException("Unknown Status...");
        }
    }
}
