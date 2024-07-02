package com.leetcode;

import java.util.Arrays;

public class DefangeIPAddress {
   // https://leetcode.com/problems/defanging-an-ip-address/
    public static void main(String[] args) {
        String ip="255.100.50.0";
        String ch=ip.replace(".","[.]");
        System.out.println(ch);
    }
}

