package com.data_structures;

import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            myList.add(i*i);
        }
        myList.set(2,22);
        myList.remove(5);
        System.out.println(myList.get(5));
        System.out.println(myList);
    }
}
