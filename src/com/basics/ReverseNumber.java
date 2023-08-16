package com.basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int uInput = scan.nextInt();
        int reverse = 0;
        while (uInput >0) {
            int remainder = uInput % 10;
            uInput /= 10;
            reverse=reverse*10+remainder;

        }
        System.out.println(reverse);
    }
}