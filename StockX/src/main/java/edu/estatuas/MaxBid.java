package edu.estatuas;

import java.util.List;
import java.util.Optional;


public class MaxBid implements Criteria {




    @Override
    public List<Offer> checkCriteria(Item sneaker){
        Optional<Offer> max = sneaker.offers()
                .stream()
                .filter(o -> o instanceof Bid)
                .max(Offer::compareTo);

        return max.map(List::of).orElseGet(List::of);

    }
}
