package com.data_structures;

public class LinearSearch {
    public static void main(String[] args) {
        //Linear Search is Used To Search Element In Array By Comparing Every and Each Element
        int []myArray={15,98,25,36,3,56,77,89,12};
        search(myArray,7);

    }
    static void search(int[]arr,int key){
        int flag=0;
        for (int element : arr) {
            if (element == key){
                flag=1;
                break;
            }
        }
        if (flag==1) System.out.println(key+" is Present");
        else System.out.println("Element Not Found");
    }
}

