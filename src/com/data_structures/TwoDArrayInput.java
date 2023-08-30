package com.data_structures;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayInput {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Numbers ");
        int [][]nums=new int[3][3];
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col]=scan.nextInt();
            }
        }
        for(int row=0;row<nums.length;row++){
            for(int col=0;col<nums[row].length;col++){
                System.out.println(nums[row][col]);
            }
        }

        for (int[] rno : nums) {
            System.out.println(Arrays.toString(rno));
        }
    }
}
