package com.company.Ex6;

import java.util.Arrays;

public class Prac06_17 {
    
    public static int[] shuffle(int[] arr){
        if (arr == null || arr.length == 0) { //int 배열을 매개변수로 받아서 null값혹은 내부배열의 길이가 0인 경우 에는 arr그대로 리턴
            return arr;
        }
    
        for (int i = 0; i < arr.length; i++) {
            int j = (int) (Math.random() * arr.length);
            
            //arr[i]와  arr[j]값을 서로 바꾼다
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            
        }
        return arr;
    }
    
    
    
    public static void main(String[] args) {
        int original[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));
    
        int result[] = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}
