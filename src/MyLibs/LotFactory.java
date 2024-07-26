package MyLibs;

public class LotFactory {
    public Lot createLot(double lotSize) {
        if (lotSize <= 500) {
            return new SmallLot();
        } else if (lotSize >= 1000) {
            return new LargeLot();
        } else {
            return new MediumLot();
        }
    }
}
