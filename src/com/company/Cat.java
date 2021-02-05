package com.company;

public class Cat extends Animal {
    private String name;


    public Cat(String name, int age, String color) {
        super(age, color);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("имя " + name + "\nвозраст " + getAge() + "\nцвет " + getColor());
    }
}
