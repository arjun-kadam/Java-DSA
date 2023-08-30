package com.data_structures;

import java.util.Arrays;

public class TwoDArrayInJava {
    public static void main(String[] args) {
        //2-D Array
        int[][] towDArray = new int[3][];
        int[][] towDArray2 = {
                {1, 3, 4,},
                {3, 5, 6},
                {43, 54, 67}
        };
        for (int myarr[] : towDArray2) {
            System.out.println(Arrays.toString(myarr));
        }
    }
}
