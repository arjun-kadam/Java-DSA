package com.data_structures;

public class MinMax {
    public static void main(String[] args) {
        int []myArray={15,98,25,36,3,56,77,89,12};
        System.out.println("Maximum: "+max(myArray));
        System.out.println("Minimum: "+min(myArray));

    }
    static int max(int[] arr){
        int res=Integer.MIN_VALUE;
        for (int element:arr){
            if (element>res){
                res=element;
            }
        }
        return  res;
    }
    static int min(int[] arr){
        int res=Integer.MAX_VALUE;
        for (int element:arr){
            if (element<res){
                res=element;
            }
        }
        return  res;
    }
}
