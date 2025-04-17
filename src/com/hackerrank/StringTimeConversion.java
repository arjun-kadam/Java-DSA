package com.hackerrank;

public class StringTimeConversion {
    public static String timeConversion(String s) {

        if(s.contains("AM")){
            if(s.startsWith("12")){
                System.out.println("here");
                return "00:"+s.substring(3,(s.length()-2));
            }
            return s.substring(0,(s.length()-2));
        }else{

            if(s.startsWith("12")){
                return s.substring(0,(s.length()-2));
            }
            int temp=12+Integer.parseInt((s.substring(0,2)));
            return temp+s.substring(2,(s.length()-2));
        }

    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:01:00PM"));
    }
}
