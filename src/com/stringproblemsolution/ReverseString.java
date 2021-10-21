package com.stringproblemsolution;

public class ReverseString {
    /*Reverse a given String in log(n) time using this method
    * */
    public static String reverseString(String value){
        char[] temp=value.toCharArray();
        for(int i=0,j=value.length()-1;i<j;i++,j--){
            char tempChar=temp[i];
            temp[i]=temp[j];
            temp[j]=tempChar;
        }
        return String.valueOf(temp);
    }
    public static void main(String[] args){
        String value="Hello World";
        System.out.println(reverseString(value));
    }
}
