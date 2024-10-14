package com.leetcode;

import java.util.Arrays;

public class RemoveElementArray {

    //https://leetcode.com/problems/remove-element/description/
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=3;

        int k=0;
        for(int element:nums){
            if(element!=val){
                nums[k++]=element;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
