package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("son").print();
        createObject("daughter").print();
        createObject("secondSon").print();

    }


    static Printable createObject(String className) {
        Son son = new Son(2, "flying", 23, "Arthur" );
        Daughter daughter = new Daughter("operator",  true, 18, "Jinny");
        SecondSon secondSon = new SecondSon(4,false, 32, "Mike");

        switch (className) {
            case "daughter" -> {
                return daughter;
            }
            case "secondSon" -> {
                return secondSon;
            }
            default -> {
                return son;
            }
        }
    }
}
