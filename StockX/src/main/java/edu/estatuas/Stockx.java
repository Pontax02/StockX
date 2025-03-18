package edu.estatuas;




public class Stockx {

    public static void main(String[] args) {

        /**
         * Crear la zapatilla
         * y printar sus datos.
         *
         * Lee la funcion draw() del main
         * para conocer que propiedades
         * de la zapatilla han de printarse.
         */

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        System.out.println(Stockx.draw(sneaker));



    public static String draw(Item sneaker) {
        return
                "\n\n\t\t" + sneaker.getAsk() + " Buy\t"
                        + sneaker.getBid() + " Sell \n" +

                        "\t\t" + " _    _" + "\n" +
                        "\t\t" + "(_\\__/(,_" + "\n" +
                        "\t\t" + "| \\ `_////-._" + "\n" +
                        "\t\t" + "J_/___\"=> __/`\\" + "\n" +
                        "\t\t" + "|=====;__/___./" + "\n" +
                        "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +

                        "\t" + sneaker.toString() + "\n" +
                        "\t\tlast sale: " + sneaker.getSale();
    }
}