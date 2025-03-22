package edu.estatuas;

public class Ask implements Offer {

    private String size;
    private Integer ask;
    Ask(String size, Integer bid) {
        this.size = size;
        this.ask = bid;
    }
    @Override
    public String size() {
        return this.size;
    }
    @Override
    public int value(){
        return this.ask;
    }
    @Override
    public int compareTo(Offer ask) {
        return this.ask.compareTo(ask.value());
    }
    @Override
    public String toString() {
        return " \t"+this.size() + "\t\t\t" + this.value() + " \n";
    }
}
