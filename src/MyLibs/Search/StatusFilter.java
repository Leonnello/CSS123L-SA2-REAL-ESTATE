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
public class StatusFilter extends LotSearchDecorator {
    private String statusName;

    public StatusFilter(Search decoratedSearch, String statusName) {
        super(decoratedSearch);
        this.statusName = statusName;
    }

    @Override
    public List<Lot> search(List<Lot> lots) {
        return super.search(lots).stream()
                .filter(lot -> lot.getLotStatus().toString().equals(statusName))
                .collect(Collectors.toList());
    }
}
