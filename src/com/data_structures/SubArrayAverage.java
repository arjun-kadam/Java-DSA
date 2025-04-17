package com.data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayAverage {
    public static void main(String[] args) {
        int[] arr={1, 3, 2, 6, 5, 4, 1, 8, 2};
        int k=5;
        List<Integer> res=subArrayAverage(arr,k);
        System.out.println("Sub Array average is"+ res.toString());
    }
    public static List<Integer> subArrayAverage(int[] arr, int k){
        List<Integer> average=new ArrayList<>();
        int windowAverage=0;
        for (int i = 0; i < k; i++) {
            windowAverage+=arr[i];
        }
        average.add(windowAverage/k);
        for (int i = k; i < arr.length; i++) {
            windowAverage+=arr[i]-arr[i-k];
            average.add(windowAverage/k);
        }
        return average;
    }
}
