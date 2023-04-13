package com.basics;
public class ConditionalsAndLooping {
    public static void main(String[] args) {
        // if-else Statements
        int age=17;
        if (age >=18) {
            System.out.println("You are eligible For Voting");
        }else {
            int gap=18-age;
            System.out.println("Kindly Visit After "+ gap + " Years");
        }


        // For Loop
        for(int i=1; i<=5; i+=1){
            System.out.print (i +" ");
        }

        System.out.println();


        // While Loop
        int num=1;
        while (num<=10){
            System.out.print(num +" ");
            num++;
        }

        System.out.println();


        //Do While Loop
        int num2=1;
        do{
            System.out.println("Hello World");
            num2++;
        }while (num2<5);


        // When To Use For Loop & While Loop
        // If you Know How many iterations are their then use For Loop Otherwise Use While Loop
    }
}