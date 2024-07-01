package com.leetcode;

public class ReplaceDigitChars {
    public static void main(String[] args) {
        String input="a1b2c3d4e";
//        StringBuffer temp=new StringBuffer(input);
//        for (int i = 0; i < input.length()-1; i++) {
//            if (i%2==0){
//               temp.setCharAt(i+1,(char)((input.charAt(i))+(input.charAt(i+1)-'0')));
//            }
//        }

        char[] ans = input.toCharArray();

        for (int i = 1; i < ans.length; i += 2) {
            ans[i] = (char) (ans[i - 1] + (ans[i] - '0'));
        }

        System.out.println(ans);
    }
}
