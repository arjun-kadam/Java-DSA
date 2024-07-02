package com.leetcode;

public class PermutationDifference {
    public static void main(String[] args) {

        // https://leetcode.com/problems/permutation-difference-between-two-strings/
        String s="abcde";
        String t="edbac";
        int sum=0;
        for(int i=0;i<s.length();i++){
            System.out.println((i-t.indexOf(s.charAt(i),0)));
        }



//        int psum=0;
//        for (int i = 0; i <= s.length() - 1; i++) {
//            for (int j = 0; j <= t.length()-1; j++) {
//                if (s.charAt(i)==t.charAt(j)){
//                    psum+=Math.abs(i-j);
//                }
//            }
//        }
        System.out.println(sum);
    }
}
