package com.basics;

import java.util.Scanner;

public class FiboSries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number To print Fibo of that number");
        int n=input.nextInt();
        int num1=0;
        int num2=1;
       // int res=0;
        int temp;
        int count=2;
        while (count<=n){
            temp=num2;
            num2=num1+num2;
            num1=temp;
            count++;
        }
        System.out.println(num2);
    }
}
