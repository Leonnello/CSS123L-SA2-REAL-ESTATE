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
public class PriceFilter extends LotSearchDecorator {
    private double minPrice;
    private double maxPrice;

    public PriceFilter(Search decoratedSearch, double minPrice, double maxPrice) {
        super(decoratedSearch);
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public List<Lot> search(List<Lot> lots) {
        return super.search(lots).stream()
                .filter(lot -> lot.getLotPrice() >= minPrice && lot.getLotPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}
