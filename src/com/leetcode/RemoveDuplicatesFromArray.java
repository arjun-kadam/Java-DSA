package com.leetcode;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int k = 0;
        for (int x : nums) {
            if (k == 0 || x != nums[k - 1]) {
                nums[k++] = x;
            }
        }
        System.out.println(k);
    }
}
