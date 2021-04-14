package com.company.Ex5;

import java.util.Arrays;

public class Ex05_01 {
    public static void main(String[] args) {
        int Arr1[] = new int[10];
        int Arr2[] = new int[10];
        int Arr3[] = new int[]{100, 95, 90, 85, 85};
        char chArr[] = {'a', 'b', 'c'};
    
        for (int i = 0; i < Arr1.length; i++) {
            Arr1[i] = i + 1;
        }
        for (int i = 0; i < Arr2.length; i++) {
            Arr2[i] = (int) (Math.random() * 10) + 1;
        }
        //배열에 저장된 값들을 출력한다.
        for (int i = 0; i < Arr1.length; i++) {
            System.out.print(Arr1[i]+", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(Arr2));
        System.out.println(Arrays.toString(Arr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(Arr3);
        System.out.println(chArr);
        
    }
}
