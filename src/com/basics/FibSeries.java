package com.basics;

import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter nth Number For Fibonacci Series: ");
        int uInput=scan.nextInt();
        int a=0,b=1;
        int count=2;
        int temp=0;
        while (count<=uInput){
            temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
