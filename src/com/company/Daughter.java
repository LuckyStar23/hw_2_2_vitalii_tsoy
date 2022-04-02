package com.company;

public class Daughter extends Father implements Printable{
    String job;
    boolean brackets;

    public Daughter(String job, boolean brackets,  int age,  String name) {
        this.job = job;
        this.brackets = brackets;
        this.age = age;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println( job );
        System.out.println(brackets);
        System.out.println(name);
        System.out.println(age);
    }
}
