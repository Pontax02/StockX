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

        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        System.out.println(Stockx.draw(sneaker));



    public String draw(Sneaker sneaker) {
        return
                "\n\n\t\t" + 0 + " Buy\t"
                        + 0 + " Sell \n" +

                        "\t\t" + " _    _" + "\n" +
                        "\t\t" + "(_\\__/(,_" + "\n" +
                        "\t\t" + "| \\ `_////-._" + "\n" +
                        "\t\t" + "J_/___\"=> __/`\\" + "\n" +
                        "\t\t" + "|=====;__/___./" + "\n" +
                        "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +

                        "\t" + sneaker.toString() + "\n" +
                        "\t\tlast sale: " + 0;
    }
}

