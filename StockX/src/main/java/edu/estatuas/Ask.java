package edu.estatuas;

public class Ask implements Offer {

    private String size;
    private Integer bid;
    Ask(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }
    @Override
    public String size() {
        return this.size;
    }
    @Override
    public int value(){
        return this.bid;
    }

    @Override
    public String toString() {
        return " \t"+this.size() + "\t\t\t" + this.value() + " \n";
    }
}
