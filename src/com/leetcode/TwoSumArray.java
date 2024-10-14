package com.leetcode;

import java.util.Arrays;

public class TwoSumArray {
   // https://leetcode.com/problems/two-sum/description/
   public static void main(String[] args) {
       int[] nums={2,7,11,15};
       int target=9;

       int[] res=new int[2];
       for(int i=0;i<=nums.length-1;i++){
           for(int j=1;j<=nums.length-1;j++){
               if(nums[i]+nums[j]==target&&(i!=j)){
                   res[0]=i;
                   res[1]=j;
               }
           }
       }
       System.out.println(Arrays.toString(res));
   }
}
