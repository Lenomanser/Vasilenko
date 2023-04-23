package org.example;

public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    //                                 Конструкторы
    Animal() {
    }

    Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    //                                Гетеры и сетеры
    public void SetVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void SetVegetarian(String eats) {
        this.eats = eats;
    }

    public void SetVegetarian(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean GetVegetarian() {
        return vegetarian;
    }

    public String GetEats() {
        return eats;
    }

    public int GetNOfLegs() {
        return noOfLegs;
    }

}
