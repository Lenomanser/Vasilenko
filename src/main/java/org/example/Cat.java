package org.example;

public class Cat extends Animal {
    private String color;

    Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        color = "Yelow";
    }

    public void SetColor(String color) {
        this.color = color;
    }

    public String GetColor() {
        return color;
    }

}
