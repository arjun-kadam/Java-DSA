package com.data_structures;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] myArray={
                {45,6,12},
                {55,88,33},
                {85,99,44}
        };
        int key=78,flag=0;
        for(int[] arr:myArray){
            for (int elements:arr){
                if(key==elements){
                    flag=1;
                    break;
                }
            }
        }
        if (flag==1) System.out.println("Element Found ");
        else System.out.println("Element Not Found");
    }
}
