package com.basics;

public class ShadowingInFunctions {
    static int global_var=100;
    public static void main(String[] args) {
        System.out.println("Global without Change: "+global_var);
        global_var=50;//Global Variable is Shadowed
        System.out.println("Global with Change: "+global_var);
    }
}
