package com.basics;

public class FunctionsDemo {
    public static void main(String[] args) {
        sum(10,20);
        String name="Kunal";
        changeName(name);
        System.out.println(name);
    }
    static void sum(int a,int b){
        System.out.println("Sum is " + (a+b));
    }

    static void changeName(String myName){
        myName="Arjun";
    }
}
