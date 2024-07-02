package com.leetcode;

public class FinalValueOfVariable {
    public static void main(String[] args) {
        //https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

        String[] operations={"++X","++X","X++"};
        String s=String.join(" ",operations);
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='+'){
                count++;
            } else if (s.charAt(i) == '-') {
                count--;
            }
        }

    }
}
