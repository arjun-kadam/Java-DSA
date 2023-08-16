package com.basics;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int uInput=scan.nextInt();
//        int flag=0;
//        while(uInput%10!=0){
//            flag+=1;
//            uInput/=10;
//        }
        int flag=(int)Math.log10(uInput)+1;
        System.out.println(flag);
    }
}
