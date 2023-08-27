package com.basics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        myFun(1,3,45,6);
        myFun2(10,20,"Arjun","Kunal");
    }

     static void myFun(int ...v) {
         System.out.println(Arrays.toString(v));
    }
    static void myFun2(int a,int b, String ...myString){
        System.out.println(b+" "+a+" "+Arrays.toString(myString));
    }

}
