package com.data_structures;

public class FindInString {
    public static void main(String[] args) {
       String myString="Accessibility";
       char key='t';
       int flag=0;
       for (char element:myString.toCharArray()){
           if (element==key){
               flag=1;
               break;
           }
       }
       if (flag==1) System.out.println("Character is Found");
       else System.out.println("Character Not Found");
    }
}
