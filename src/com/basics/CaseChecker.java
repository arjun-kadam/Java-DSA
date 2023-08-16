package com.basics;

import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner uInput=new Scanner(System.in);
        System.out.println("Enter Any Character: ");
        char myString=uInput.next().trim().charAt(0);
        if(myString>='a'&& myString<= 'z'){
            System.out.println("LowerCase Letter");
        }else {
            System.out.println("UpperCase Letter");
        }
    }
}
