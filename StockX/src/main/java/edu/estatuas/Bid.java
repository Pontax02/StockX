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
            return this.bid;
        }
        @Override
        public String toString() {
            return "test";
        }







}
