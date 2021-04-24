package com.company.Ex5;

public class prac9_94 {
    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }
    
    public static boolean contains(String src, String target) {
        int ans = 0;
        ans = src.indexOf(target);
        if (ans != -1) {
            return true;
        } else {
            return false;
        }
    }
}
