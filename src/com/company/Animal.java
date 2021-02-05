package com.company;

public class Animal implements Printable {
    private int age;
    private String color;

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getInfo() {
        return "\n" + age + "\n" + color;
    }

    @Override
    public void print() {

    }
}
