package com.company;

public class SecondSon extends Father implements Printable {
    int car;
    boolean gf;

    public SecondSon(int car, boolean gf, int age,  String name) {
        this.car = car;
        this.gf = gf;
        this.age = age;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(car);
        System.out.println(gf);
    }
}
