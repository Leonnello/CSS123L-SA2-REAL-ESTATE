/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs.Search;

import java.util.List;
import java.util.stream.Collectors;

import MyLibs.Lot;

/**
 *
 * @author Luis
 */
public class BlockFilter extends LotSearchDecorator{
    private String blockNumber;

    public BlockFilter(Search decoratedSearch, String blockNumber) {
        super(decoratedSearch);
        this.blockNumber = blockNumber;
    }

    @Override
    public List<Lot> search(List<Lot> lots) {
        return super.search(lots).stream()
                .filter(lot -> lot.getBlockNum().toString().equals(blockNumber))
                .collect(Collectors.toList());
    }
}
