package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria{

    public Criteria criteria = null;
    public Criteria secondCriteria = null;

    AndCriteria(Criteria criteria, Criteria secondCriteria){
        this.criteria = criteria;
        this.secondCriteria = secondCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> firstCriteriaItems = criteria.checkCriteria(sneaker);
        List<Offer> otherCriteriaItems = secondCriteria.checkCriteria(sneaker);

        List<Offer> items = new ArrayList<Offer>();
        for (Offer offer : firstCriteriaItems) {
            if (otherCriteriaItems.contains(offer)) {
                items.add(offer);
            }

        }
        return items;
    }
}
