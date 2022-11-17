package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Canine canine = new Canine(false, "milk", 4, "black");

        System.out.println("Canine is Vegetarian?" + canine.isVegetarian());
        System.out.println("Canine eats " + canine.getEats());
        System.out.println("Canine has " + canine.getNoOfLegs() + " legs.");
        System.out.println("Canine color is " + canine.getColor());
    }
    }

