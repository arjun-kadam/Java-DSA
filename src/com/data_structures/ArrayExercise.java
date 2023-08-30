package com.data_structures;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] arr={12,98,56,54,5,23,58,72};
        System.out.println("Original Array: "+Arrays.toString(arr));
        System.out.println("Swapped Array:  "+Arrays.toString(swap(arr,2,5)));
        System.out.println("Maximum Number is: "+max(arr)+"\nMin Number is: "+min(arr));
        System.out.println("Reversed Array: "+Arrays.toString(reverse(arr)));
    }
    static int[] swap(int[] inArr, int index1, int index2){
        if (index1<0|index1>inArr.length|index2>inArr.length){
            return new int[]{-1};
        }
        for (int i = 0; i < inArr.length; i++) {
            if (i==index1){
                int temp=inArr[index1];
                inArr[index1]=inArr[index2];
                inArr[index2]=temp;
            }
        }
        return inArr;
    }

    static int max(int[] inArr){
        int res=Integer.MIN_VALUE;
        for (int i = 0; i < inArr.length; i++) {
            if(inArr[i]>res){
                res=inArr[i];
            }
        }
        return res;
    }
    static int min(int[] inArr){
        int res=Integer.MAX_VALUE;
        for (int i = 0; i < inArr.length; i++) {
            if(inArr[i]<res){
                res=inArr[i];
            }
        }
        return res;
    }
    static int[] reverse(int []inArr){
        int start=0;
        int end=inArr.length-1;
        for (int i = 0; i < inArr.length; i++) {
            while (end>start){
               swap(inArr,start,end);
               start++;
               end--;
            }
        }
        return inArr;
    }
}
