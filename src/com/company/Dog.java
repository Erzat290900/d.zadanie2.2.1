package com.company;

public class Dog extends Animal {
    public String paroda;

    public Dog(String name, int age, String color) {
        super(age, color);
        this.paroda = name;
    }

    public void setParoda(String paroda) {
        this.paroda = paroda;
    }

    public String getParoda() {
        return paroda;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("парода " + paroda + "\nвозраст " + getAge() + "\nцвет " + getColor());

    }
}
