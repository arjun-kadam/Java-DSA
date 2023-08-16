package com.basics;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int ans=0;
        while (true) {
            System.out.print("Enter Operation + - * / % ==> ");
            char uInput=scan.next().trim().charAt(0);
            if(uInput=='+'||uInput=='-'||uInput=='*'||uInput=='/'||uInput=='%'){
                System.out.println("Enter Two Nums ==> ");
                int num1=scan.nextInt();
                int num2=scan.nextInt();
                if (uInput == '+') {
                    ans=num1+num2;
                }if (uInput == '-') {
                    ans=num1-num2;
                }if (uInput == '*') {
                    ans=num1*num2;
                }if (uInput == '/') {
                    if(num2==0){
                        System.out.println("ERROR:Can't Be Divided By 0 !!!");
                    }else {
                        ans=num1/num2;
                    }
                }if (uInput == '%') {
                    ans=num1%num2;
                }
            }else if(uInput=='x'||uInput=='X'){
                System.out.println("Exited Successfully :)");
                break;
            }else {
                System.out.println("Enter Valid Choice !!!");
            }
            System.out.println("Ans is: "+ans);
        }


    }
}
