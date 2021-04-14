package com.company.Ex4;

public class Pc4_6 {
    public static void main(String[] args) {
        int i = 1, j = 1; //눈
        
        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= 6; j++) {
                if (i+j ==6){
                    System.out.printf("%d, %d\n", i, j);
                }
                
            }
        }
    }
}
