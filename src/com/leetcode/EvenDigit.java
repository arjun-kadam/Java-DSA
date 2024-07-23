package com.leetcode;

public class EvenDigit {
    public static void main(String[] args) {
        int []arr={12,345,2,6,7896};
        System.out.println("Total Even Digit Numbers are: "+findNumbers(arr));
    }

    public static int digits(int num){
        return (int)Math.log10(num)+1;
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
          if (digits(num)%2==0){
              count++;
          }
      }
        return count;
    }
}
