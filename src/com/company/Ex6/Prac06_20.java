package com.company.Ex6;

import java.util.Arrays;

public class Prac06_20 {
    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -999999;
        }
        int maxArr = 0;
        int tmp = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxArr) {
                tmp = arr[i];
                arr[i] = maxArr;
                maxArr = tmp; //바꾸기..;;
            }
        }
        return maxArr;
    }
    
    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값:" + max(data));
        System.out.println("최대값:" + max(null));
        System.out.println("최대값:" + max(new int[]{})); //크기가 0인 배열
    }
}
