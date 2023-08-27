package com.basics;

import java.util.Scanner;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select Day You Want to See");
        int day =scan.nextInt();
        switch (day) {
            case 1 -> System.out.println("It's Monday");
            case 2 -> System.out.println("It's Tuesday");
            case 3 -> System.out.println("It's Wednesday");
            case 4 -> System.out.println("It's Thursday");
            case 5 -> System.out.println("It's Friday");
            case 6 -> System.out.println("It's Saturday");
            case 7 -> System.out.println("It's Sunday");
            default -> System.out.println("Enter Valid Input");
        }

        switch (day){
            case 1,2,3,4,5 -> System.out.println("It's Week Day");
            case 6,7-> System.out.println("It's Week-end");

        }
    }
}
