package edu.estatuas;

public class Bid implements Offer{

        private String size;
        private Integer bid;

        Bid(String size, int bid) {
            this.size = size;
            this.bid = bid;
        }
        @Override
        public String size() {
            return this.size;
        }
        @Override
        public int value(){
            return this.bid.intValue();
        }
        @Override
        public String toString() {
            return "\t" + this.size() +"\t\t\t"+ this.value() + "\n";
        }
         @Override
         public int compareTo(Offer bid) {
         return this.bid.compareTo(bid.value());
    }






}
