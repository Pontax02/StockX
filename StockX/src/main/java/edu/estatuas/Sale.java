package edu.estatuas;

public class Sale implements Offer{

    public String size;
    public Integer price;

    Sale(String size, Integer price) {
        this.size = size;
        this.price = price;
    }
    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price;
    }

    @Override
    public int compareTo(Offer sale) {
        return this.price.compareTo(sale.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t\t\t" + this.value() +"\n";
    }
}

