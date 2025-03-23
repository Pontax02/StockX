package edu.estatuas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Max implements Criteria {

    public Criteria criteria = null;
    public Criteria secondCriteria = null;

    Max(Criteria criteria, Criteria secondCriteria){
        this.criteria = criteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {


        Criteria andCriteria = new AndCriteria(criteria, secondCriteria);
        Optional<Offer> offer = andCriteria.checkCriteria(sneaker)
                .stream()
                .max(Offer::compareTo);
        return offer.isPresent()? List.of(offer.get()) : List.of();

    }
}
