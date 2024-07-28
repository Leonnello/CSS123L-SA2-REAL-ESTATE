/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLibs.Search;
import MyLibs.*;
import java.util.List;

/**
 *
 * @author Luis
 */
public abstract class LotSearchDecorator implements Search {
    protected Search decoratedSearch;

    public LotSearchDecorator(Search decoratedSearch) {
        this.decoratedSearch = decoratedSearch;
    }

    @Override
    public List<Lot> search(List<Lot> lots) {
        return decoratedSearch.search(lots);
    }
}
