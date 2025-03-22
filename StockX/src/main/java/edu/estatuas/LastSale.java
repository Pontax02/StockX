package edu.estatuas;

import java.util.List;
import java.util.Optional;

public class LastSale implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker){
        Optional<Offer> last = sneaker.offers()
                .stream()
                .filter(o -> o instanceof Sale)
                .reduce((firstSale, lastSale) -> lastSale);


        return last.map(List::of).orElseGet(List::of);

    }
}
