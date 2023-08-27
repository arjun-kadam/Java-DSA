package com.basics;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(12);
        fun("Arjun");
    }
    static void fun(int a){
        System.out.println("I am Integer Function");

    }
    static void fun(String name){
        System.out.println("I am String Function");
    }
}
