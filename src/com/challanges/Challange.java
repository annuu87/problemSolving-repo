package com.challanges;

public class Challange {
    String myStr = "7007";

    public void doStuff(String str) {
        int myNum = 0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Not a number");
        }
        System.out.println("myStr: " + myStr + " myNum: " + myNum);
    }

    public static void main(String[] args) {
        Challange ch = new Challange();
        ch.doStuff("9009");

    }

}