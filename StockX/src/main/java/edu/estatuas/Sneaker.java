package edu.estatuas;

public class Sneaker implements Item {
    public final String style;
    public final String name;
    public int bid;
    public int ask;
    public int sale;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;

    }

    private String getStyle(){
        return this.style;
    }
    private String getName(){
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
        return this.getName() + " \n" + this.getStyle();

    }
}
