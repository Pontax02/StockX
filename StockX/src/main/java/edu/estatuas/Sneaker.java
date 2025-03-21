package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item  {
    public  String style;
    public  String name;
    public int bid;
    public int ask;
    public int sale;

    public List<Offer> offers = new ArrayList<>();
    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;

    }
    @Override
    public void add(Offer offers){
        this.offers.add(offers);
    }
    @Override
    public List<Offer> offers(){

        return offers;
    }


    public void setBid(int bid){
        this.bid = bid;
    }
    public void setAsk(int ask){
        this.ask = ask;
    }


    public String getStyle(){
        return this.style;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public int getAsk(){
        return this.ask;
    }
    @Override
    public int getBid(){
        return this.bid;
    }
    @Override
    public int getSale(){
        return this.sale;
    }



    @Override
    public String toString() {
        return this.getName() + " \n" + this.getStyle() + this.offers();

    }
}
