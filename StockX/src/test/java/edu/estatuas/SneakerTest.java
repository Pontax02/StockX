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


}
