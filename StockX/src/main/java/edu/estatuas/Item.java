package edu.estatuas;

import java.util.List;

public interface Item {
    int getAsk();
    int getBid();
    int getSale();
    void setAsk(int ask);
    void setBid(int bid);
    void add(Offer offers);
    List<Offer> offers();
}
