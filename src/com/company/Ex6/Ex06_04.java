package com.company.Ex6;

public class Ex06_04 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.sub(5L, 3L);
        long result3 = mm.multi(5L, 3L);
        double result4 = mm.div(5L, 3L);
    
        System.out.println("add(5L,3L) : "+result1);
        System.out.println("sub(5L,3L) : "+result2);
        System.out.println("mul(5L,3L) : "+result3);
        System.out.printf("div(5L,3L) : %.2f",result4);
    }
}

class MyMath {
    long add(long a, long b) {
        return a + b;
    }
    long sub(long a, long b) {
        return a - b;
    }
    long multi(long a, long b) {
        return a * b;
    }
    double div(double a, double b) {
        return a / b;
    }
    
    
}
