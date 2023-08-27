package com.basics;

public class ScopingInFunctions {
    public static void main(String[] args) {
        int a=10;
        {
            //int a=20;//Error
            a=100;
            int c=20;
            System.out.println("C inside Block is: "+c);

        }
        int c=90;
        System.out.println("C outside Block is: "+c);

    }
    static void demo(){
        //a=10;//not accessible
        int a=10; //but we can create new variable within the scope of function
    }
}
