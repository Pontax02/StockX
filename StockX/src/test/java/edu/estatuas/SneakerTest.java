package edu.estatuas;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;


public class SneakerTest {

    private static Sneaker snk;


    @BeforeClass
    public static void setUpClass() {
        snk = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }

    @Test
    public void testSneaker() {

        assertEquals("555088-105",snk.getStyle());
        assertEquals("Jordan 1 Retro High Dark Mocha",snk.getName());

    }
    @Test
    public void addOfferBid() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Bid bid = new Bid("9.5", 282);
        sneaker.add(bid);
        assertEquals(1, sneaker.offers().size());
    }
    @Test
    public void addOfferAsk() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Ask ask = new Ask("15", 288);
        sneaker.add(ask);
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 340));
        sneaker.add(new Ask("13", 341));
        assertEquals(4, sneaker.offers().size());
    }

    @Test
    public void addOffer() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("9.5", 282));
        sneaker.add(new Ask("15", 288));
        Offer ask = new Ask("13", 333);
        sneaker.add(ask);
        assertEquals(3, sneaker.offers().size());
    }


}
