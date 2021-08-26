package com.atnjupt.java;

/**
 * @author Wizarder
 * @create 2021-07-13 14:41
 */
public class HelloMaven {
    public static  int add(int n1,int n2){
        return n1+n2;
    }

    public static void main(String[] args) {
        int res = add(10, 20);
        System.out.println("10+20="+res);
    }
}
