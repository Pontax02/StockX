package edu.estatuas;


import java.util.List;
import java.util.stream.Collectors;

public class Sales implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(o -> o instanceof Sale)
                .collect(Collectors.toList());
    }
}