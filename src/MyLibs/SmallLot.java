/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs;

/**
 *
 * @author Luis
 */

public class SmallLot implements Lot {
    String lotNumber;
    Block block;
    double lotSize;
    double lotPrice;
    Status lotStatus;

    @Override
    public String getLotNumber() {
        return lotNumber;
    }

    @Override
    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    @Override
    public Block getBlockNum() {
        return block;
    }

    @Override
    public void setBlockNum(Block block) {
        this.block = block;
    }

    @Override
    public double getLotSize() {
        return lotSize;
    }

    @Override
    public void setLotSize(double lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getLotPrice() {
        return lotPrice;
    }

    @Override
    public void setLotPrice(double lotPrice) {
        this.lotPrice = lotPrice;
    }

    @Override
    public Status getLotStatus() {
        return lotStatus;
    }

    @Override
    public void setLotStatus(Status lotStatus) {
        this.lotStatus = lotStatus;
    }

}

