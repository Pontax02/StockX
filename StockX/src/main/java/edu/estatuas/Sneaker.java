package edu.estatuas;

public class Sneaker {
    public final String style;
    public final String name;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;

    }

    private String getStyle(){
        return style;
    }
    private String getName(){
        return name;
    }
    @Override
    public String toString() {
        return getName() + " \n" + getStyle();

    }
}
