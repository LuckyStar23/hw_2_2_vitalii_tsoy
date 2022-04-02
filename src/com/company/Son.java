package com.company;

public class Son extends Father implements Printable{
    int tattoos;
    String dreams;

    public Son(int tattoos, String dreams, int age,  String name) {
        this.tattoos = tattoos;
        this.dreams = dreams;
        this.age = age;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(tattoos);
        System.out.println(dreams);
    }
}
