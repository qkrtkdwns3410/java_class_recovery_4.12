package com.company.Ex3;

public class Ex3_9 {
    public static void main(String[] args) {
        
        int a = 1_000_000; //1백만 10의 6제곱
        int b = 2_000_000; //2백만 10의 6제곱
        
        //10의 12제곱 int의범위는 10의 9제곱.
        long c = (long)a * b; //a*b =2,000,000,000,000 ?
        
        System.out.println(c);
        
        
    }
}
