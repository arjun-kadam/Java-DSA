package com.leetcode;

public class FindDuplicateNumber {

    public static void main(String[] args) {
//https://leetcode.com/problems/find-the-duplicate-number/description/
        int [] nums={3,1,1,4,2};
        boolean[] flag=new boolean[nums.length];
        for(int i : nums){
            if(flag[i-1]){
                System.out.println(i);
                return;
            }
            flag[i-1]=true;
        }
        System.out.println("Not Dup");
    }
}
