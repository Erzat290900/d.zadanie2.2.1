package com.company;

public class Main {

    public static void main(String[] args) {

        creatObject("Cat").print();
        System.out.println("---------------------");
        creatObject("Dog").print();
        System.out.println("---------------------");
        creatObject("Horse").print();
    }

    public static Printable creatObject(String name) {
        Printable result = null;
        switch (name) {
            case "Cat":
                result = new Cat("Mysha", 5, "blue");
                break;

            case "Dog":
                result = new Dog("Alabai", 4, "black");
                break;

            case "Horse":
                result = new Horse("Скакун", 6, "white");
                break;
            default:
                return result;
        }
        return result;
    }

}
