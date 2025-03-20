package edu.estatuas;

public class Bid implements Offer{

        private String size;
        private Integer bid;

        Bid(String size, Integer bid) {
            this.size = size;
            this.bid = bid;
        }
        public String getSize() {
            return this.size;
        }







}
