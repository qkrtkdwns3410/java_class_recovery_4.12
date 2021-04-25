package com.company.Ex11;

import java.util.Arrays;
import java.util.regex.Matcher;

public class Ex11_6 {
    public static void main(String[] args) {
        int arr7[] = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println("arr7=" + Arrays.toString(arr7));
    
        Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1);
        System.out.println("arr7=" + Arrays.toString(arr7));
    
        for (int i : arr7) { //향상된 for문입니다.
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
            
            
            
        }
    }
}












