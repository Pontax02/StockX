package edu.estatuas;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CriteriaTest {


    //AndCriteria TEST
    @Test
    public void andSizeBidCriteriaTest() {

        //ARRANGE
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("9.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("9.5", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("9.5", 1000));
        sneaker.add(new Ask("13", 341));
        assertEquals(8, sneaker.offers().size());

        //ACT
        Criteria size = new Size("9.5");
        Criteria bids = new Bids();

        //ASSERT
        assertEquals(4, bids.checkCriteria(sneaker).size());
        assertEquals(3, size.checkCriteria(sneaker).size());

        Criteria andSizeBids = new AndCriteria(size, bids);
        assertEquals(2, andSizeBids.checkCriteria(sneaker).size());

        assertTrue(andSizeBids.checkCriteria(sneaker).stream().allMatch(o -> o.size().equals("9.5")));
        assertTrue(andSizeBids.checkCriteria(sneaker).stream().allMatch(o -> o instanceof Bid));
    }

    //ASKS TEST

    @Test
    public void checkCriteria_bids_aks_Test() {
        //ARRANGE
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 341));

        //ACT
        Criteria asks = new Asks();
        List<Offer> filteredBids = asks.checkCriteria(sneaker);
        //ASSERT
        assertTrue(filteredBids.stream().allMatch(a -> a instanceof Ask));

        sneaker.setAsk(asks.checkCriteria(sneaker).get(0).value());
        assertEquals(288, sneaker.getAsk());
    }

    @Test
    public void checkCriteria_no_bids_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Criteria asks = new Asks();
        List<Offer> minimum = asks.checkCriteria(sneaker);
        sneaker.setBid(minimum.isEmpty()? 0 : minimum.get(0).value());
        assertEquals(0, sneaker.getAsk());
    }

    //BIDS TEST
    @Test
    public void checkCriteria_bids_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 472));

        Criteria bids = new Bids();

        List<Offer> filteredBids = bids.checkCriteria(sneaker);
        assertTrue(filteredBids.stream().allMatch(b -> b instanceof Bid));

        Optional<Offer> maxOpt = Optional.ofNullable(bids.checkCriteria(sneaker).get(0));
        sneaker.setBid(maxOpt.isPresent() ? maxOpt.get().value() : 0);
        assertEquals(900, sneaker.getBid());
    }




}
