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
public class SizeFilter extends LotSearchDecorator {
    private double minSize;
    private double maxSize;

    public SizeFilter(Search decoratedSearch, double minSize, double maxSize) {
        super(decoratedSearch);
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    @Override
    public List<Lot> search(List<Lot> lots) {
        return super.search(lots).stream()
                .filter(lot -> lot.getLotSize() >= minSize && lot.getLotSize() <= maxSize)
                .collect(Collectors.toList());
    }
}
