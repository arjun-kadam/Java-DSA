package com.data_structures;

import java.util.*;
public class ArraysInJava {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        //Collection of Data Types
        int []nums=new int[5];
        nums[0]=10;
        nums[1]=20;
        nums[2]=30;
        nums[3]=40;

        //Accessing Single Elements
        System.out.println(nums[2]);
        System.out.println(Arrays.toString(nums));

        //Taking Input in Array
        int []rollNo=new int[5];
        for (int i = 0; i < rollNo.length; i++) {
            rollNo[i]=scan.nextInt();
        }

        System.out.println("Without Enhanced For Loop");
        for (int i = 0; i < rollNo.length; i++) {
            System.out.print(rollNo[i]+" ");
        }
        System.out.println();


        System.out.println("With Enhanced For Loop");
        for(int its:rollNo){
            System.out.print(its+" ");
        }
        System.out.println();

        System.out.println("Using toString Method");
        System.out.println(Arrays.toString(rollNo));
    }

}
