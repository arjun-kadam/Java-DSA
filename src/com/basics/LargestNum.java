package com.basics;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner uInput=new Scanner(System.in);
        System.out.println("Enter Any Three Numbers: ");
        int num1=uInput.nextInt();
        int num2=uInput.nextInt();
        int num3=uInput.nextInt();

        // Way 1:
//        int max=num1;
//        if(num2>max){
//            max=num2;
//        }
//        if (num3>max){
//            max=num3;
//        }
//        System.out.println("Largest is: "+max);

//        Way 2:
        System.out.println("Largest Num is "+Math.max(num1,Math.max(num2,num3)));

    }
}
