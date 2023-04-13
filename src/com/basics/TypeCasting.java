package com.basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Typecasting ==> Converting One Data Type Into Another
        System.out.println("Enter Any Integer");
        float num =input.nextInt();//This is Implicit Type Casting Done By Java Itself
        System.out.println("You Entered: " +num);

        // Explicit Type Casting Done By User Forcefully
        int num2=(int)(44.67);
        System.out.println("Force Conversion: "+num2);

        //Type Promotion --> Promoted One Type into another to avoid data type size limit
        byte a=50;
        byte b=40;
        byte c=100;
        int d=a*b/c;
        System.out.println(d);

        // In Above Code The Size of byte is 256 but while doing multiplication of a*b it become 2000 (out of byte length) hence byte data type is promoted to int
        // Here is Condition 1) All Smaller data type is promoted into larger one 2) if any operand is greater than others then type conversion is promoted in greater data type

        // Java Supports Unicode Hence We can print Any Unicode Supported Languages
        System.out.println("मी मराठी आहे ");
    }
}
