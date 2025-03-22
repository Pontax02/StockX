package edu.estatuas;

import java.util.List;
import java.util.Optional;

public class MinAsk implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker){

        Optional<Offer> min = sneaker.offers()
                            .stream()
                            .min(Offer::compareTo);
                return min.isPresent()? List.of(min.get()): List.of();



    }

}
