package com.data_structures;

public class FindInRange {
    public static void main(String[] args) {
        int []myArray={15,98,25,36,3,56,77,89,12};
        int key=12,start=2,end=4,flag=0;
        for (int i = start; i < end; i++) {
            if (key==myArray[i]){
                flag=1;
                break;
            }
        }
        if (flag==1) System.out.println("Element found in Range");
        else System.out.println("Element Not Found");
    }

}
