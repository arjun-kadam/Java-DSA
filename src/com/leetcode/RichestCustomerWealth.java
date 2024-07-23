package com.leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][]arr={{8,5,6},{6,3,8}};
        System.out.println("Max Wealth : "+maximumWealth(arr));

    }
    public static int maximumWealth(int[][] acc){

        int max=Integer.MIN_VALUE;
        for(int row=0;row<acc.length;row++){
            int sum=0;
            for (int col=0;col<acc[row].length;col++){
                sum+=acc[row][col];
            }

            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
