package com.company;

public class Canine extends Animal {
    private String color;

    public Canine(boolean veg, String food, int legs) {
        super(veg, food, legs);
        this.color="White";
    }

    public Canine(boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
