package edu.estatuas;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria{





    @Override
    public List<Offer> checkCriteria(Item sneaker){
            return sneaker.offers()
                    .stream()
                    .filter(o -> o instanceof Ask)
                    .collect(Collectors.toList());


    }
}
