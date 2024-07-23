package com.leetcode;

public class ThreeConsecutiveOdd {


    public static void main(String[] args) {
// https://leetcode.com/problems/three-consecutive-odds/description/

//        int len = 0;
//        for (int it : arr) {
//            len = (it & 1) != 0 ? len + 1 : 0;
//            if (len == 3) return 1;
//        }
//        return 0;

        int [] arr={1,2,34,3,4,5,4,23,12};
        int count=0;
        for(int i=0;i<=arr.length-2;i++){
            if(arr[i]%2!=0&&arr[i+1]%2!=0&&arr[i+2]%2!=0){
                System.out.println("Yes Given Array Have 3 Consecutive Odds");
                return;
            }
        }
        System.out.println("Yes Given Array Don't Have 3 Consecutive Odds");

    }
}
