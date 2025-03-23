package edu.estatuas;

import java.util.List;
import java.util.stream.Collectors;

public class Size implements Criteria{

    public String size;

    Size(String size){
        this.size=size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(o -> o.size() == size )
                .collect(Collectors.toList());

    }

}
