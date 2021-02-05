package com.company;

public class Horse extends Animal {
    private String typeHorse;

    public Horse(String name, int age, String color) {
        super(age, color);
        this.typeHorse = name;
    }

    public void setTypeHorse(String typeHorse) {
        this.typeHorse = typeHorse;
    }

    public String getTypeHorse() {
        return typeHorse;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("тип лошадь " + typeHorse + "\nвозраст " + getAge() + "\nцвет " + getColor());

    }
}
